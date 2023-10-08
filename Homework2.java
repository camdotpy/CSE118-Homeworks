import java.util.Scanner;

public class Homework2 {

	private static Scanner input = new Scanner(System.in);
	
	public static void part1() {
		int x = 52;
		System.out.println("x = " + x);
		double y = 987.654;
		System.out.println("y = " + y);
		int newX = x + 101;
		System.out.println("New x = " + newX);
		x = (int)y;
		System.out.println("if x == y, x is now: " + x + " and y is now: " + y);
		double z = ((1.0/2)*x) + ((1.0/3)*y);
		System.out.println("z = " + z);
	}
	
	public static void part2() {
		System.out.println("Enter 3 Integer numbers to sum");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int sum = a + b + c;
		System.out.println("The sum of numbers " + a + ", " + b + " and " + c + " is " + sum);
		
		double average = (a + b + c)/3;
		System.out.println("The average of numbers " + a + ", " + b + " and " + c + " is " + average);
		
	}
	
	public static void part3() {
		System.out.println("Enter 3 numbers, length, width and height: ");
		double width = input.nextDouble();
		double length = input.nextDouble();
		double height = input.nextDouble();
		double volume = length * width * height;
		System.out.println("The volume of this cuboid is " + volume);
	}
	
	public static void part4() {
		System.out.println("Enter a number to evaluate in the function: ");
		double x = input.nextDouble();
		double y = ((1.0/3)*(x*x)) - ((3.0/5)*x) + (5.0/7);
		System.out.println("function f(" + x + ") = " + y);
	}
	
	public static void main(String[] args) {
		part1();
		System.out.println("\n");
		part2();
		System.out.println("\n");
		part3();
		System.out.println("\n");
		part4();
		input.close();
	}

}
