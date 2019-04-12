package au.edu.rmit.cpt222.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javafx.scene.control.ToolBar;

public class ToolBarController implements ActionListener {
	
	private ToolBar toolBar;
	private MainController controller;
	
	public ToolBarController(ToolBar toolBar) {
		this.toolBar = toolBar;
		// cunts proper fucked
		//this.controller =  this.toolBar.getMainView().getMainController();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//listen for button and actions when invoked
		//1) e.getSource()
		//2) e.getActionCommand() 
		
		if(e.getActionCommand().equals("Roll")) {
			System.out.println("Roll");
			this.controller.roll();
		}else if (e.getActionCommand().equals("Increase Bet")) {
			this.controller.roll();
			System.out.println("Increase Bet");
		}else if (e.getActionCommand().equals("Decrease Bet")) {
			this.controller.roll();
			System.out.println("Decrease Bet\"");
		}
	}

}
