package pattern.strategy2;

public class Car {

	private static final int MOVE_RANGE = 4;

	private int position;

	public Car(int position) {
		this.position = position;
	}

	public void move(NumberGenerator generator) {
		if (generator.getRandom() > MOVE_RANGE) {
			position++;
		}
	}
}
