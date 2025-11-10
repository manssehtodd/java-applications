//DefinedRepetition.java
// Using while loop to collecting more than one set of input from a user.
// Developer: Manasseh TODD
import java.util.Scanner;

public class DefinedRepetition{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int counter = 1;
		
		System.out.println("Enter grades for class 10A over 100");
		while (counter <= 10)
		{
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			if (grade < 0 || grade > 100) 
			{
				System.out.println("Please enter the value between the ranges of 0 and 100");
				break;
			}else
				total = total + grade;
			counter++;
		}
		
		int average = total /10;
		
		System.out.printf("%nTotal of all 10 grade is %d%n", total);
		System.out.printf("Class average is %d%n", average);
	}
}