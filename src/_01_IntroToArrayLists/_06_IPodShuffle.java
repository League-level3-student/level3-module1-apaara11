package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


//Copyright The League of Amazing Programmers, 2015



public class _06_IPodShuffle{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
		Song s= new Song("demo.mp3");
		
				
		
				
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
		Song girls = new Song("Girls.mp3");
		Song umbrella = new Song("Umbrella.mp3");
		Song without = new Song("Without.mp3");
		
		ArrayList<Song> playList = new ArrayList<Song>();
		playList.add(girls);
		playList.add(umbrella);
		playList.add(without);
		
		
		JOptionPane.showMessageDialog(null, "Surprise Me!");
		
		int index = new Random().nextInt(3);
		playList.get(index).play();
		
		}
}