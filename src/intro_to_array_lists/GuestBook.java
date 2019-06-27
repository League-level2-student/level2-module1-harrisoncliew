package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JOptionPane;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.setup();
	}

	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();

	void setup() {
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		addName.setText("Add Name");
		viewNames.setText("View Names");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Enter a name.");
			names.add(name);
		} else if (e.getSource() == viewNames) {
			for (int i = 0; i < names.size(); i++) {
				String n = names.get(i);
				i++;
				String q = "Guest #"+i+": "+n+"\n";
				JOptionPane.showMessageDialog(null, q);
			}
			
		}
	}

}
