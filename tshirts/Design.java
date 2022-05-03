package custome_tshirts;

import java.util.Objects;

public class Design {
	
	private static final double MIN_WIDTH = 20;
	private static final double MAX_WIDTH = 30;
	private static final double MIN_HEIGHT = 10;
	private static final double MAX_HEIGHT = 25;
	private static final double MIN_COMPLEXITY = 1;
	private static final double MAX_COMPLEXITY = 100;
	private static final String DEFAULT_SLOGAN = "Java is Great";

	protected double width;
	protected double height;
	protected String slogan;
	protected Color color;
	protected double complexity;
	
	
	public Design(double width, double height, String slogan, Color color, double complexity) {
		setWidth(width);
		setHeight(height);
		setSlogan(slogan);
		setColor(color);
		setComplexity(complexity);
	}
	
	public Design()
	{
		setWidth(MIN_WIDTH);
		setHeight(MIN_HEIGHT);
		setSlogan(DEFAULT_SLOGAN);
		setColor(new Color());
		setComplexity(MIN_COMPLEXITY);
		
	}
	
	protected void setWidth(double width) {
		if (!Utils.isInRange(width, MIN_WIDTH, MAX_WIDTH))
			width = MIN_WIDTH;
		this.width = width;
	}
	
	protected void setHeight(double height) {
		if (!Utils.isInRange(height, MIN_HEIGHT, MAX_HEIGHT))
			height = MIN_HEIGHT;
		this.height = height;
	}
	
	protected void setSlogan(String slogan) {
		if (slogan == null || !Utils.isAlphanumeric(slogan))
			slogan = DEFAULT_SLOGAN;
		this.slogan = slogan;
	}
	
	protected void setColor(Color color) {
		if (color == null)
			color = new Color();
		this.color = color;
	}
	
	protected void setComplexity(double complexity) {
		if (!Utils.isInRange(complexity, MIN_COMPLEXITY, MAX_COMPLEXITY))
			complexity = MIN_COMPLEXITY;
		this.complexity = complexity;
	}
	
	public double calculateArea()
	{
		return height*width;
	}



	@Override
	public String toString() {
		return "Design [width=" + width + ", height=" + height + ", slogan=" + slogan + ", " + color
				+ ", complexity=" + complexity + "]";
	}

	public double getComplexity() {
		return complexity;
	}

	public static double getMinWidth() {
		return MIN_WIDTH;
	}

	public static double getMinHeight() {
		return MIN_HEIGHT;
	}

	public static double getMinComplexity() {
		return MIN_COMPLEXITY;
	}

	public static String getDefaultSlogan() {
		return DEFAULT_SLOGAN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, complexity, height, slogan, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Design other = (Design) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(complexity) == Double.doubleToLongBits(other.complexity)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(slogan, other.slogan)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}
	
	
	
}
