public class HelloWorld{
	public static void main (String[] agrgs) {
		
		int num = 50;
		String name = "Jack";
		Float deci = 9.99999F;
		boolean isFun = false;
		char symbol = '$';
		
		// Using print methods
			//Using println methods
		System.out.println("Hello World, This is my first Java Program.");
		System.out.println("Learning java is fun!");
			//Using print methods
		System.out.print("Java is cursed, which kind stress be this. Any small thing, javac and java HeLLWorld, i don try");
		System.out.print(" But the show must go on \n");
			//Using printf method
		System.out.printf("I bought %d quantity of bread.%n", num);
		System.out.printf("My name is %s.%n", name);
		System.out.printf("Your balance is %c%.2f million%n", symbol,deci);
		System.out.printf("Is Java fun? %b%n", isFun);
		System.out.printf("Do you enjoy learning \"java\"? %b%n", isFun);
	}
}