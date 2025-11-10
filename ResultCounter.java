// ResultCounter.java
// This program takes an input of 10 students, using the input a1 and a2 to determine if the students pass or fail respectvely.
// It counts the number of students that passed or failed and dtermines if the teacher requires a bonus (if pass is 8 or more).
// It also prints out the number of pass and fails in the class of 10.
// Developer: Manasseh TODD

import java.util.Scanner;

public class ResultCounter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int fails = 0;
		int count = 1;
		
		while(count <= 10)
		{
			System.out.println("Enter result(a1 is for pass, while a2 for fail): ");
			String result = input.next();
			if (result.equals("a1"))
				passes++;
			else
				fails++;
			
			count++;
		}
		
		System.out.printf("Number of students that passed: %d%n",passes);
		System.out.printf("Number of students that failed: %d%n",fails);
		
		if(passes >= 8)
			System.out.println("Teacher deserve a bonus.");
		else if (passes >=5)
			System.out.println("Teacher is okay, but can do better.");
		else
			System.out.println("Teacher deserve a minus in his salary.");
	}
}