import java.util.*;

public class Homework5 {
	
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random();
	
	/* public static void part1() {
		int num1 = rand.nextInt(111);
		int num2 = rand.nextInt(-1000, 1001);
		int num3 = rand.nextInt(10, 100);
		double num4 = rand.nextDouble(11.0, 100.0);
		System.out.println(String.format("num1 = %d; num2 = %d; num3 = %d; num4 = %f", num1, num2, num3, num4));
	} */
	
	/* public static void part2() {
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
	} */
	
	/* public static void part3A() {
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
	} */
	
	/* public static void part3B() {
		System.out.println("Enter an integer number from the console");
		int inputNum = input.nextInt();
		
		int inputNumFixed1 = (inputNum < 11) ? 11 : (inputNum > 99) ? 99 : (inputNum >= 11 && inputNum <= 99) ? inputNum : null;
		
		System.out.println("Inputted number is: " + inputNumFixed1);
	} */
	
	public static void part4() {
		/* int randDigit = rand.nextInt(10000);
		
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
		}*/
		
		int randDigitReverse = 3443, reversed = 0;
		
		for(;randDigitReverse != 0; randDigitReverse /= 10) {
		      int digit = randDigitReverse % 10;
		      reversed = reversed * 10 + digit;
		}
		
		System.out.println("Reversed number: " + reversed);
		
		if (randDigitReverse == reversed) {
			System.out.println("Number is a palindrome");
			System.out.println("Original Number: " + randDigitReverse);
			System.out.println("Reversed Number: " + reversed);
		}
		else {
			System.out.println("Number is not a palindrome");
		}
	}

	public static void main(String[] args) {
		//part1();
		//part2();
		//part3A();
		//part3B();
		part4();
	}

}
