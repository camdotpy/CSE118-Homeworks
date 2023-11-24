import java.util.*;

public class Homework9 {
	
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random();

	public static int part1(int low, int upp, int numPerLine) {
		
		int rangeCount = 0;
		
		for(int i=low; i<upp; i++) {
			if((i % 3 == 0) ^ (i % 7 == 0)) {
				System.out.printf("%d ", i);
				rangeCount++;
				if (rangeCount % numPerLine == 0) {
					System.out.println();
				}
			}
		}	
		
		System.out.printf("\nNumber of numbers in range: %d\n", rangeCount);
		return rangeCount;
	}
	
	public static int part2(int lowerBound, int upperBound) {
		int randNum = rand.nextInt(lowerBound, upperBound+1);
		System.out.printf("Random number: %d\n", randNum);
		return randNum;
	}
	
	public static char part3(char ch1, char ch2) {
		int randNum = rand.nextInt(ch1, ch2);
		char ch = (char)randNum;
		System.out.printf("Random character: %c\n", ch);
		return ch;
	}
	
	public static boolean part4(String inputString) {
		
		boolean bool = true;
		if(inputString.charAt(0) == '0' && inputString.charAt(1) == 'x') {
			for(int i=2; i<inputString.length(); i++) {
				if((inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'F') || 
						(inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'f') || 
						(inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9')) {
				}
				else {
					bool = false;
					break;
				}
			}
		}
		else {
			System.out.println("Error: Hexadecimal number must start with tag '0x'");
			bool = false;
		}
		if(bool == true) System.out.printf("%s is a valid Hexidecimal number", inputString);
		else System.out.printf("Error: %s is not a valid Hexidecimal number\n", inputString);
		return bool;
	}
	
	public static int part5(int seconds) {
		int hours = (seconds / 3600);
		int minutes = (seconds % 3600) / 60;
		int secondsRemaining = seconds % 60;
		
		System.out.printf("%d:%d:%d\n", hours, minutes, secondsRemaining);
		
		return seconds;
	}
	
	public static double part6(int n) {
		
		double sum = 0;
		for(int i=1; i<=n; i++) {
			sum += (double)(i/(i+1.0));
		}
		System.out.printf("Sum: %.2f\n", sum);
		return sum;
	}
		
	public static String part7A(char ch, boolean isDecimal) {
		String decimalString = "";
		String hexString = "";
		int ascii = ch;
		
		if((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			decimalString += ascii;
			if(isDecimal == true) {
				return decimalString;
			}
			else {
				hexString += Integer.toHexString(ascii);
				return hexString;
			}
		}
		else {
			System.out.println("Input must be a digital character or letter");
		}
		return hexString;
	}
	
	public static void part7B() {
		System.out.println("char dec  hexadec\n===============");
		
		for(char i='0'; i<'9'+1; i++) {
			System.out.printf("%c %s  0x%s\n", i, part7A(i, true), part7A(i, false));
		}
	}
	
	public static void part7C() {
		System.out.println("char dec  hexadec\n===============");
		
		for(char i='A'; i<'Z'+1; i++) {
			System.out.printf("%c %s  0x%s\n", i, part7A(i, true), part7A(i, false));
		}
		
		for(char i='a'; i<'z'+1; i++) {
			System.out.printf("%c %s  0x%s\n", i, part7A(i, true), part7A(i, false));
		}
	}
	
	public static void main(String[] args) {
		part1(1, 10, 4);
		part2(1, 10);
		part3('0', '9');
		part4("0x0p");
		part5(10000);
		part6(4);
		part7A('0', false);
		part7B();
		part7C();
	}

}
