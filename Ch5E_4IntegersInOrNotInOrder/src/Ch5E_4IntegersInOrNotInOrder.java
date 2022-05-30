import java.util.Scanner;

public class Ch5E_4IntegersInOrNotInOrder {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		
		int a,b,c;
		System.out.print("Please enter three numbers divided by spaces: ");
		a = keyboardIn.nextInt();
		b = keyboardIn.nextInt();
		c = keyboardIn.nextInt();
		
		if (a < b && b < c)
		{
			System.out.println("In order.");
		}
		else if (a > b && b > c)
		{
			System.out.println("In order.");
		}
		else 
		{
			System.out.println("Not in order.");
		}
		
	}

}
