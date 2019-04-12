package au.edu.rmit.cpt222.driver;

import javax.swing.SwingUtilities;

import au.edu.rmit.cpt222.model.GameEngineImpl;
import au.edu.rmit.cpt222.model.interfaces.GameEngine;
import au.edu.rmit.cpt222.view.MainView;

public class Ass1Driver {

	public static void main(String[] args) {
		//Initialise the model
		GameEngine model = new GameEngineImpl();
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				//Initialise the view and map of model
				MainView mainView = new MainView(model);
				mainView.setVisible(true);
			}
		});

	}
}

/**

MVC
Model - Data manipulation and game rules/logic
View - The actual user interface elements
Controller -
	1) Provides a mapping between the View and the Model
	2) respond to end user interactions

View -> Controller -> Model

=== TWO ways to call data back ===
1) when the model returns data to the display in the view: 
View <- Controller <- Model

2) when the model performs the game execution
View <- Controller <- Callback <- Model

All communication between the controller and the model should be preferred via the GameEngine

*/