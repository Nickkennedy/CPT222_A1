package au.edu.rmit.cpt222.model;

import java.util.Collection;

import au.edu.rmit.cpt222.model.interfaces.GameEngine;
import au.edu.rmit.cpt222.model.interfaces.GameEngineCallback;
import au.edu.rmit.cpt222.model.interfaces.Player;
import au.edu.rmit.cpt222.test.harness.TestHarness.ResultCallback;

public class GameEngineImpl implements GameEngine {
	GameStatus GameStatus;
	int dice = NUM_OF_DICE;
	public Collection<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addPlayer1(Player theGambler) {
		// TODO Auto-generated method stub
		
	}

	public boolean removePlayer(String playerId) {
		return false;
		// TODO Auto-generated method stub
		
	}

	public void placeBet(Player theCasual, int defaultBet) {
		// TODO Auto-generated method stub
		
	}

	public void rollPlayer(Player theCasual, int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
		
	}

	public void calculateResult() {
		// TODO Auto-generated method stub
		
	}

	public void addGameEngineCallback(ResultCallback resultCallBack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String addPlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getPlayer(String playerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollHouse(int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerPoints(String playerId, int totalPoints) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGameEngineCallback(GameEngineCallbackImpl gameEngineCallbackImpl) {
		// TODO Auto-generated method stub
		
	}

}
