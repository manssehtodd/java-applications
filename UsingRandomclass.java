//UsingRandomclass.java

import java.util.Random;

public class UsingRandomclass{
	public static void main(String[] args){
			Random random = new Random();
			
			int number = random.nextInt();
			System.out.printf("The number generated %d%n", Math.abs(number));
			
			int myNumber = random.nextInt(10);
			System.out.printf("The number genrated from 0 to 9:  %d%n",Math.abs(myNumber));
			
			boolean isFun = random.nextBoolean();
			System.out.printf("IS Java fun: %b%n",isFun);
	}
}