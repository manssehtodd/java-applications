//ContinueTest.java
// continue statement terminates an iteration of a for statement.
public class ContinueTest{
	public static void main(String[] args){
		for (int count = 1; count <= 10; count++){
			if (count % 2 == 0 )
				continue; //skip remaining code in oop if conut is 2
			
			System.out.printf("%d ", count);
		}
		
		System.out.printf("%nUsed continue to skip printing 5%n");
	}
}// end class ContinueTest