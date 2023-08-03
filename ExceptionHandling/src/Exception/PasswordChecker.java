package Exception;

import java.util.Scanner;

class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String message) {
		super(message);
	}

}

public class PasswordChecker {
	public static void main(String[] args) throws InvalidPasswordException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  password");
		String password = sc.next();
		// Regex to check valid password.
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";

		if (!password.matches(regex)) {
			throw new InvalidPasswordException("Invalid password!!!R");
		} else {
			System.out.println("Welcome");
		}
	}
}
