package custome_tshirts;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(Lifecycle.PER_METHOD)
class ColorTest {
	
	private Color[] colors;
	private final short VALUE1 = 100;
	private final short VALUE2 = 255;
	private final short VALUE3 = -5;
	private final int ARRAY_SIZE = 3;
	
	public ColorTest()
	{
		colors = new Color[ARRAY_SIZE];
		colors[0] = new Color(VALUE1,VALUE1,VALUE1);
		colors[1] = new Color(VALUE2,VALUE2,VALUE3);
		colors[2] = new Color(VALUE3,VALUE2,VALUE1);
	}

	@Test
	void testArrayNotNull() {
		assertNotNull(colors);
	}
	
	@Test
	void testEqualityOfFields() {
		
		short[][] values = new short[ARRAY_SIZE][3];
		for (int i=0; i<ARRAY_SIZE; i++)
		{
			values[i] = new short[] {colors[i].red,colors[i].green, colors[i].blue};
		}
		short[][] expected = new short[ARRAY_SIZE][3];
		expected[0] = new short[]{VALUE1, VALUE1, VALUE1};
		expected[1] = new short[] {VALUE2,VALUE2,Color.getMinRange()};
		expected[2] = new short[] {Color.getMinRange(),VALUE2,VALUE1};
		assertArrayEquals(expected, values);
		
//		assertEquals(VALUE1,colors[0].red); 
//		assertEquals(VALUE1,colors[0].green);
//		assertEquals(VALUE1,colors[0].blue); 
//		
//		assertEquals(VALUE2, colors[1].red);
//		assertEquals(VALUE2, colors[1].green);
//		assertEquals(Color.getMinRange(), colors[1].blue);
//		
//		assertEquals(Color.getMinRange(), colors[2].red);
//		assertEquals(VALUE2, colors[2].green);
//		assertEquals(VALUE1, colors[2].blue);

	}
	
	@Test
	void testEqualityOfDominantsArray()
	{
		String[] dominants = new String[colors.length];
		for (int i=0; i<colors.length; i++)
			dominants[i] = colors[i].getDominant();
		String[] expected = {"Red","Red","Green"};
		assertArrayEquals(expected, dominants);
	}
	
	@Test
	void testEqualityOfNormalizedValues()
	{
		float[][] normalColors = new float[ARRAY_SIZE][3];
		for (int i=0; i<ARRAY_SIZE; i++)
		{
			normalColors[i] = colors[i].normalized();
		}
		float[][] expected = new float[ARRAY_SIZE][3];
		short maxRange = Color.getMaxRange();
		for (int i=0; i<ARRAY_SIZE; i++)
		{
				expected[i][0] = colors[i].red/maxRange;
				expected[i][1] = colors[i].green/maxRange;
				expected[i][2] = colors[i].blue/maxRange;
		}

		assertArrayEquals(expected, normalColors);

	}
	
	@Test
	void testEmptyConstructor()
	{
		Color newColor = new Color();
		assertEquals(Color.getMinRange(), newColor.red);
		assertEquals(Color.getMinRange(), newColor.green);
		assertEquals(Color.getMinRange(), newColor.blue);

	}
}
