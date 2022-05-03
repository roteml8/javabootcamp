package custome_tshirts;

public class Runner {

	public static void main(String[]args)
	{
		Tshirt[] tshirts = new Tshirt[3];
		Color color1 = new Color((short)100,(short)100,(short)100);
		Color color2 = new Color((short)0,(short)150,(short)255);
		Design design1 = new Design(20,20,"Hello!!! World",color1,1);
		Design design2 = new Design(100,50,"I love hamburger",color2,0.5);
		Tshirt tshirt1 = new Tshirt(TshirtSize.S,design1,0.3,3);
		Tshirt tshirt2 = new Tshirt(TshirtSize.M, design2,0.5,5);
		Tshirt tshirt3 = new Tshirt();
		tshirts[0] = tshirt1;
		tshirts[1] = tshirt2;
		tshirts[2] = tshirt3;
		for (int i=0; i<tshirts.length; i++)
			System.out.println(tshirts[i]);
		
	}
}
