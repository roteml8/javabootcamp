package javabootcamp.design_patterns.factory;

public class DarkThemeFactory implements ThemeFactory {

	@Override
	public Theme createTheme() {
		return new DarkTheme();
	}

}
