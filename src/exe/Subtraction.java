package exe;
import java.util.Scanner;
public class Subtraction {

	public static void main(String[] args) {
		int x=1;
		while (x==1) {
		// variables
		
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() /3 % 10);
		int answer;
		int total;
		
		// prompt user
		System.out.println("What is "+ num1+ "-"+ num2+ "?");
		
		// get input
		Scanner input = new Scanner(System.in);
	
		// caclulate
		answer = (num1-num2);
		total = input.nextInt();
		// if statement / tell  if it is correct
		if (total == answer) {
			System.out.println("that is correct!");
			
		}
		else {
			System.out.println("that is not correct!");
			x=0;
			
		}
		
		
		}
		System.out.println("Game Over");
	}

}
