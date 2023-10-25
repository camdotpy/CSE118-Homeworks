import java.util.*;

public class Homework7 {
	
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static void part1() {
		int A1 = rand.nextInt(-99, 100);
		int B1 = rand.nextInt(-111, 111);
		double C1 = rand.nextDouble(-20.0, 20.0);
		
		int A2 = (int)(Math.random() * (99 - -99 + 1) - 99);
		int B2 = (int)(Math.random() * (110 - -110 + 1) - 110);
		double C2 = (Math.random() * (20.0 - - 20.0 + 1) - 20.0);
		
		System.out.printf("Part 1 Values: A1: %d, B1: %d, C1: %f \n", A1, B1, C1);
		System.out.printf("Part 2 Values: A2: %d, B2: %d, C2: %f\n", A1, B1, C1);
	}
	
	public static void part2() {
		int vx = rand.nextInt(1, 100);
		int vy = rand.nextInt(1, 100);
		int vz = rand.nextInt(1, 100);
		int vw = rand.nextInt(1, 100);
		
		System.out.println("vx value: " + vx);
		System.out.println("vy value: " + vy);
		System.out.println("vz value: " + vz);
		System.out.println("vw value: " + vw);
		
		//Method 1
		
		if (vx >= vy && vx >= vz && vx >= vw) {
			System.out.println(vx + " is the greatest value");
		}
		else if (vy >= vx && vy >= vz && vy >= vw) {
			System.out.println(vy + " is the greatest value");
		}
		else if (vz >= vx && vz >= vy && vz >= vw) {
			System.out.println(vz + " is the greatest value");
		}
		else {
			System.out.println(vw + " is the greatest value");
		}
		
		//Method 2
		
		System.out.println("Greatest value is " + Math.max(Math.max(vx, vy), Math.max(vz, vw)));
	}
	
	public static void part3() {
		System.out.println("Enter a string which has multiple words");
		String inputString = input.nextLine();
		String firstWord = inputString.substring(0, inputString.indexOf(" "));
		String lastWord = inputString.substring(inputString.lastIndexOf(" ") + 1);
		System.out.println("First word is: " + firstWord);
		System.out.println("Last word is:" + lastWord);
		
		int compare = firstWord.compareTo(lastWord);
		
		if (compare == 0) {
			System.out.println("Both words are equal");
			String newStr = firstWord.concat(" " + lastWord);
			System.out.println("New String: " + newStr);
		}
		else if (compare > 0) {
			System.out.println("the last word is smaller");
			String newStr = lastWord.concat(" " + firstWord);
			System.out.println("New String: " + newStr);
		}
		else {
			System.out.println("the first word is smaller");
			String newStr = firstWord.concat(" " + lastWord);
			System.out.println("New String: " + newStr);
		}
	}
	
	public static void part4() {
		double num = rand.nextDouble(-1000.0, 1000.0);
		if (num < 0) {
			num = (num * -1);
		}
		double square = (num * num);
		double cube = (num * num * num);
		double sqrt = (Math.sqrt(num));
		
		System.out.printf("Random number: %f\n Square: %f\n Cube: %f\n Square Root: %f\n", num, square, cube, sqrt);
	}
	
	public static void part5() {
		System.out.println("Enter number of cents (0-99):");
		int value = input.nextInt();
		int quarters = value / 25;
		int dimes = (value % 25) / 10;
		int nickels = ((value % 25) % 10) / 5;
		int pennies = (((value % 25) % 10) % 5) / 1;
		System.out.printf("Quarters: %d\n Dimes: %d\n Nickels: %d\n Pennies: %d\n", quarters, dimes, nickels, pennies);
	}
	
	public static void part6() {
		char char1 = (char)(rand.nextInt(65, 71));
		char char2 = (char)(rand.nextInt(65, 71));
		int digit1 = rand.nextInt(0, 10);
		int digit2 = rand.nextInt(0, 10);
		
		System.out.printf("Random Hexadecimal Number: 0x%c%c%d%d", char1, char2, digit1, digit2);
	}
	
 	public static void main(String[] args) {
		part1();
		part2();
		part3();
		part4();
		part5();
		part6();
	}

}
