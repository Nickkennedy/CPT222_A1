package au.edu.rmit.cpt222.controller;

import au.edu.rmit.cpt222.model.GUIcallbackImpl;
import au.edu.rmit.cpt222.model.SimplePlayer;
import au.edu.rmit.cpt222.model.interfaces.GameEngine;
import au.edu.rmit.cpt222.model.interfaces.Player;
import au.edu.rmit.cpt222.view.MainView;

public class MainController {
	
	private MainView mainView;
	private GameEngine model;

	public MainController(MainView mainView) {
		this.mainView = mainView;
		this.model = mainView.getModel();
		this.model.addGameEngineCallback(new GUIcallbackImpl(this));
		// For Ass 2
		populateModel();
	}
	
	// Methods of calling different model functions
	public void roll() {
		this.model.calculateResult();
	}
	//place methods here for asking to view to update the UI
	
	public void updateResult(String playerID) {
		this.mainView.getGamePanel().updateStatus(playerID);
	}
	
	// test method - not needed in assignment
	private void populateModel() {
		// two sample players
		Player theshark = new SimplePlayer("1","The Shark", 566565);
		Player theRoller = new SimplePlayer("2","The Roller", 654654);
		
		// add to model
		this.model.addPlayer(theshark);
		this.model.addPlayer(theRoller);
	}

}
