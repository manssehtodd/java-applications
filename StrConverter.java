// StrConverter.java
// Convert str to int
//Develpoer: Manasseh TODD

import javax.swing.JOptionPane;

public class StrConverter {
	public static void main(String[] args){
		//Prompt number
		String text = JOptionPane.showInputDialog("What is your age:");
		
		int num = 0;
		
		//Converting string to int
		try{
			num = Integer.parseInt(text);
		} catch(NumberFormatException e){
		JOptionPane.showMessageDialog(null, "Please enter a number not a text, thank you");
		return;
		};
		
		String message = String.format("You are %d years old, congrats", num);
		JOptionPane.showMessageDialog(null, message);
	}
}