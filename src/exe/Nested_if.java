package exe;

public class Nested_if {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		if (x < y) {
			System.out.println("x is less than y");
			if( z  > y ) {
				System.out.println("z is greater than y");
				if(x>z) {
					System.out.println("x is greater than z");
				}
				else {
					System.out.println("x is less than z");
				}
			}
				else {
					System.out.println("second codition wasent true");
					
				}
			}
			else {
				System.out.println("first codition wasent true");
		}
		System.out.println("program is done");
		

	}

}
