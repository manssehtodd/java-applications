//StaticMehtodWithReturnTypePara.java
//Develpoer: Manasseh TODD

import java.util.Scanner;

public class  StaticMehtodWithReturnTypePara{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Full name: ");
		String name = input.nextLine();
		
		String displayName = myName(name);
		System.out.printf("Welcome to my doom %s%n",displayName);
		
		int result = addition(12, 3, 5);
		System.out.printf("The sum is %d%n",result);
	}
	
	public static String myName(String name){
		return name;
	}
	
	public static int addition(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
}