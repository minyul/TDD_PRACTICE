package pattern.strategy2;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Random random = new Random();
		MainGeneratorStrategy strategy = new MainGeneratorStrategy(random);

		Car car = new Car();
		car.move(strategy);
	}
}
