package au.edu.rmit.cpt222.model;

import au.edu.rmit.cpt222.controller.MainController;
import au.edu.rmit.cpt222.model.interfaces.DicePair;
import au.edu.rmit.cpt222.model.interfaces.GameEngine;
import au.edu.rmit.cpt222.model.interfaces.GameEngine.GameStatus;
import au.edu.rmit.cpt222.model.interfaces.GameEngineCallback;
import au.edu.rmit.cpt222.model.interfaces.Player;

public class GUIcallbackImpl implements GameEngineCallback {
	
	private MainController controller;

	public GUIcallbackImpl(MainController mainController) {
		this.controller = mainController;
	}

	@Override
	public void gameResult(Player player, GameStatus result, GameEngine engine) {
		// TODO Auto-generated method stub
		
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

	public MainController getMainController() {
		return this.controller;
	}

	public void setMainController(MainController mainController) {
		this.controller = mainController;
	}

}
