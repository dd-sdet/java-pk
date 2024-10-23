package java03;

public class J_01_Arithmetic {

	public static void main(String[] args) {
		int a = 13, b = 10;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		int preIncrement = ++a;

		System.out.println(preIncrement);
		System.out.println(a);

		int postDecrement = b--;

		System.out.println(postDecrement);
		System.out.println(b);
	}

}
