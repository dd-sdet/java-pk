package java03;

public class J_05_Ternary {

	public static void main(String[] args) {
		// variable = (condition) ? expressionTrue : expressionFalse;

		int age = 28;

		String message = (age >= 18) ? "Access granted" : "Access denied";

		System.out.println(message);
	}

}
