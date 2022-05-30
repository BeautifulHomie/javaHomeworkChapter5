import java.util.Scanner;

public class Ch5E_9LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("Please enter three numbers sepereated by spaces: ");
		double a = keyboardIn.nextDouble();
		double b = keyboardIn.nextDouble();
		double c = keyboardIn.nextDouble();
		
		double biggest = 0;
		
		if (a > b)
		{
			if (c > a)
			{
				biggest = c;
			}
			else
			{
				biggest = a;
			}
		}
		else 
		{
			if (c > b)
			{
				biggest = c;
			}
			else
			{
				biggest = b;
			}
		}
		
		System.out.println("The largest number is " + biggest + ".");
		
	}

}
