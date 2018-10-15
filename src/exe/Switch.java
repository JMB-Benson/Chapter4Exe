package exe;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*
		 * Switch (switch-expression ) {
		 * case value1:
		 * Statements;
		 * break;
		 * case value2:
		 * Statements;
		 * break;
		 * case value3:
		 * Statements;
		 * break;
		 * case value4:
		 * Statements;
		 * break;
		 * }
		 * }
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		switch ( year % 12) {
		case 0:
			System.out.println("monkey");
			break;
		case 1:
			System.out.println("Rooster");
			break;
		case 2:
			System.out.println("Dog");
			break;
		case 3:
			System.out.println("pig");
			break;
		case 4:
			System.out.println("Rat");
			break;
		case 5:
			System.out.println("Fox");
			break;
		case 6:
			System.out.println("Tiger");
			break;
		case 7:
			System.out.println("Rabbit");
			break;
		case 8:
			System.out.println("Dragon");
			break;
		case 9:
			System.out.println("Snake");
			break;
		case 10:
			System.out.println("Horse");
			break;
		case 11:
			System.out.println("Goat");
			break;
		}
		
		
		
		
		
		
		
		
		

	}

}
