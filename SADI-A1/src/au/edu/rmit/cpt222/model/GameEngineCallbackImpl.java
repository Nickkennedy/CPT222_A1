package au.edu.rmit.cpt222.model;

import au.edu.rmit.cpt222.model.interfaces.DicePair;
import au.edu.rmit.cpt222.model.interfaces.GameEngine;
import au.edu.rmit.cpt222.model.interfaces.GameEngine.GameStatus;
import au.edu.rmit.cpt222.model.interfaces.GameEngineCallback;
import au.edu.rmit.cpt222.model.interfaces.Player;
import java.util.Random;

public class GameEngineCallbackImpl implements GameEngineCallback {

	Random rand = new Random();
	
	@Override
	public void gameResult(Player player, GameStatus result, GameEngine engine) {
		System.out.println(player.getPlayerName());
	}

	@Override
	public void houseRoll(DicePair dicePair, GameEngine engine) {
		// TODO Auto-generated method stub
	}

	@Override
	public void houseRollOutcome(DicePair result, GameEngine engine) {
		// TODO Auto-generated method stub
	}

	@Override
	public void playerRoll(Player player, DicePair dicePair, GameEngine engine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playerRollOutcome(Player player, DicePair result, GameEngine engine) {
		// TODO Auto-generated method stub
	}

}
