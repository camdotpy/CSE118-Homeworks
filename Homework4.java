import java.util.*;

public class Homework4 {
	
	private static Scanner input = new Scanner(System.in);
	
	 public static void part1() {
		System.out.println("Enter a 2 digit integer number");
		int inputNum = input.nextInt();
		
		if (String.valueOf(inputNum).length() != 2) {
			System.out.println("Inputted number must be 2 digits");
		}
		
		else {
			if (inputNum % 2 == 0) {
				System.out.println("Inputted number is even");
			}
			else {
				System.out.println("Inputted number is odd");
			}
			if (inputNum % 5 == 0) {
				System.out.println("Inputted number is divisible by 5");
			}
		}
		
		int digit1 = inputNum / 10;
		int digit2 = inputNum % 10;
		
		if (digit1 > digit2) {
			System.out.println("The digit at 10s place is greater than the digit at 1s place.");
			int digit3 = digit1;
			digit1 = digit2;
			digit2 = digit3;
			System.out.println("New swapped number is " + ((digit1 * 10) + digit2));
		}
		else {
			System.out.println("The digit at 1s place is greater than the digit at 10s place.");
		}
	}
	
	public static void part2() {
		System.out.println("Enter 2 integer numbers");
		int inputNum1 = input.nextInt();
		int inputNum2 = input.nextInt();
		
		if (inputNum1 % inputNum2 == 0) {
			System.out.println(inputNum1 + " is divisible by " + inputNum2);
		}
		else if (inputNum2 % inputNum1 == 0) {
			System.out.println(inputNum2 + " is divisible by " + inputNum1);
		}
		else {
			System.out.println("Neither numbers are divisible by each other");
		}
	} 
	
	 public static void part3() {
		System.out.println("Enter a 4 digit integer number");
		int inputNum = input.nextInt();
		
		if (String.valueOf(inputNum).length() != 4) {
			System.out.println("Inputted number must be 4 digits");
		}
		else {
			int digit1 = inputNum / 1000;
			int digit2 = (inputNum / 100) % 10;
			int digit3 = (inputNum / 10) % 10;
			int digit4 = inputNum % 10;
			System.out.println("\n");
			System.out.println("Digit 1: " + digit1);
			System.out.println("Digit 2: " + digit2);
			System.out.println("Digit 3: " + digit3);
			System.out.println("Digit 4: " + digit4);
			
			int greaterFive = 0;
			int lessFive = 0;
			System.out.println("\n");
			
			if (digit1 >= 5) {
				System.out.println(digit1 + " is greater than or equal to 5");
				greaterFive++;
			}
			else if (digit1 < 5) {
				System.out.println(digit1 + " is less than 5");
				lessFive++;
			}
			if (digit2 >= 5) {
				System.out.println(digit2 + " is greater than or equal to 5");
				greaterFive++;
			}
			else if (digit2 < 5) {
				System.out.println(digit2 + " is less than 5");
				lessFive++;
			}
			if (digit3 >= 5) {
				System.out.println(digit3 + " is greater than or equal to 5");
				greaterFive++;
			}
			else if (digit3 < 5) {
				System.out.println(digit3 + " is less than 5");
				lessFive++;
			}
			if (digit4 >= 5) {
				System.out.println(digit4 + " is greater than or equal to 5");
				greaterFive++;
			}
			else if (digit4 < 5) {
				System.out.println(digit4 + " is less than 5");
				lessFive++;
			}
			
			System.out.println("\n");
			System.out.println(greaterFive + " total digits are greater than or equal to five");
			System.out.println(lessFive + " total digits are less than five");
			
			int even = 0;
			int odd = 0;
			System.out.println("\n");
			
			if (digit1 % 2 == 0) {
				System.out.println(digit1 + " is even");
				even++;
			}
			else if (digit1 % 2 == 1) {
				System.out.println(digit1 + " is odd");
				odd++;
			}
			if (digit2 % 2 == 0) {
				System.out.println(digit2 + " is even");
				even++;
			}
			else if (digit2 % 2 == 1) {
				System.out.println(digit2 + " is odd");
				odd++;
			}
			if (digit3 % 2 == 0) {
				System.out.println(digit3 + " is even");
				even++;
			}
			else if (digit3 % 2 == 1) {
				System.out.println(digit3 + " is odd");
				odd++;
			}
			if (digit4 % 2 == 0) {
				System.out.println(digit4 + " is even");
				even++;
			}
			else if (digit4 % 2 == 1) {
				System.out.println(digit4 + " is odd");
				odd++;
			}
			
			System.out.println("\n");
			System.out.println(even + " total digits are even");
			System.out.println(odd + " total digits are odd");
		}
	}
	
		public static void part4() {
			System.out.println("Enter the distance to drive in miles, the fuel efficiency of the vehicle in Mpg, and and the price per gallon");
			System.out.println("Distance:");
			double distance = input.nextDouble();
			System.out.println("Fuel Efficiency:");
			double fuelEff = input.nextDouble();
			System.out.println("Price:");
			double price = input.nextDouble();
			
			double gallons = (distance / fuelEff);
			double cost = (gallons * price);
			System.out.printf("The cost of driving will be: %.3f %n", cost);
		}

	public static void main(String[] args) {
		part1();
		part2();
		part3();
		part4();
	}

}
