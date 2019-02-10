package _06_Intro_To_Hash_Maps;

import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton search;
	JButton view;
	JButton remove;
	JLabel label;
	public static void main(String[] args) {
		_02_LogSearch ha = new _02_LogSearch();
		ha.getGoing();
		

	}
	void getGoing() {
		frame = new JFrame();
		frame.setVisible(true);
		
		panel = new JPanel();
		frame.add(panel);
		panel.setSize(400,600);
		add = new JButton();
		search = new JButton();
		view = new JButton();
		remove = new JButton();
		add.setText("add entry");
		search.setText("Search by ID");
		view.setText("View List");
		remove.setText("Remove entry");
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		label = new JLabel();
		panel.add(label);
		frame.pack();
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
	
	}
	HashMap<Integer,String> stuff = new HashMap<Integer,String>();
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	JButton	ButtonPressed =(JButton)e.getSource();
	if(ButtonPressed ==add) {
	String id =JOptionPane.showInputDialog("Enter an ID number");
	int ID = Integer.parseInt(id);
	String name =JOptionPane.showInputDialog("Enter a name");
	stuff.put(ID, name);}
	
	else if(ButtonPressed ==search) {
		String neID=JOptionPane.showInputDialog("Enter an ID number");
		int n = Integer.parseInt(neID);
		if(stuff.get(n)==null) {
			label.setText("this entry does not exist");}
			else {
				label.setText(stuff.get(n));
			}}
		
	else if(ButtonPressed==view) {
	for (int key: stuff.keySet()) {
	
		JOptionPane.showMessageDialog(null, "ID: " + key +"  Name: "+ stuff.get(key));
	}
	}
	else if(ButtonPressed ==remove) {
		String r =JOptionPane.showInputDialog("enter an Id you would like removed");
		int re = Integer.parseInt(r);
		if(stuff.get(re) ==null) {
			label.setText("this entry does not exist");
		}
		else {
			label.setText(stuff.remove(re));
		}
	}

		}
		
		}
	
