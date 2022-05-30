import java.util.Scanner;

public class Ch5E_3NumberOfDigits {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		long number = keyboardIn.nextLong();
		
		if (number < 0)
		{
			number = number * -1;
		}
		
		int digits;
		
		if (number > 999999999)
		{
			digits = 10;
		}
		else if (number > 99999999)
		{
			digits = 9;
		}
		else if (number > 9999999)
		{
			digits = 8;
		}
		else if (number > 999999)
		{
			digits = 7;
		}
		else if (number > 99999)
		{
			digits = 6;
		}
		else if (number > 9999)
		{
			digits = 5;
		}
		else if (number > 999)
		{
			digits = 4;
		}
		else if (number > 99)
		{
			digits = 3;
		}
		else if (number > 9)
		{
			digits = 2;
		}
		else 
		{
			digits = 1;
		}
		
		System.out.println("The number " + number + " has " + digits + " digits.");

	}

}
