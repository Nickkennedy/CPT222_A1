package au.edu.rmit.cpt222.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GamePanel extends JPanel {
	
	private MainView mainView;
	
	// testing
	private JLabel playername = new JLabel("Wecome player: ");
	private JLabel betAmount = new JLabel("Your Betting Amount:");
	private JLabel balance = new JLabel("Your Balance Amount: ");
	//private JTextField test = new JTextField(20);
	
	public GamePanel(MainView mainView) {
		this.setBackground(Color.WHITE);
		this.mainView = mainView;
		this.add(this.playername);
		this.add(this.betAmount);
		this.add(this.balance);
		//this.add(this.test);
		
	}
	
	// use to update the view method
	public void updateStatus(String playerID) {
		this.playername.setText(playerID);
	}

}
