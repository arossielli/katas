package my.vaadin.app;

public class FizzBuzz_Luis {

	public static void main(String[] args) {
		int n = 5;
		int m = 1;
		int line = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < line; j++) {
				System.out.print("\t"+m++);
			}
			line++;
			System.out.println();
			
		}
		
		
	}
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 101; i++) {
			if (i % 5 == 0 && i % 3 == 0) {

				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");

			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}

		}
	}
	

}
