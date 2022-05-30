import java.util.Scanner;

public class Ch5E_1IntegerNegativePositiveZero {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int user = keyboardInput.nextInt();
		
		if (user < 0)
		{
			System.out.println("Integer is negative.");
		}
		else if (user == 0)
		{
			System.out.println("Integer is zero.");
		}	
		else System.out.println("Integer is positive");
	}

}
