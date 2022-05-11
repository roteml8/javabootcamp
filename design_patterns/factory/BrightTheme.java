package javabootcamp.design_patterns.factory;

public class BrightTheme extends Theme{
	
	public BrightTheme()
	{
		setText(new DarkText());
	}


}
