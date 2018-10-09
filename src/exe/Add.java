package exe;
import java.util.Scanner;
public class Add {
/*
 * Diego Benson
 * 10/18
 * addition game
 */
	public static void main(String[] args) {
		
	
		//variables
		
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() /3 % 10);
		int total;
		
		
		
		//prompt user
		
		System.out.println("add "+ num1+ "+" + num2);
		
		
		// get input
		
		Scanner input = new Scanner(System.in);
		
		//caclulate
		
		total = input.nextInt();
		int answer = num1+num2;
		
		//if
		//tell if wrong or right
		
		if (total == answer) {
			System.out.println("Thats corrext");
			
			
		}
		else {
			System.out.println("thats wrong");
			System.out.println("the correct answer is: "+ answer);
			
		}
		
		
		
		
		
		
	}

}
