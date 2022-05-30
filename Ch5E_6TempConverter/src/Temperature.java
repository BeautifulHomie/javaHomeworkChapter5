
public class Temperature {
	private String tempType;
	private int degrees;
	
	public Temperature(String temp)
	{
		int lengthOfInput = temp.length();
		
		if (lengthOfInput < 2)
		{
			tempType = "?";
			degrees = 0;
		}
		else
		{
			tempType = temp.substring(lengthOfInput - 1);
			degrees = Integer.parseInt(temp.substring(0, lengthOfInput - 1));
		}
	}
		
	public String convertDisplay()
	{
		String output = "";
		int convertedDegrees;
		
		if(tempType.equalsIgnoreCase("C"))
		{
			convertedDegrees = (degrees * 9 /5) + 32;
			output += degrees + " degrees Celsius is equal to " + convertedDegrees + " degrees Fahrenheit";
		}
		else
		{
			convertedDegrees = (degrees -32) * 5 /9;
			output += degrees + " degrees Fahrenheit is equal to " + convertedDegrees + " degrees Celsius";
		}
		
	return output;
	
	}
	
}
