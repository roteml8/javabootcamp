package javabootcamp.design_patterns.builder;

public class Runner {

	public static void main(String[] args) {
		
		Director director = new Director();
		PastryBuilder pastryBuilder = new PastryBuilder();
		RecipeBuilder recipeBuilder = new RecipeBuilder();
		
		director.constructDominicanPuffPastry(pastryBuilder);
		Pastry pastry = pastryBuilder.getResult();
		
		System.out.println(pastry);
		
		director.constructHawaiinPizzaRecipe(recipeBuilder);
		Recipe recipe = recipeBuilder.getResult();
		
		System.out.println(recipe);

	}

}
