import java.util.Scanner;

public class Homework3 {
	
	private static Scanner input = new Scanner(System.in);
	
	 public static void part1() {
		System.out.println("Enter 4 Integer values");
		int pos1 = input.nextInt();
		int pos2 = input.nextInt();
		int pos3 = input.nextInt();
		int pos4 = input.nextInt();
		
		int pos1bkp = pos1; //backups to reset values for right shift
		int pos2bkp = pos2;
		int pos3bkp = pos3;
		int pos4bkp = pos4;
		
		System.out.println(String.format("pos1 = %d; pos2 = %d; pos3 = %d; pos4 = %d", pos1, pos2, pos3, pos4));
		
		System.out.println("Left Shift");
		int tmp;
		tmp = pos1;
		pos1 = pos2;
		pos2 = pos3;
		pos3 = pos4;
		pos4 = tmp;
		System.out.println(String.format("pos1 = %d; pos2 = %d; pos3 = %d; pos4 = %d", pos1, pos2, pos3, pos4));
		
	    pos1 = pos1bkp; //resetting values
		pos2 = pos2bkp;
		pos3 = pos3bkp;
		pos4 = pos4bkp;
		
		System.out.println("Right Shift");
		tmp = pos4;
		pos4 = pos3;
		pos3 = pos2;
		pos2 = pos1;
		pos1 = tmp;
		System.out.println(String.format("pos1 = %d; pos2 = %d; pos3 = %d; pos4 = %d", pos1, pos2, pos3, pos4));
		
	}
	
	 public static void part2() {
		System.out.println("Enter a 4 digit integer number");
		int inputNum = input.nextInt();
		if (String.valueOf(inputNum).length() == 4) {
			int pos4 = (int)inputNum % 10;
			int pos3 = ((int)inputNum / 10) % 10;
			int pos2 = ((int)inputNum / 100) % 10;
			int pos1 = ((int)inputNum / 1000) % 10;
			System.out.println(String.format("Digits from left to right are %d, %d, %d, %d", pos1, pos2, pos3, pos4));
			System.out.println(String.format("Digits from right to left are %d, %d, %d, %d", pos4, pos3, pos2, pos1));
		}
		else {
			System.out.println("integer must be 4 digits");
		}
	} 
	
    public static void part3() {
		System.out.println("Enter a double number");
		double inputNum = input.nextDouble();
		int integerNum = (int)inputNum;
		double decimalNum = inputNum - integerNum;
		
		System.out.println("Integer part: " + integerNum);
		System.out.println("Decimal part: " + decimalNum);
		
		double truncate = (int)(inputNum * 1000) / 1000.0;
		System.out.println("Truncated number: " + truncate);
		
		double round = (int)((inputNum + 0.0005)*1000) / 1000.0;
		System.out.println("Rounded part: " + round);	
		} 
	
	public static void part4() {
		System.out.println("Enter an integer number which is the length in millimeters");
		int input1 = input.nextInt();
		int meters = input1 / 1000;
		int centimeters = (input1 % 1000) / 10;
		int millimeters = (input1 % 100) % 10;
		
		System.out.println(input1 + " millimeters = " + meters + " meters + " + centimeters + " centimeters + " + millimeters + " millimeters");

	}
	
	public static void main(String[] args) {
		part1();
		part2();
		part3();
		part4();
		}

}

