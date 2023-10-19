import java.util.*;

public class Homework6 {
	
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static void part1() {
		System.out.println("Part 1");
		System.out.println("Enter a value for variable x:");
		double x = input.nextDouble();
		
		if (x < 1) {
			double y = (((3.0/4.0)*(x*x*x)) - (1.0/2.0));
			System.out.println("f(" + x + ") = " + y);
		}
		else if (x >= 1 && x < 4) {
			double y = (1.0/4.0);
			System.out.println("f(" + x + ") = " + y);
		}
		else if (x >= 4) {
			double y = (Math.sqrt(x) - (7.0/4.0));
			System.out.println("f(" + x + ") = " + y);
		}
		System.out.println("\n");
	}
	
	public static void part2() {
		System.out.println("Part 2");
		char char1 = (char)(rand.nextInt(26) + 'a');
		char char2 = (char)(rand.nextInt(129));
		
		System.out.println("Part (a) " + char1);
		
		if (char2 < 5) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	
		int randChoice = rand.nextInt(1, 4);
		
		if (randChoice == 1) {
			char randDigit = (char)(rand.nextInt(48,58));
			System.out.println("Random Digit: " + randDigit);
		}
		else if (randChoice == 2) {
			char randLetterUpper = (char)(rand.nextInt(65,91));
			System.out.println("Random Letter: " + randLetterUpper);
		}
		else {
			char randLetterLower = (char)(rand.nextInt(97,123));
			System.out.println("Random Letter: " + randLetterLower);
		}
		System.out.println("\n");
	}
	
	public static void part3() {
		System.out.println("Part 3");
		char ch = (char)(rand.nextInt(26) + 'a');
		int ascii1 = ch;
		System.out.println("Part (a) Letter " + ch);
		System.out.println("Part (a) ASCII code " + ascii1);
		System.out.println("\n");
		
		char before = (char)(ch - 1);
		int ascii2 = before;
		
		if (ascii2 < 97) {
			System.out.println("Part (b) character " + before);
			System.out.println("Part (b) ASCII code " + ascii2);
			System.out.println("New character is not a lower case letter");
		}
		else {
			System.out.println("Part (b) character " + before);
			System.out.println("Part (b) ASCII code " + ascii2);
			System.out.println("New character is still a lower case letter");
		}
		
		System.out.println("\n");
		
		char thirdAfter = (char)(ch + 3);
		int ascii3 = thirdAfter;
		
		if (ascii2 > 122) {
			System.out.println("Part (c) character " + thirdAfter);
			System.out.println("Part (c) ASCII code " + ascii3);
			System.out.println("New character is not a lower case letter");
		}
		else {
			System.out.println("Part (c) character " + thirdAfter);
			System.out.println("Part (b) ASCII code " + ascii3);
			System.out.println("New character is still a lower case letter");
		}
		System.out.println("\n");
	}
	
	public static void part4() {
		System.out.println("Part 4");
		System.out.println("Enter a string:");
		input.nextLine(); //buffer for bug
		String inputString = input.nextLine();
		
		System.out.println("Length of String: " + inputString.length());
		System.out.println("First character in String: " + inputString.charAt(0));
		System.out.println("Last character in String: " + (inputString.charAt(inputString.length() - 1)));
		char middleCharacter = inputString.charAt(inputString.length() / 2);
		System.out.println("Middle character in String: " + middleCharacter);
		
		if (middleCharacter >= 32 && middleCharacter <= 126) {
			System.out.println(middleCharacter + " is a digital character");
		}
		else {
			System.out.println(middleCharacter + " is not a digital character");
		}
		System.out.println("\n");
	}
	
	public static void part5() {
		System.out.println("Part 5");
		System.out.println("Enter two strings: ");
		System.out.println("String 1: ");
		String string1 = input.nextLine();
		System.out.println("String 2: ");
		String string2 = input.nextLine();
		
		System.out.println("Length of String 1: " + string1.length());
		System.out.println("Length of String 2: " + string2.length());
		
		if (string1.equals(string2)) {
			System.out.println("String 1 is equal to String 2");
		}
		else {
			System.out.println("String 1 is not equal to String 2");
		}
		
		if (string1.compareTo(string2) < 0) {
			System.out.println("String 1 is less than String 2");
		}
		else if (string1.compareTo(string2) > 0) {
			System.out.println("String 1 is greater than String 2");
		}
		System.out.println("\n");
	}
	
	public static void part6B() {
		System.out.println("Part 6B");
		System.out.println("Enter a 5 character String");
		String inputString = input.nextLine();
		
		if (inputString.length() == 5) {
			if ((inputString.charAt(0) == inputString.charAt(4)) && (inputString.charAt(1) == inputString.charAt(3))) {
				System.out.println("String is a Palindrome");
			}
			else {
				System.out.println("String is not a Palindrome");
			}
		}
		else {
			System.out.println("String must be 5 digits long");
		}
		System.out.println("\n");
	}
	
	public static void part6C() {
		System.out.println("Part 6C");
		System.out.println("Enter a 5 character String");
		String inputString = input.nextLine();
		
		if (inputString.length() == 5) {
			
			String index0 = Character.toString(inputString.charAt(0));
			String index1 = Character.toString(inputString.charAt(1));
			String index3 = Character.toString(inputString.charAt(3));
			String index4 = Character.toString(inputString.charAt(4));
			
			if ((index0.equals(index4)) && (index1.equals(index3))) {
				System.out.println("String is a Palindrome");
			}
			else {
				System.out.println("String is not a Palindrome");
			}
		}
		else {
			System.out.println("String must be 5 digits long");
		}
		System.out.println("\n");
	}
	
	public static void part7() {
		System.out.println("Part 7");
		char char1 = (char)(rand.nextInt(26) + 'A');
		char char2 = (char)(rand.nextInt(26) + 'A');
		char char3 = (char)(rand.nextInt(26) + 'A');
		
		int num1 = rand.nextInt(1,10);
		int num2 = rand.nextInt(1,10);
		int num3 = rand.nextInt(1,10);
		int num4 = rand.nextInt(1,10);
		
		System.out.printf("Randomly Generated Plate Number Is: %c%c%c-%d%d%d%d", char1, char2, char3, num1, num2, num3, num4);
	}

	public static void main(String[] args) {
		part1();
		part2();
		part3();
		part4();
		part5();
		part6B();
		part6C();
		part7();
		input.close();
	}

}
