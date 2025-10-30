// IfStatement.java
// Autor = Manasseh TODD
// Compare integers using ifstatements, relationaloperators
// andequality operators.

import java.util.Scanner;

public class IfStatement
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter first integers: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integers: ");
		number2 = input.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
		
		if (number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);
		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
	}
}
