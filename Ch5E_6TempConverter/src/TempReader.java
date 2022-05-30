import java.util.Scanner;

public class TempReader {

	public static void main(String[] args) {
		Scanner KeyboardIn = new Scanner(System.in);
        
		System.out.print("Please enter the temperature with degree type (example, 13C or 80F): ");
        String input = KeyboardIn.nextLine();
        
        Temperature t = new Temperature(input);
        System.out.println(t.convertDisplay());

	}

}
