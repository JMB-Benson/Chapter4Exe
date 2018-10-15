package exe;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// Generate a lottery number
		int lottery = (int)(Math.random() * 100);

		//Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lotter pock (two digits): ");
		int guess = input.nextInt();
		
		
		
		// get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		//Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		
		
		System.out.println("the lottery number is " + lottery);
		if (guess == lottery) {
			System.out.println("exact match: you win $10,000");
		}
		else if(guessDigit2 == lotteryDigit1 
				&& guessDigit1 == lotteryDigit2) {
			System.out.println("match all digits: you win $3,00");
			
		}
		else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1 
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: you win $1,000");
			
		}
		else {
			System.out.println("Sorry, no match");
		}
		
		
		
	}

}
