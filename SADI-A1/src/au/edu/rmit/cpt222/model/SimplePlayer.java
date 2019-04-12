package au.edu.rmit.cpt222.model;

import java.util.UUID;

import au.edu.rmit.cpt222.model.exceptions.InsufficientFundsException;
import au.edu.rmit.cpt222.model.interfaces.DicePair;
import au.edu.rmit.cpt222.model.interfaces.GameEngine.GameStatus;
import au.edu.rmit.cpt222.model.interfaces.Player;

public class SimplePlayer implements Player {

	private String id;
	private String name;
	private int points;
	private int bet;
	private GameStatus gameResult;
	private DicePair rollResult;
	
	public SimplePlayer(String name) {
		this(UUID.randomUUID().toString(),name,Player.DEFAULT_NUM_POINTS);
	}
	
	public SimplePlayer(String id, String name) {
		this(id,name,Player.DEFAULT_NUM_POINTS);
	}
	
	public SimplePlayer(String id, String name, int points) {
		this.id=id;
		this.name = name;
		this.points = points;
	}

	@Override
	public int getBet() {
		return bet;
	}

	@Override
	public GameStatus getGameResult() {
		return this.gameResult;
	}

	@Override
	public String getPlayerId() {
		return id;
	}

	@Override
	public String getPlayerName() {
		return name;
	}

	@Override
	public int getPoints() {
		return points;
	}

	@Override
	public DicePair getRollResult() {
		return this.rollResult;
	}

	@Override
	public void placeBet(int bet) throws InsufficientFundsException {
		assert bet >= 0 : "Invalid bet value";

		if(bet < this.points)
			this.bet = bet;
		else 
			throw new InsufficientFundsException();
	}

	@Override
	public void resetBet() throws InsufficientFundsException {
		if(Player.DEFAULT_NUM_POINTS < this.points)
			this.bet = Player.DEFAULT_BET;
		else 
			throw new InsufficientFundsException();
	}

	@Override
	public void setGameResult(GameStatus status) {
		this.gameResult = status;
	}

	@Override
	public void setPlayerName(String playerName) {
		this.name = playerName;
	}

	@Override
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public void setRollResult(DicePair rollResult) {
		this.rollResult = rollResult;
	}

	@Override
	public String toString() {
		StringBuilder resultString = new StringBuilder();
		resultString.append("INFO: Player: id= ");
		resultString.append(this.id);
		resultString.append(" name= ");
		resultString.append(this.name);
		resultString.append(", intermediate roll= Dice 1: ");
		/**
		resultString.append(this.rollResult.getDice1());
		resultString.append(", Dice 2: ");
		resultString.append(this.rollResult.getDice2());
		resultString.append(" ... Total: ");
		resultString.append(this.rollResult.getTotalScore());
		resultString.append(", game outcome= ");
		resultString.append(this.gameResult);
		resultString.append(", Total: ");
		resultString.append(this.rollResult.getTotalScore());
		*/
		return resultString.toString();
	}
}
