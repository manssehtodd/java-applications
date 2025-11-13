// NameDialog.java
// Obtaining user input from a dialog
//Developer: Manasseh TODD

import javax.swing.JOptionPane;

public class NameDialog{
	public static void main(String[] args){
		// prompt user enter name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		//Create the message
		String message = String.format("Welcome, %s, to Java Programming!", name);
		
		// Displat the message to welcome the user by name
		JOptionPane.showMessageDialog(null, message);
	}//end main
}// end class NameDialog