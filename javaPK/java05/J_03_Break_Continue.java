package java05;

public class J_03_Break_Continue {

	public static void main(String[] args) {
		// break
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("Break: " + i);
		}

		// continue
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Continue: " + i);
		}
	}

}
