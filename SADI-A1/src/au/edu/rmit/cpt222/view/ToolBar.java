package au.edu.rmit.cpt222.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import au.edu.rmit.cpt222.controller.ToolBarController;

public class ToolBar extends JPanel {
	
	private JButton roll;
	private JButton increase;
	private JButton decrease;
	private ToolBarController controller;
	private MainView mainView;
	
	public ToolBar(MainView mainView) {
		this.setBackground(Color.LIGHT_GRAY);
		
		this.mainView = mainView;
		//this.controller = new ToolBarController(this);

		this.increase = new JButton("Increase Bet");
		this.increase.setActionCommand("Increase Bet");
		add(this.increase);
		
		this.decrease = new JButton("Decrease Bet");
		this.decrease.setActionCommand("Decrease Bet");
		add(this.decrease);
		
		this.roll = new JButton("Roll");
		this.roll.setActionCommand("Roll");
		add(this.roll);
		
		this.roll.addActionListener(this.controller);
		this.increase.addActionListener(this.controller);
		this.decrease.addActionListener(this.controller);
	}

	public MainView getMainView() {
		return this.mainView;
	}
}
