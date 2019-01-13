package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewName;
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	String name ;
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		_02_GuestBook guestbook = new _02_GuestBook();
		guestbook.getGoing();
	}
	void getGoing() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		addName = new JButton();
		viewName = new JButton();
		addName.setText("add Name");
		viewName.setText("View Names");
		panel.add(addName);
		panel.add(viewName);
		frame.pack();
		addName.addActionListener(this);
		viewName.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed==addName) {
	name =	JOptionPane.showInputDialog("enter a name");
			names.add(name);
		}
		else if(buttonPressed==viewName) {
			for (int i = 0; i < names.size(); i++) {
					name = names.get(i);
					JOptionPane.showMessageDialog(null,"Guest#" + i + ":  " + name);
			}
		}
	}
	
}
