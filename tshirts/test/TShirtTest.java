package custome_tshirts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TShirtTest {
	
	private Tshirt tshirt = new Tshirt();

	@Test
	void testValuesOfFields() {
		assertEquals(TshirtSize.L, tshirt.size);
		assertEquals(0.1, tshirt.demandFactor);
		assertEquals(3, tshirt.basePrice);
		Design defaultDesign = new Design();
		assertEquals(defaultDesign, tshirt.design);
	}
	
	@Test
	void testSetSize()
	{
		tshirt.setSize(TshirtSize.M);
		assertEquals(TshirtSize.M, tshirt.size);
		tshirt.setSize(null);
		assertEquals(Tshirt.getDefaultSize(), tshirt.size);
	}
	
	@Test
	void testSetDemandFactor()
	{
		tshirt.setDemandFactor(0.5);
		assertEquals(0.5, tshirt.demandFactor);
		tshirt.setDemandFactor(12);
		assertEquals(Tshirt.getMinFactor(), tshirt.demandFactor);
		tshirt.setDemandFactor(-3);
		assertEquals(Tshirt.getMinFactor(), tshirt.demandFactor);
		
	}

	@Test
	void testSetBasePrice()
	{
		tshirt.setBasePrice(10);
		assertEquals(10, tshirt.basePrice);
		tshirt.setBasePrice(1);
		assertEquals(Tshirt.getMinBase(), tshirt.basePrice);
	}
	
	@Test
	void testSetDesign()
	{
		Design defaultDesign = new Design();
		tshirt.setDesign(null);
		assertEquals(defaultDesign, tshirt.design);
		Color color = new Color(50,100,150);
		Design design = new Design(20,20,"Rotem Levi",color,50);
		tshirt.setDesign(design);
		assertEquals(design, tshirt.design);

	}
	
	@Test
	void testIsExpensive()
	{
		double price = tshirt.calculateFinalPrice();
		assertEquals(tshirt.isExpensive(), price >= Tshirt.getExpensivePrice());
	}
	
	@Test
	void testFinalPrice()
	{
		double expected = tshirt.calculateFinalPrice();
		double actual = (tshirt.basePrice+tshirt.design.complexity) * tshirt.design.calculateArea()/tshirt.demandFactor;
		assertEquals(expected,actual);
	}
}
