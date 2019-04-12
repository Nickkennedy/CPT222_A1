package au.edu.rmit.cpt222.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HistoryBox extends JPanel {
	private MainView mainView;
	
	JLabel[] label = new JLabel[10];
	
	public HistoryBox(MainView mainView) {
		
		this.setBackground(Color.LIGHT_GRAY);
		this.mainView = mainView;
		this.add(new JLabel ("   History   "));
		
		for (int i = 0; i < 10; i++) {
		    label[i] = new JLabel();
		    //fucker doesnt loop down
		    label[i].setText(i+ ") ");
		    this.add(this.label[i]);
		}
	}
}
