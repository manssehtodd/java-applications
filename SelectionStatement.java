// Control Structure
// SelectionStatement.java
// Autor: Manasseh TODD
// learning about Control Structure.

import java.util.Scanner;

public class SelectionStatement{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		int age= input.nextInt();
		
		if(age >= 18) {
			System.out.printf("Wow, you are an adult now%nand will have
			to state paying for bills now \uD83D\uDE02");
		}
		else {
			System.out.printf("Sorry you are not of age for this program, go back");
		}
	}
}