// NameDialog.java
// Obtaining user input from a dialog
//Developer: Manasseh TODD

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class NameDialog{
	public static void main(String[] args){
		// Creating a windows with Jframe
		JFrame frame = new JFrame("Enter your name");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// prompt user enter name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		//Create the message
		String message = String.format("Welcome, %s, to Java Programming!", name);
		
		// Displat the message to welcome the user by name
		JOptionPane.showMessageDialog(frame, message);
	}//end main
}// end class NameDialog