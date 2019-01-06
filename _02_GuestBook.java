package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton ViewName;
public static void main(String[] args) {
	_02_GuestBook guest = new _02_GuestBook();
	guest.getGoing();
}	
void getGoing() {
	frame = new JFrame();
	frame.setVisible(true);
	panel = new JPanel();
	frame.add(panel);
	addName = new JButton();
	ViewName = new JButton();
	addName.setText("Add Name");
	ViewName.setText("view Names");
	panel.add(addName);
	panel.add(ViewName);
	frame.pack();
	addName.addActionListener(this);
	ViewName.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton ButtonPressed = (JButton)e.getSource();
	ArrayList<String> names = new ArrayList<String>();

	if(ButtonPressed == addName) {
	String name=	JOptionPane.showInputDialog("Enter a Name");
		names.add(name);
	}
	 if(ButtonPressed ==ViewName) {
System.out.println();
		
	}
}
}
