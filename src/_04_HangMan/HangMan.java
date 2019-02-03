package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	
	JFrame frame;
JPanel panel;
JLabel label;
	public static void main(String[] args) {
	
	HangMan man = new HangMan();
	man.getGoing();
		
	}
	void getGoing() {
		String hi=	JOptionPane.showInputDialog("Type in a number from 0-266:");
	
		Utilities u = new Utilities();
	
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		label = new JLabel();
		panel.add(label);
		int s = Integer.parseInt(hi);
		for(int i =0;i<s;i++) {
			String h = u.readRandomLineFromFile("dictionary.txt");
			label.setText(h);
			
		}
		frame.pack();
	}
	
}
