package java05;

public class J_02_For_Loop {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 10; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println("Even:" + i);
			} else {
				System.out.println("Odd: " + i);
			}
		}

		// * for-each loop
		// Is used exclusively to loop through elements in an array
	}

}
