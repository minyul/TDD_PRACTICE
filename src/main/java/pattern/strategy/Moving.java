package pattern.strategy;

public class Moving {

	private MoveableStrategy strategy;

	public void move() {
		strategy.move();
	}

	public void setStrategy(MoveableStrategy strategy) {
		this.strategy = strategy;
	}
}
