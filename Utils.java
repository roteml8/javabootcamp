package custome_tshirts;

public class Utils {
	
	public static boolean isInRange(short value, short min, short max)
	{
		if (value < min || value > max)
			return false;
		return true;
	}
	
	public static boolean isInRange(double value, double min, double max)
	{
		if (value < min || value > max)
			return false;
		return true;
	}

	public static boolean isAlphanumeric(String string)
	{
		if (string == null)
			return false; 
		for (int i=0; i<string.length(); i++)
		{
			char current = string.charAt(i);
			if (!Character.isLetterOrDigit(current) && current != ' ')
				return false;
		}
		return true;
	}
}
