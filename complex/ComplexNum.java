package javabootcamp.oop.complex;

public class ComplexNum implements Complexable {
	
	// a+bi
	protected double a;
	protected double b;
	
	public ComplexNum()
	{
		setA(0);
		setB(0);
	}
	
	public ComplexNum(double a, double b)
	{
		setA(a);
		setB(b);
	}

	public double getA() {
		return a;
	}
	
	
	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public void add(ComplexNum z) {
		setA(this.a+z.a);
		setB(this.b+z.b);
		
	}

	public void subtract(ComplexNum z) {
		setA(this.a-z.a);
		setB(this.b-z.b);
		
	}

	public void multiply(ComplexNum z) {
		setA(this.a*z.a-this.b*z.b);
		setB(this.a*z.b+this.b*z.a);
		
	}


	public void divide(ComplexNum z) {
		double firstFrac = (this.a*z.a + this.b*z.b)/(Math.pow(z.a, 2)+Math.pow(z.b, 2));
		double secondFrac = (this.b*z.a - this.a*z.b)/(Math.pow(z.a, 2)+Math.pow(z.b, 2));
		setA(firstFrac);
		setB(secondFrac);
	}

	/**
	 * Adds two ComplexNum.
	 * 
	 * @param z1 the first ComplexNum.
	 * @param z2 the second ComplexNum.
	 * @return the resultant ComplexNum (z1 + z2).
	 */
	public static ComplexNum add(ComplexNum z1, ComplexNum z2) {
		double a = z1.a + z2.a;
		double b = z1.b + z2.b;
		ComplexNum result = new ComplexNum(a,b);

		return result;
	}

	/**
	 * Subtracts one ComplexNum from another.
	 * 
	 * @param z1 the first ComplexNum.
	 * @param z2 the second ComplexNum.
	 * @return the resultant ComplexNum (z1 - z2).
	 */
	public static ComplexNum subtract(ComplexNum z1, ComplexNum z2) {
		double a = z1.a - z2.a;
		double b = z1.b - z2.b;
		ComplexNum result = new ComplexNum(a,b);

		return result;
	}

	/**
	 * Multiplies one ComplexNum to another.
	 * 
	 * @param z1 the first ComplexNum.
	 * @param z2 the second ComplexNum.
	 * @return the resultant ComplexNum (z1 * z2).
	 */
	public static ComplexNum multiply(ComplexNum z1, ComplexNum z2) {
		double a = z1.a*z2.a - z1.b*z2.b;
		double b = z1.a*z2.b + z1.b*z2.a;
		ComplexNum result = new ComplexNum(a,b);

		return result;
	}
	
	/**
	 * Divides one ComplexNum by another.
	 * 
	 * @param z1 the first ComplexNum.
	 * @param z2 the second ComplexNum.
	 * @return the resultant ComplexNum (z1 / z2).
	 */
	public static ComplexNum divide(ComplexNum z1, ComplexNum z2) {
		double a = (z1.a*z2.a + z1.b*z2.b)/(Math.pow(z2.a, 2)+Math.pow(z2.b, 2));
		double b = (z1.b*z2.a - z1.a*z2.b)/(Math.pow(z2.a, 2)+Math.pow(z2.b, 2));
		ComplexNum result = new ComplexNum(a,b);
		return result;
	}

	public ComplexNum conjugate() {
		return new ComplexNum(this.a, -this.b);
	}

	public double mag() {
		return Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2));
	}

	
	public ComplexNum square() {
		return multiply(this,conjugate());
	}


	/**
	 * Calculates the ComplexNum to the passed integer power.
	 * 
	 * @param z     The input complex number
	 * @param power The power.
	 * @return a ComplexNum which is (z)^power
	 */
	public static ComplexNum pow(ComplexNum z, int power) {
		double theta = Math.atan(z.b/z.a);
		double cos = Math.cos(theta*power);
		double sin = Math.sin(theta*power);
		double r = Math.pow(z.mag(),power);
		double a = cos*r;
		double b = sin*r;

		return new ComplexNum(a,b);
	}


	public ComplexNum inverse() {
		
		double denom = Math.pow(this.a, 2) + Math.pow(this.b, 2);
		double a = this.a/denom;
		double b = this.b/denom;
		return new ComplexNum(a,-b);
		
	}
	
	@Override
	public boolean equals(Object z)
	{
		if (this == z)
			return true;
		if (!(z instanceof ComplexNum))
			return false;
		ComplexNum other = (ComplexNum) z;
		if (other.a != this.a)
			return false;
		if (other.b != this.b)
			return false;
		return true;
		
	}
	

	/**
	 * Parses the String as a ComplexNum of type x+yi.
	 * 
	 * @param s the input complex number as string
	 * @return a ComplexNum which is represented by the string.
	 */
	public static ComplexNum parseComplex(String s)
	{
		int indexOfPlus = s.indexOf('+');
		String first = s.substring(0,indexOfPlus);
		int indexOfi = s.indexOf('i');
		String second = s.substring(indexOfPlus+1, indexOfi);
		double a = Double.parseDouble(first);
		double b = Double.parseDouble(second);
		return new ComplexNum(a,b);
	}
	
	@Override
	public String toString()
	{
		return String.format("%.2f+%.2fi", this.a,this.b);
	}

}
