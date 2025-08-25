package day1;

public class day1 {
	public static void main(String[] args) {
		int count = 0;

		// While loop
		while (count < 5) {
			System.out.println("Current count: " + count);

			// If-else statement inside the while loop
			if (count % 2 == 0) {
				System.out.println("  This is an even number.");
			} else {
				System.out.println("  This is an odd number.");
			}
			count++; // Increment count to eventually exit the loop
		}

		System.out.println("Loop finished. Final count: " + count);

		// Another if-else statement outside the loop
		if (count == 5) {
			System.out.println("The loop completed as expected.");
		} else {
			System.out.println("Something unexpected happened with the loop.");
		}
	}

}
