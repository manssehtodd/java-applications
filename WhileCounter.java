// WhileCounter.java
//Counter-controlled repetition with the while repetition statement.

public class WhileCounter{
	public static void main(String[] args){
		int counter = 0; //Declare and initialize control variable
		
		while (counter++ <= 10){			//Loop-continuation conditon
			System.out.printf("%d ",counter);
			//++counter; //increment control variable
		}	
		System.out.println();
	}
}