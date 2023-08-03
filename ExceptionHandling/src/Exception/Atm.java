package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends Exception {
	public InvalidInputException(String message)
	{
		super(message);
	}
}
public class Atm {
	public static void main(String[] args)  throws InvalidInputException {
		Scanner sc = new Scanner(System.in);
		double accountBalance = 0.0;
		double withdrawalAmount = 0.0;

		System.out.print("Enter the account Balance: ");
		
		
		try {
			accountBalance = sc.nextDouble();
			System.out.println("Enter the Withdrawal Amount: ");
			withdrawalAmount = sc.nextDouble();
			if(accountBalance <0 ||  withdrawalAmount<0)
			{
				throw new InvalidInputException("Data cannot be negative");
			}
			else
			{
				if(accountBalance >= withdrawalAmount)
				{
					accountBalance -= withdrawalAmount;
					System.out.println("Withdrawal is successful");
					System.out.println("Balance Left: "+accountBalance);
				}
				else
				{
					System.out.println("Insufficient Balance");
				}
			}
			
		}catch(InvalidInputException|InputMismatchException ex)
			{
				throw new InvalidInputException("Data should be numeric");
			}

}
}
