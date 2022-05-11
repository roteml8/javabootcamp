package javabootcamp.design_patterns.factory;

public class DarkTheme extends Theme {
	
	public DarkTheme()
	{
		setText(new BrightText());
	}

}
