package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.stream.events.Characters;

public class _02_TextUndoRedo implements KeyListener {
	Stack<Character> chars = new Stack<Character>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	public _02_TextUndoRedo() {
		
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);

	}

	public static void main(String[] args) {
		_02_TextUndoRedo text = new _02_TextUndoRedo();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
        char ch=e.getKeyChar();
		chars.push(new Character(ch));
		label.setText(label.getText()+ ch);
		
		if (e.getKeyCode()==0 && chars.size()>0) {
			 System.out.println("text");
			 chars.pop();
			 label.setText(label.getText().substring(0, chars.size()));
		}
		System.out.println(e.getKeyChar());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	/*
	 * Create a JFrame with a JPanel and a JLabel. \\Done//
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

}
