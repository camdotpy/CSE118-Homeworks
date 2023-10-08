import java.util.Scanner;

public class homework1 {
	
	public static void part1() {
		System.out.println("Hello");
		System.out.println("Cameron Seebeck");
	}
	
	public static void part2() {
		Scanner inputValue = new Scanner(System.in);
		System.out.println("Enter a value for length");
		String strLength = inputValue.nextLine();
		System.out.println("Enter a value for width");
		String strWidth = inputValue.nextLine();
		
		double length = Double.parseDouble(strLength);
		double width = Double.parseDouble(strWidth);
		double area = length * width;
		double circumference = (length * 2) + (width * 2);
		
		System.out.println("The length and width of the rectangle are " + strLength + " and " + strWidth);
		System.out.println("The area of the rectangle is " + Double.toString(area));
		System.out.println("The circumference of the rectangle is " + circumference);	
	}
	
	public static void part3() { 
		System.out.println("*****       *        *           *       *       \r\n"
				         + "  *        * *        *         *       * *      \r\n"
				         + "  *       *   *        *       *       *   *     \r\n"
				         + "  *      *******        *     *       *******    \r\n"
				         + " *      *       *        *   *       *       *   \r\n"
				         + "*      *         *         *        *         *  \r\n"
				         + "");

	}

	public static void main(String[] args) {
		part1();
		part2();
		part3();
	}

}
