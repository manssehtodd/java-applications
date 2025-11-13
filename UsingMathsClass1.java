//UsingMathsClass1.java

import java.util.Scanner;

public class UsingMathsClass1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any negative number of your choice: ");
		int num = input.nextInt();
		
		System.out.print("Enter any number of your choice: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter any number that will find the square root: ");
		double num3 = input.nextInt();
		
		System.out.printf("The absolute value of the number is %d%n", Math.abs(num));
		System.out.printf("The maximiunnumber is %d%n",Math.max(num,num2));
		System.out.printf("The minimum number is %d%n", Math.min(num, num2));
		System.out.printf("The square root is %.2f%n",Math.sqrt(num3));
		System.out.printf("The square os %f%n",Math.pow(num,2)*Math.pow(num2,2));
		System.out.printf("The the random double is %f%n", Math.random()*num);
		
		
	}
}