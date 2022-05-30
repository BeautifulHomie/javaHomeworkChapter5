import java.util.Scanner;

public class Ch5E_2FloatingPointNegativePositiveZero {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("Please enter a floating-point number: ");
		double user = keyboardIn.nextDouble();
		
		String absoluteValue = "";
		
		if (Math.abs(user) < 1.0) 
		{
			absoluteValue = "small";
		}
		if (Math.abs(user) > 1000000.0)
		{
			absoluteValue = "large";
		}

		if (user == 0)
		{
			System.out.println("This is zero");
		}
		else if (user > 0)
		{
			System.out.println("This is a " + absoluteValue + " positive number.");
		}
		else
		{
			System.out.println("This is a " + absoluteValue + " negative number.");
		}
	}

}
