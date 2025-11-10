//StaticMethodWithParameter.java
//Develpoer: Manasseh TODD

public class StaticMethodWithParameter {
	public static void main(String[] args){
		addition(800,302,300);
		addition(830,3022,3100);
		addition(820,402,400);
	}
	
	public static void addition(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		
		System.out.printf("The sum is %d%n",sum);
	}
}