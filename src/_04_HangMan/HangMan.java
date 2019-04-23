/*When the program starts, it will ask the user for a number (up to the total words in the file). Then the 
        program will read that many words from the "dictionary.txt" file and push them to a Stack. 
        Use the readRandomLineFromFile method in the Utilities class. The words should be selected randomly so 
        not every game is played with the same set of words. You can use the Stack's contains() method to make sure
        there are no duplicate words.
Step 2: Pop the word off the top of the stack and use a JLable to display a blank line for all the characters in the word. 
        Collect key inputs from the user. If the user guesses a letter, fill in the blank space. Otherwise, take off a life.
Step 3: When a word has been solved, pop the next one off the stack and start a new round. It is up to you if you want to 
        reset the lives.
Step 4: If they run out of lives, give them a game over message.
Step 5: Don't end the program on game over. Ask the user if they would like to play again and run the game again with new 
	    words if they choose yes.*/

package _04_HangMan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> string = new Stack<String>();
	String utl= "";
	String popped= "";
	String blanks = "";

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
		
	
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.method();
		hangman.step2();
	}

	public void method() {
		String question = JOptionPane.showInputDialog("Enter a number between 0 and 266");
		int answer = Integer.parseInt(question);

		for (int i = 0; i < answer; i++) {
			utl = Utilities.readRandomLineFromFile("src/_04_HangMan/dictionary.txt");
			if(utl.equals("") || string.contains(utl)) {
				i--;
				continue;
			}
			string.push(utl);
		}
		

	}

	public void step2() {
		frame.addKeyListener(this);

		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.add(panel);
		panel.add(label);
	//	frame.pack();

		popped = string.pop();
System.out.println(popped);
		for (int i = 0; i < popped.length(); i++) {
			blanks += "_";
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < popped.length(); i++) {
		if(popped.charAt(i)==(e.getKeyChar())) {
			label.setText(Torture(popped, blanks, e.getKeyChar()));
		}
		}
		
	}
	public static String Torture(String correctWord, String blanks, char letter) {
		StringBuilder builder = new StringBuilder(blanks);
		for (int i = 0; i < correctWord.length(); i++) {
			if(correctWord.charAt(i) == letter) {
				builder.replace(i, i+1, letter+"");
			}
		}
		return builder.toString();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
