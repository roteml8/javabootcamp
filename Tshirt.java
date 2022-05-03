package custome_tshirts;

public class Tshirt {
	
	private static final double MIN_FACTOR = 0.1;
	private static final double MAX_FACTOR = 1;
	private static final double MIN_BASE = 3;
	private static final int EXPENSIVE_PRICE = 10000; 
	private static final TshirtSize DEFAULT_SIZE = TshirtSize.L;
	
	protected TshirtSize size;
	protected Design design;
	protected double demandFactor;
	protected double basePrice;
	
	
	
	public Tshirt(TshirtSize size, Design design, double demandFactor, double basePrice) {
		setSize(size);
		setDesign(design);
		setDemandFactor(demandFactor);
		setBasePrice(basePrice);
	}
	
	public Tshirt()
	{
		setSize(DEFAULT_SIZE);
		setDesign(new Design());
		setDemandFactor(MIN_FACTOR);
		setBasePrice(MIN_BASE);
	}
	
	protected void setSize(TshirtSize size) {
		if (size == null)
			size = DEFAULT_SIZE;
		this.size = size;
	}
	
	
	protected void setDemandFactor(double demandFactor) {
		if (!Utils.isInRange(demandFactor, MIN_FACTOR, MAX_FACTOR))
			demandFactor = MIN_FACTOR;
		this.demandFactor = demandFactor;
	}
	
	protected void setBasePrice(double basePrice) {
		if (basePrice < MIN_BASE)
			basePrice = MIN_BASE;
		this.basePrice = basePrice;
	}

	

	protected void setDesign(Design design) {
		if (design == null)
			design = new Design();
		this.design = design;
	}


	@Override
	public String toString() {
		return "Tshirt [size=" + size + ", " + design + ", demandFactor=" + demandFactor + ", basePrice="
				+ basePrice + "]";
	}
	
	public double calculateFinalPrice()
	{
		return (basePrice + design.getComplexity()) * design.calculateArea()/demandFactor;
	}
	
	public boolean isExpensive()
	{
		return calculateFinalPrice() >= EXPENSIVE_PRICE;
	}

	public static double getMinFactor() {
		return MIN_FACTOR;
	}

	public static double getMinBase() {
		return MIN_BASE;
	}

	public static int getExpensivePrice() {
		return EXPENSIVE_PRICE;
	}

	public static TshirtSize getDefaultSize() {
		return DEFAULT_SIZE;
	}
	
	
}
