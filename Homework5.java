import java.util.*;

public class Homework5 {
	
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static void part1() {
		int num1 = rand.nextInt(111);
		int num2 = rand.nextInt(-1000, 1001);
		int num3 = rand.nextInt(10, 100);
		double num4 = rand.nextDouble(11.0, 100.0);
		System.out.println(String.format("num1 = %d; num2 = %d; num3 = %d; num4 = %f", num1, num2, num3, num4));
		System.out.println("\n");
	} 
	
	public static void part2() {
		int a = rand.nextInt(1, 101), b = rand.nextInt(1, 101), c = rand.nextInt(1, 101);
		
		if (a > b && b > c) {
			System.out.println("The greatest number is " + a); //ac
			System.out.println("The smallest number is " + c);
		}
		else if (b > a && a > c) {
			System.out.println("The greatest number is " + b); //bc
			System.out.println("The smallest number is " + c);
		}
		else if (c > a && a > b) {
			System.out.println("The greatest number is " + c); //cb
			System.out.println("The smallest number is " + b);
		}
		else if (c > b && b > a) {
			System.out.println("The greatest number is " + c); //ca
			System.out.println("The smallest number is " + a);
		}
		else if (a > c && c > b) {
			System.out.println("The greatest number is " + a); //ab
			System.out.println("The smallest number is " + b);
		}
		System.out.println("\n");
	} 
	
	public static void part3A() {
		System.out.println("Enter an integer number from the console");
		int inputNum = input.nextInt();
		
		if (inputNum < 11 || inputNum > 99) {
			System.out.println("Number must be in the range [11, 99]");
			if (inputNum < 11) {
				inputNum = 11;
				System.out.println("Number is now: " + inputNum);
			}
			else if (inputNum > 99) {
				inputNum = 99;
				System.out.println("Number is now: " + inputNum);
			}
		}
		else {
			System.out.println("Inputted Number is in desired range: " + inputNum);
		}
		System.out.println("\n");
	} 
	
	public static void part3B() {
		System.out.println("Enter an integer number from the console");
		int inputNum = input.nextInt();
		
		int inputNumFixed1 = (inputNum < 11) ? 11 : (inputNum > 99) ? 99 : (inputNum >= 11 && inputNum <= 99) ? inputNum : null;
		
		System.out.println("Inputted number is: " + inputNumFixed1);
		System.out.println("\n");
	}
	
	public static void part4() {
		int randDigit = rand.nextInt(10000);
		
		int digit4 = (int)randDigit % 10;
		int digit3 = ((int)randDigit / 10) % 10;
		int digit2 = ((int)randDigit / 100) % 10;
		int digit1 = ((int)randDigit / 1000) % 10;
		
		System.out.println("Random Digit is: " + randDigit);
		System.out.println(String.format("Digits are %d, %d, %d, %d", digit1, digit2, digit3, digit4));
		
		if (digit1 < digit2 && digit2 < digit3 && digit3 < digit4) {
			System.out.println(String.format("Digits are ascendingly ordered: %d, %d, %d, %d", digit1, digit2, digit3, digit4));
		}
		else if (digit1 > digit2 && digit2 > digit3 && digit3 > digit4) {
			System.out.println(String.format("Digits are descendingly ordered: %d, %d, %d, %d", digit1, digit2, digit3, digit4));
		}
		else {
			System.out.println("Digits are not sorted");
		}
		
		int num = randDigit, reversedNum = 0, remainder;
		int originalNum = num;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is a Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not a Palindrome.");
	    }
	    System.out.println("\n");
	} 
	
	public static void part5() {
		System.out.println("Enter an (x,y) coordinate to check if it is within the bounds of a circle with radius 10");
		System.out.println("X coordinate:");
		int x = input.nextInt();
		System.out.println("Y coordinate:");
		int y = input.nextInt();
		
		double xCheck = Math.pow(x, 2);
		double yCheck = Math.pow(y, 2);
		double distance = Math.sqrt(xCheck + yCheck);
		
		if (distance < 10) {
			System.out.println("The point is inside the circle");
		}
		else {
			System.out.println("The point is outside the circle");
		}
		System.out.println("\n");
	}
	
	public static void part6() {
		System.out.println("Enter the exchange rate from U.S. dollars to Japanese Yen");
		double exchangeRate = input.nextDouble();
		System.out.println("Enter 0 to convert from U.S. dollars to Japanese Yen");
		System.out.println("Enter 1 to convert from Japanese Yen to U.S. dollars");
		int choice = input.nextInt();
		
		if (choice == 0) {
			System.out.println("Enter U.S. dollar amount to convert");
			double usd1 = input.nextDouble();
			double yen1 = usd1 * exchangeRate;
			System.out.printf("$" + usd1 + " in Yen is %.2f %n", yen1);
		}
		else if (choice == 1) {
			System.out.println("Enter Yen amount to convert");
			double yen2 = input.nextDouble();
			double usd2 = yen2 / exchangeRate;
			System.out.printf(yen2 + "Yen in USD is $%.2f %n ", usd2);
		}
			System.out.println("Invalid choice, please choose again");
	}

	public static void main(String[] args) {
		part1();
		part2();
		part3A();
		part3B();
		part4();
		part5();
		part6();
	}

}
