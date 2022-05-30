import java.util.Scanner;

public class Ch5E10LexicographicalStrings {

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("Please enter three names seperated by spaces: ");
	    
		String a = keyboardIn.next();
	    String b = keyboardIn.next();
	    String c = keyboardIn.next();
	      
	    String first = "";
	    String second = "";
	    String third = "";
	    
	    if (a.compareTo(b) < 0)
	    {
	    	if (a.compareTo(c) < 0)
	    	{
	    		first = a;
	    		if (b.compareTo(c) < 0)
	    		{
	    			second = b;
	    			third = c;
	    		}
	    		else
	    		{
	    			second = c;
	    			third = b;
	    		}
	    	}
	    	else
	    	{
	    		first = c;
	    		second = a;
	    		third = b;
	    	}
	    }
	    else
	    {
	    	if (b.compareTo(c) < 0)
	    	{
	    		first = b;
	    		if (a.compareTo(c) < 0)
	    		{
	    			second = a;
	    			third = c;
	    		}
	    		else
	    		{
	    			second = c;
	    			third = a;
	    		}
	    	}
	    	else
	    	{
	    		first = c;
	    		second = b;
	    		third = a;
	    	}
	    }
	    
	    System.out.printf("%s\n%s\n%s\n", first, second, third);
	}
}
