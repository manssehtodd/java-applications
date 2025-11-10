// BreakStatement.java
// Developer: Manasseh TODD

public class BreakStatement{
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++){
			System.out.printf("%d Testing the break statement%n", i);
			if( i == 15){
				System.out.println("The loop terminates here");
				break;
			}
		}
	}
}