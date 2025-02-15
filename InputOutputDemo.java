import java.util.Scanner;

public class InputOutputDemo {
	public static void main(String[] args) {
		
		//Get input from users
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int userInt = input.nextInt();
		
		System.out.print("Enter a decimal number: ");
		double userDouble = input.nextDouble();
		
		// consume newline so there would be no issue in the next string 
		input.nextLine();
		
		System.out.print("Enter a word or sentence: ");
		String userString = input.nextLine();
		
		System.out.printf("Your integer: %d%n", userInt);
		System.out.printf("Your decimal number: %.2f%n", userDouble);
		System.out.printf("Your string: %s%n", userString);
		
		input.close();
		
	}
}