package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton suprise;
	ArrayList<Song> stufsong = new ArrayList<Song>();
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
				ArrayList<Song> songList = new ArrayList<Song>();
			
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		_06_IPodShuffle ipod = new _06_IPodShuffle();
		ipod.getGoing();
ipod.initializeSong();
		
	}
	void getGoing() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		suprise = new JButton();
		suprise.setText("Suprise Me!");
		panel.add(suprise);
		frame.pack();
suprise.addActionListener(this);
	}
void initializeSong() {
	stufsong.add(new Song("demo.mp3"));
	stufsong.add(new Song("BASS.wav"));
	stufsong.add(new Song("cymbal.wav"));
	  
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed==suprise) {
			int randomness = new Random().nextInt(stufsong.size());
			  stufsong.get(randomness).play();
			 
		
		
		}
	}
}