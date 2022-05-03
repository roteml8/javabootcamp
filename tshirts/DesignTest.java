package custome_tshirts;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(Lifecycle.PER_CLASS)
class DesignTest {
	
	private Design design = new Design();

	@Test
	void testDesignFields() {
		assertEquals(Design.getMinWidth(), design.width);
		assertEquals(Design.getMinHeight(), design.height);
		assertEquals(Design.getDefaultSlogan(), design.slogan);
		Color defaultColor = new Color();
		assertEquals(defaultColor, design.color);
		assertEquals(Design.getMinComplexity(), design.complexity);

	}
	
	@Test
	void testSetComplexity()
	{
		design.setComplexity(50);
		assertEquals(50, design.complexity);
		design.setComplexity(0);
		assertEquals(Design.getMinComplexity(), design.complexity);
		design.setComplexity(200);
		assertEquals(Design.getMinComplexity(), design.complexity);
	}
	
	@Test
	void testSetWidth()
	{
		design.setWidth(25);
		assertEquals(25, design.width);
		design.setWidth(50);
		assertEquals(Design.getMinWidth(), design.width);
		design.setWidth(10);
		assertEquals(Design.getMinWidth(), design.width);
	}
	
	@Test
	void testSetHeight()
	{
		design.setHeight(20);
		assertEquals(20, design.height);
		design.setHeight(-5);
		assertEquals(Design.getMinHeight(), design.height);
		design.setHeight(100);
		assertEquals(Design.getMinHeight(), design.height);
		
	}
	
	@Test
	void testSetSlogan()
	{
		design.setSlogan("Hello World");
		assertEquals("Hello World", design.slogan);
		design.setSlogan("!#G123");
		assertEquals(Design.getDefaultSlogan(), design.slogan);
		design.setSlogan(null);
		assertEquals(Design.getDefaultSlogan(), design.slogan);
		
	}
	
	@Test
	void testSetColor()
	{
		Color newColor = new Color(100,200,250);
		design.setColor(newColor);
		assertEquals(newColor, design.color);
		design.setColor(null);
		Color defaultColor = new Color();
		assertEquals(defaultColor, design.color);

	}
	
	@Test
	void testCalculateArea()
	{
		assertEquals(20*10, design.calculateArea());
	}

}
