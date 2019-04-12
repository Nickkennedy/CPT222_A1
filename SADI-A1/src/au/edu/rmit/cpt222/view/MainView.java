package au.edu.rmit.cpt222.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import au.edu.rmit.cpt222.controller.MainController;
import au.edu.rmit.cpt222.model.interfaces.GameEngine;

public class MainView extends JFrame {
	
	private GameEngine model;
	
	private MainController controller;
	
	private ToolBar toolBar;
	private GamePanel gamePanel;
	private HistoryBox historyBox;
	private GameMenuBar menuBar;
	

	public MainView(GameEngine model) {
		super("s3674937 - CPT222 Ass 1");
		this.setModel(model);
		intitview();
	}
	
	public GameMenuBar getGameMenuBar() {
		return this.menuBar;
	}

	public HistoryBox getHistoryBox() {
		return this.historyBox;
	}

	public void setHistoryBox(HistoryBox historyBox) {
		this.historyBox = historyBox;
	}

	public GamePanel getGamePanel() {
		return this.gamePanel;
	}

	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	public ToolBar getToolbar() {
		return this.toolBar;
	}

	public void setToolbar(ToolBar toolbar) {
		this.toolBar = toolbar;
	}

	public MainController getController() {
		return this.controller;
	}

	public void setController(MainController controller) {
		this.controller = controller;
	}

	public GameEngine getModel() {
		return this.model;
	}

	public void setModel(GameEngine model) {
		this.model = model;
	}
	
	private void intitview() {
		// set UI Basis
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		this.controller = new MainController(this);
		
		// initalise sub-views
		this.toolBar = new ToolBar(this);
		this.gamePanel = new GamePanel(this);
		this.historyBox = new HistoryBox(this);
		this.menuBar = new GameMenuBar(this);
		
		// add/display sub-views
		add(this.toolBar,BorderLayout.SOUTH);
		add(this.gamePanel,BorderLayout.CENTER);
		add(this.historyBox,BorderLayout.WEST);
		
		this.setJMenuBar(this.menuBar);
	}
}
