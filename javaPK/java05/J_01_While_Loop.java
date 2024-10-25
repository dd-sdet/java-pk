package java05;

public class J_01_While_Loop {

	public static void main(String[] args) {
		// while loop
		int a = 1;

		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		// do-while loop
		int b = 10;

		do {
			System.out.println(b);
			b--;
		} while (b > 0);
	}

}
