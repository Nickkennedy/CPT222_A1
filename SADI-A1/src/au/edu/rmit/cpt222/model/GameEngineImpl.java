package au.edu.rmit.cpt222.model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import au.edu.rmit.cpt222.model.exceptions.InsufficientFundsException;
import au.edu.rmit.cpt222.model.interfaces.DicePair;
import au.edu.rmit.cpt222.model.interfaces.GameEngine;
import au.edu.rmit.cpt222.model.interfaces.GameEngineCallback;
import au.edu.rmit.cpt222.model.interfaces.Player;

public class GameEngineImpl implements GameEngine {
	//house delay values
	public final static int INITIAL_DELAY = 1;
	public final static int FINAL_DELAY = 100;
	public final static int DELAY_INCREMENT = 20;
	Random rand = new Random();
	
	private Map<String, Player> players = new ConcurrentHashMap<String, Player>();
	private Set<GameEngineCallback> geCallback = Collections.newSetFromMap(new ConcurrentHashMap<GameEngineCallback, Boolean>());
	private DicePair houseDice;
	
	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		geCallback.add(gameEngineCallback);

	}

	@Override
	public String addPlayer(Player player) {
		// TODO: check if playerID is unique first
		this.players.put(player.getPlayerId(), player);
		return player.getPlayerId();
	}

	@Override
	public void calculateResult() {
		
		rollHouse(this.INITIAL_DELAY,this.FINAL_DELAY, this.DELAY_INCREMENT);
	
		//Should i be setting roll value here? 
		
		processBets();

	}

	private void processBets() {
		// TODO: goes through all players and applies win/lose/ draw outcome to update game status and betting values
		
		// TODO: call GameEngineCallback.gameResult(Player,GameStatus,GameEngine) with final result for EACH player.
		// TODO: broadcast the results of each player in the game
		
		for (GameEngineCallback geCallback : this.geCallback)
			for(Player player : this.players.values())
				geCallback.gameResult(player, player.getGameResult(), this);
	}

	@Override
	public Collection<Player> getAllPlayers() {
		return Collections.unmodifiableCollection(new ArrayList <Player>(players.values()));
	}

	@Override
	public Player getPlayer(String playerId) {
		return this.players.get(playerId);
	}

	@Override
	public void placeBet(Player player, int betPoints) throws InsufficientFundsException {
		if(players.containsValue(player.getPlayerId())){
			throw new IllegalArgumentException ("ERROR: Player does not exist");
		}
		else if (betPoints <= 0 ) {
			throw new IllegalArgumentException ("ERROR: Invalid Bet Amount");
		}
		else if (betPoints > player.getPoints() ) {
			throw new IllegalArgumentException ("ERROR: Invalid Bet Amount");
		}
		this.getPlayer(player.getPlayerId()).placeBet(betPoints);
	}

	@Override
	public void removeGameEngineCallback(GameEngineCallback gameEngineCallback) {
		geCallback.removeAll((Collection<?>) gameEngineCallback);

	}

	@Override
	public boolean removePlayer(String playerId) {
		if(this.players.containsKey(playerId)) {
			this.players.remove(playerId);
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void rollHouse(int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollPlayer(Player player, int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPlayerPoints(String playerId, int totalPoints) {
		// TODO Auto-generated method stub
	}

}
