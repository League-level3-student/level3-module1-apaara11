package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{

	String[] names = new String[4];
	JButton button1 = new JButton("Add name");
	JButton button2 = new JButton("View name");

	_02_GuestBook(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		frame.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==(button1)) {
		String addName=JOptionPane.showInputDialog("Add a Name");
		}
		
	}
public static void main(String[] args) {
	_02_GuestBook guestbook = new _02_GuestBook();

}




	




	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	
	
}
