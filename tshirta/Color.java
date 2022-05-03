package custome_tshirts;

import java.util.Objects;

public class Color {
	
	private static final short MIN_RANGE = 0;
	private static final short MAX_RANGE = 255;
	private static final short ARRAY_SIZE = 3;
	
	protected short red;
	protected short green;
	protected short blue;
	
	public Color(short red, short green, short blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public Color(int red, int green, int blue)
	{
		this((short)red, (short)green, (short)blue);
	}
	
	public Color()
	{
		setRed(MIN_RANGE);
		setGreen(MIN_RANGE);
		setBlue(MIN_RANGE);
		
	}

	protected void setRed(short red) {
		if (!Utils.isInRange(red, MIN_RANGE, MAX_RANGE))
			red = MIN_RANGE;
		this.red = red;
	}

	protected void setGreen(short green) {
		if (!Utils.isInRange(green, MIN_RANGE, MAX_RANGE))
			green = MIN_RANGE;
		this.green = green;
	}

	protected void setBlue(short blue) {
		if (!Utils.isInRange(blue, MIN_RANGE, MAX_RANGE))
			blue = MIN_RANGE;
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
	
	public String getDominant()
	{
		if (red >= blue && red >= green)
			return "Red";
		else if (blue >= red && blue >= green)
			return "Blue";
		return "Green";
	}
	
	public float[] normalized()
	{
		float[] normalized = new float[ARRAY_SIZE];
		normalized[0] = normalizeShort(red);
		normalized[1] = normalizeShort(green);
		normalized[2] = normalizeShort(blue);
		return normalized;
		
	}
	
	private float normalizeShort(short num)
	{
		return num/MAX_RANGE;
	}

	public static short getMinRange() {
		return MIN_RANGE;
	}

	public static short getMaxRange() {
		return MAX_RANGE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(blue, green, red);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		return blue == other.blue && green == other.green && red == other.red;
	}
	
	

}
