import java.io.PrintStream;
import java.util.*;

public class Homework8 {
	
	private static Scanner input = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static void part1() {
		int n = rand.nextInt(6, 10);
		double sum1 = 0, sum2 = 0;
		
		for (int i=1; i<n+1; i++) {
			sum1 += 1.0/i;
			
			if (i%2==0) {
				sum2 -= 1.0/i;
			}
			else {
				sum2 += 1.0/i;
			}
		}
		System.out.printf("sum1(%d)=%f\n", n, sum1);
		System.out.printf("sum2(%d)=%f\n", n, sum2);
	}
	
	public static void part2() {
		System.out.println("Enter a String");
		String inputString = input.nextLine();
		
		int i = 0;
		int whiteSpace = 0;
		while(i < inputString.length()) {
			char ch1 = inputString.charAt(i);
			if (ch1 == ' ') {
				whiteSpace++;
			}
			i++;
		}
		
		int n = 0;
		int digitalChar = 0;
		do {
			char ch2 = inputString.charAt(n);
			if (ch2 >= 48 && ch2 <= 57) {
				digitalChar++;
			}
			n++;
		} while(n < inputString.length());
		
		int upperCase = 0, lowerCase = 0;
		for(int k=0; k<inputString.length(); k++) {
			char ch3 = inputString.charAt(k), ch4 = inputString.charAt(k);
			if(ch3 >= 65 && ch3 <= 90) {
				upperCase++;
			}
			if(ch4 >= 97 && ch4 <= 122) {
				lowerCase++;
			}
		}
		System.out.println("Number of white space characters: " + whiteSpace);
		System.out.println("Number of digital characters: " + digitalChar);
		System.out.println("Number of Upper case letters: " + upperCase);
		System.out.println("Number of Lower case letters: " + lowerCase);
	}
	
	public static void part3() {
		System.out.println("Enter a String:");
		String inputString = input.nextLine();
		String finalString = "";
		
		for(int i=0; i<inputString.length(); i++) {
			if (inputString.charAt(i) != ' ') {
				finalString += inputString.charAt(i);
			}
			else {
				for(int j=i; j < inputString.length(); j++) {
					if(inputString.charAt(j) != ' ') {
						i = j-1;
						finalString += " ";
						break;
					}
				}
			}
		}
		System.out.println("New String: " + finalString);
	}
	
	public static void part4() {
		int d1, d2, d3, randNum;
		do {
			randNum = rand.nextInt(100, 1000);
			d1 = randNum / 100;
			d2 = randNum / 10 % 10;
			d3 = randNum % 10;
			
		} while(!(d1 >= d2 && d2 >= d3));
		System.out.println("Random Number: " + randNum);
	}
	
	public static void part5() {
		int reverse = 0, sum = 0;
		int even = 0, odd = 0;
		int randNumA = rand.nextInt(1,100000001);
		int randNumB = randNumA;
		System.out.println("Random number: " + randNumA);
		
		while(randNumA != 0) {
			int val = randNumA % 10;
			sum += val;
			randNumA /= 10;
		}
		System.out.println("Sum: " + sum);
		
		while(randNumB != 0) {
			reverse *= 10;
			int val = randNumB % 10;
			reverse += val;
			randNumB /= 10;
			
			if(val % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Reversed Number: " + reverse);
		System.out.println("Number of even numbers: " + even);
		System.out.println("Number of odd numbers: " + odd);
	}
	
	public static void part6() {
		double meter = 1;
		double newFeet = 0, newInches = 0;
		System.out.println("meter(s)\t feet\t\t Inch(es)");
		for(double i=meter; i < 10; i++) {
			newFeet += (meter * 3.28);
			newInches = (newFeet * 12.0);
			System.out.printf("%d\t%f\t%f\t\n", (int)i, newFeet, (Math.round(newInches * 100.0)/100.0));
		}
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
