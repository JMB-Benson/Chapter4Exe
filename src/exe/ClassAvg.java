package exe;
import java.util.Scanner;
/*
 * Diego Benson
 * 10/18
 */



public class ClassAvg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// get input
		System.out.println("Put in your Grades ");
		
		// find and solve avg
		
		double grade1 = input.nextDouble();
		double grade2 = input.nextDouble();
		double grade3 = input.nextDouble();
		double grade4 = input.nextDouble();
		double grade5 = input.nextDouble();
		double grade6 = input.nextDouble();
		double grade7 = input.nextDouble();
		double grade8 = input.nextDouble();
		double grade9 = input.nextDouble();
		double grade10 = input.nextDouble();
		double avg = (grade1+grade2+grade3+grade4+grade5+grade6+grade7+grade8+grade9+grade10)/10; 
		System.out.println(avg);
		// ifs and output 
		if (avg >= 90) {
			System.out.println("you grade is an A: " + avg);
		}
		else if (avg >= 80) {
			System.out.println("you grade is an B: " + avg);
		}
		else if (avg >=70) {
			System.out.println("you grade is an C: " + avg);
		}
		else if (avg >= 60) {
			System.out.println("you grade is an D: " + avg);
		}
		else if (avg >= 50) {
			System.out.println("you grade is an F: " + avg);
		}
		else if (avg <= 50) {
			System.out.println("you grade is an F: " + avg);
		}					
		else if (avg >= 0) {
			System.out.println("something went wrong");
		}				
					
		else {
			System.out.println("Something went wrong"); 
		}	
		
		System.out.println("END PROGRAM");
		
		
		
		
		
	}

	
		
		
	}

