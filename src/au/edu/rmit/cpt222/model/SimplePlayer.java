package au.edu.rmit.cpt222.model;

import au.edu.rmit.cpt222.model.exceptions.InsufficientFundsException;
import au.edu.rmit.cpt222.model.interfaces.DicePair;
import au.edu.rmit.cpt222.model.interfaces.GameEngine.GameStatus;
import au.edu.rmit.cpt222.model.interfaces.Player;

public class SimplePlayer implements Player {
	public static String id;
	public static String name;
	public static int bank;
	
	public SimplePlayer(String id, String name, int bank) {
		SimplePlayer.id = id;
		SimplePlayer.name = name;
		SimplePlayer.bank = bank;
	}
	public String getId() {
		return id;
	}
	@SuppressWarnings("static-access")
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@SuppressWarnings("static-access")
	public void setName(String name) {
		this.name = name;
	}
	public int getBank() {
		return bank;
	}
	@SuppressWarnings("static-access")
	public void setBank(int bank) {
		this.bank = bank;
	}
	@Override
	public int getBet() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public GameStatus getGameResult() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPlayerId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPlayerName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public DicePair getRollResult() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void placeBet(int bet) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resetBet() throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setGameResult(GameStatus status) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPlayerName(String playerName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPoints(int points) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setRollResult(DicePair rollResult) {
		// TODO Auto-generated method stub
		
	}

}
