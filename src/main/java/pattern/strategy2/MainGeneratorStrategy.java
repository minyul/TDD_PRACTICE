package pattern.strategy2;

import java.util.Random;

public class MainGeneratorStrategy implements NumberGenerator {

	private final static int NUMBER_RANGE = 10;

	private Random random;

	public MainGeneratorStrategy(Random random) {
		this.random = random;
	}

	@Override
	public int getRandom() {
		return random.nextInt(NUMBER_RANGE);
	}
}
