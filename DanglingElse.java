//DanglingElse.java
// Testing dangling-else statements for better understanding.
//Developer: Manasseh TODD

public class DanglingElse{
	public static void main(String[] args){
		int grade = 20;
		
		if (grade >= 60)
			System.out.println("Passed");
		else
		{
			System.out.println("Failed");
			System.out.println("Try again next year");
		}
	}
}