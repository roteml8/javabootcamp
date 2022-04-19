package javabootcamp.oopexam.runner;

import java.time.LocalDate;

import javabootcamp.oopexam.agegroup.AgeGroup;
import javabootcamp.oopexam.doll.Doll;
import javabootcamp.oopexam.electrictoy.ElectricToy;
import javabootcamp.oopexam.kid.Kid;
import javabootcamp.oopexam.toy.Toy;

public class Runner {
	
	public static void main(String[]args)
	{
		LocalDate bday = LocalDate.of(2020, 8, 8); // age 1
		LocalDate bday2 = LocalDate.of(2018, 4, 5); // age 4
		LocalDate bday3 = LocalDate.of(2015, 1, 15); // age 7
		Kid kid = new Kid("Rotem", bday);
		Kid kid2 = new Kid("Yaron",bday3);
		Kid kid3 = new Kid("Matan",bday2);
		Toy doll1 = new Doll("Teddy bear",LocalDate.now(),AgeGroup.A,true, 1, kid);
		Toy doll2 = new Doll("barbie",LocalDate.now(),AgeGroup.C,false, 5, kid);
		Toy elecToy1 = new ElectricToy("car",LocalDate.of(2020, 1, 1),AgeGroup.C,2,0, kid2);
		Toy elecToy2 = new ElectricToy("car",LocalDate.now(),AgeGroup.C,2,0, kid2);
		Toy elecToy3 = new ElectricToy("airplane", LocalDate.now(), AgeGroup.B, 5, 3, kid3);

		Toy[] toys = new Toy[5];
		toys[0] = doll1;
		toys[1] = doll2;
		toys[2] = elecToy1;
		toys[3] = elecToy2;
		toys[4] = elecToy3;
		for (int i = 0; i < toys.length; i++) {
			toys[i].toString();
			toys[i].play();	
		}

		
	}

}
