//ContinueStatement.java
//Developer.java

public class ContinueStatement{
	public static void main(String[] args){
		int i = 1;
		while(i <= 10){
			
			if( i == 5 || 1 == 9){
				continue;
			};
			
			System.out.printf(" Testing the continue statement%d%n",i);
			
			i++;
		}
	}
}