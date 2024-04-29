package headfirst.decorator.starbuzz;

public class StarbuzzCoffee {
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

		// Ex8-1 (1) HouseBlend 커피에 Soy 1번, Mocha 2번, Whip 2번의 순서로 추가하여 가격 계산
		Beverage houseBlend1 = new HouseBlend();
		System.out.println(houseBlend1.getDescription() + " $" + houseBlend1.cost());
		houseBlend1 = new Soy(houseBlend1);
		houseBlend1 = new Mocha(houseBlend1);
		houseBlend1 = new Mocha(houseBlend1);
		houseBlend1 = new Whip(houseBlend1);
		houseBlend1 = new Whip(houseBlend1);
		System.out.println(houseBlend1.getDescription() + " $" + houseBlend1.cost());

		// Ex8-1 (2) HouseBlend 커피에 위의 역순으로 추가하여 가격 계산
		Beverage houseBlend2 = new HouseBlend();
		System.out.println(houseBlend2.getDescription() + " $" + houseBlend2.cost());
		houseBlend2 = new Whip(houseBlend2);
		houseBlend2 = new Whip(houseBlend2);
		houseBlend2 = new Mocha(houseBlend2);
		houseBlend2 = new Mocha(houseBlend2);
		houseBlend2 = new Soy(houseBlend2);
		System.out.println(houseBlend2.getDescription() + " $" + houseBlend2.cost());

		// Ex8-1 (3) HouseBlend 커피를 DarkRoast로 꾸미기 시도
		Beverage houseBlend3 = new HouseBlend();
		// houseBlend3 = new DarkRoast(houseBlend3);
		// The constructor DarkRoast(Beverage) is undefined

		// Ex8-1 (4) Mocha를 Beverage로 하여 Whip 추가 시도
		// Beverage mocha = new Mocha();
		// The constructor Mocha() is undefined
	}
}
