package javabootcamp.design_patterns.factory;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for dark theme, 2 for bright theme");
		int choice = sc.nextInt();
		Theme theme;
		ThemeFactory factory;
		if (choice == 1)
			factory = new DarkThemeFactory();
		else
			factory = new BrightThemeFactory();
		theme = factory.createTheme();
		sc.close();
	}

}
