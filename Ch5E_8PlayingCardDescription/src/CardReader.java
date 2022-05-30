import java.util.Scanner;

public class CardReader {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);

        System.out.print("Please enter a card notation: ");
        String input = keyboardIn.nextLine();
        
        Card card = new Card(input);
        System.out.println(card.getDescription());

	}

}
