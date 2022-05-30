import java.util.Scanner;

public class Ch5E_7NumericGrade {
	
	public static double getNumericGrade(String grade)
	{
		final double A_VALUE = 4.0;
        final double B_VALUE = 3.0;
        final double C_VALUE = 2.0;
        final double D_VALUE = 1.0;
        final double F_VALUE = 0.0;
        final double PLUS_OR_MINUS_ADJUSTMENT = 0.3;
        double numericValue = F_VALUE;
        
        if (grade.charAt(0) == 'A')
        {
            numericValue = A_VALUE;
        }
        if (grade.charAt(0) == 'B')
        {
            numericValue = B_VALUE;
        }
        if (grade.charAt(0) == 'C')
        {
            numericValue = C_VALUE;
        }
        
        if (grade.charAt(0) == 'D')
        {
            numericValue = D_VALUE;
        }
        if (grade.charAt(0) == 'F')
        {
            numericValue = F_VALUE;
        }
        
        if (grade.length() == 2)
        {
        	if (grade.charAt(1) == '+')
        	{
        		if (grade.charAt(0) != 'A')
        		{
        			numericValue += PLUS_OR_MINUS_ADJUSTMENT;
        		}
        	}
        	else
        	{
        		numericValue -= PLUS_OR_MINUS_ADJUSTMENT;
        	}
        }
        
        return numericValue;
        
	}

	public static void main(String[] args) {
		
		Scanner keyboardIn = new Scanner(System.in);

		System.out.print("Please enter a letter grade: ");
		String grade = keyboardIn.next();
		
		System.out.println("The numeric value of the grade is " + Ch5E_7NumericGrade.getNumericGrade(grade));
	}

}
