import java.util.Scanner;

public class Ch5E_5IntegerPairs {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		
		int a,b, c, d;
		System.out.print("Please enter four numbers seperated by spaces: ");
		a = keyboardIn.nextInt();
		b = keyboardIn.nextInt();
		c = keyboardIn.nextInt();
		d = keyboardIn.nextInt();
		
		if ((a == b) && (c == d))
		{
			System.out.println("These are two pairs.");
		}
		else if ((a == c) && (b == d))
		{
			System.out.println("These are two pairs.");
		}
		else if ((a == d) && (b == c))
		{
			System.out.println("These are two pairs.");
		}
		else 
		{
			System.out.println("These are not pairs.");
		}

	}

}
