package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * HashMap<Integer, String> studentRoster = new HashMap<Integer, String>()
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After an
	 * ID is entered, use another input dialog to ask the user to enter a name. Add
	 * this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton button = new JButton("Add Entry");
	JButton button2 = new JButton("Search By ID");
	JButton button3 = new JButton("View List");

	JButton button4 = new JButton("Remove");

	_02_LogSearch() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);

		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		frame.pack();

	}

	public static void main(String[] args) {
		_02_LogSearch logSearch = new _02_LogSearch();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			String ID = JOptionPane.showInputDialog("Enter an ID number");
			String name = JOptionPane.showInputDialog("Enter your name");
			int id = Integer.parseInt(ID);

			hashMap.put(id, name);
		}
		if (button2 == e.getSource()) {
			String ID2 = JOptionPane.showInputDialog("Enter an ID number");
			int id2 = Integer.parseInt(ID2);
			if (hashMap.containsKey(id2)) {
				JOptionPane.showMessageDialog(null, hashMap.values());
			} else {
				JOptionPane.showMessageDialog(null, "Does not exist");
			}

		}
		if (button3 == e.getSource()) {
			JOptionPane.showMessageDialog(null, hashMap);
		}
		if (button4 == e.getSource()) {
			String ID2 = JOptionPane.showInputDialog("Enter an ID number to remove");
			int id2 = Integer.parseInt(ID2);
			hashMap.remove(id2);
		}
	}
}
