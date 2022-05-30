
public class Card {
	
	private String cardValue;
	private String suit;
	
	public Card(String userInput)
	{
		int n = userInput.length();
		
		if (n < 2)
		{
			cardValue = "?";
			suit = "?";
		}
		else
		{
			suit = userInput.substring(n - 1);
			cardValue = userInput.substring(0, n - 1);
		}		
	}
	
	public String getDescription()
	{
		String output = "";
		
		cardValue = cardValue.toUpperCase();
		suit = suit.toUpperCase();
		
		switch(cardValue)
		{
		case "A":
			output = "Ace";
            break;
        case "K":
            output = "King";
            break;
        case "Q":
            output = "Queen";
            break;
        case "J":
            output = "Jack";
            break;
        case "2":
            output = "Two";
            break;
        case "3":
        	output = "Three";
        	break;
        case "4":
        	output = "Four";
        	break;
        case "5":
        	output = "Five";
        	break;
        case "6":
        	output = "Six";
        	break;
        case "7":
        	output = "Seven";
        	break;
        case "8":
        	output = "Eight";
        	break;
        case "9":
        	output = "Nine";
        	break;
        
        default:
            output = "Unknown";
            break;
		}
		
		output = output + " of ";
		
		switch(suit)
		{
		case "S":
			output = output + "Spades";
			break;
		case "D":
			output = output + "Diamonds";
			break;
		case "H":
			output = output + "Hearts";
			break;
		case "C":
			output = output + "Clubs";
			break;
		}
		
		return output;
		
	}

}
