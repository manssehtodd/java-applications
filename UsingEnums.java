//UsingEnums.java

import java.util.Scanner;

public class UsingEnums{
	public enum AccountType{
		SAVINGS,
		CURRENT,
		FIXED_DEPOSIT
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Account type as (SAVINGS, CURRENT OR FIXED_DEPOSIT)");
		
		System.out.print("Enter your account type: ");
		String userChoice = scan.nextLine.upperCase();
		
		AccountType selectedType = null;
		
		if(userChoice.equals("SAVINGS"){
			selectedType = AccountType.SAVINGS;
			System.out.println("Your savings account was created successfully", selectedType);
		}
		else if(userChoice.equals("CURRENT"){
			selectedType = AccountType.CURRENT;
			System.out.println("Your Current account was created successfully", selectedType);
		}
		if(userChoice.equals("FIXED_DEPOSIT"){
			selectedType = AccountType.FIXED_DEPOSIT;
			System.out.println("Your Fixed deposit account was created successfully", selectedType);
		}
		
		if (selectedType != null){
			System.out.println("Selectes account type is " + selectedType);
		}
		else{
			System.out.println("Invalid Input");


	}
}