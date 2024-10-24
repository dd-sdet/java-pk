package java04;

public class J_01_If_Else {

	public static void main(String[] args) {
		int age = 28;

		if (age >= 18) {
			System.out.println("Access granted");
		} else {
			System.out.println("Access denied");
		}

		int hour = 8;

		if (hour > 0 && hour < 12) {
			System.out.println("Good morning!");
		} else if (hour >= 12 && hour < 18) {
			System.out.println("Good afternoon!");
		} else if (hour >= 18 && hour < 24) {
			System.out.println("Good evening!");
		} else if (hour == 0 || hour == 24) {
			System.out.println("Good night!");
		} else {
			System.out.println("Invalid hour! Please enter an hour from 0 to 24.");
		}
	}

}
