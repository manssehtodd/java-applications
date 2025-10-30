// OperatorPart2.java
// Autor: Manasseh TODD
// Use of Operator

public class OperatorPart2{
	public static void main(String[] args){
		int num1 = 30;
		int num2 = 35;
		int num3 = 17;
		
		boolean result = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n",result); //This result shows false Value
		
		// OR Logical operator
		boolean result2 = (num1 > num2) || (num1 > num3);
		System.out.printf("The result2 is %b%n",result2); //This result2 shows the True value
		
		// NOT Logical operator
		boolean result3 = (num1 > num2) != (num1 > num3);
		System.out.printf("The result3 is %b%n",result3 );
		
		// Unary Operator 
		/* The unary operators are used to either increase or decrease values easily.
		the Unary operators include the increment and decrement
		the increment operator has both the post and pre method as follows
		X++ and ++X
		*/
		//Pre-increment unary operators
		int num4 = 10;
		int pre = ++num4;
		System.out.printf("%d%n",pre);
		System.out.printf("%d%n",num4);
		
		//Post-increment unary operators
		int num5 = 10;
		int post = num5++;
		System.out.printf("%d%n",post);
		System.out.printf("%d%n",num5);
		
		//Pre-decrement unary operators
		int num6 = 10;
		int pre1 = --num6;
		System.out.printf("%d%n",pre);
		System.out.printf("%d%n",num6);
		
		//Post-decrement unary operators
		int num7 = 10;
		int post2 = num7--;
		System.out.printf("%d%n",post);
		System.out.printf("%d%n",num7);
	}
}
