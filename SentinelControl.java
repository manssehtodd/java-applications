// SentinelControl.java
// Developer: Manasseh Todd

import java.util.Scanner;

public class SentinelControl{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("Enter -1 to terminate the loop");
		while(true){
			System.out.print("Enter number");
			num = input.nextInt();
			
			if(num == -1){
				break;
			}
			sum += num;
		}
		System.out.printf("The total number is %d%n",sum);
	}
}