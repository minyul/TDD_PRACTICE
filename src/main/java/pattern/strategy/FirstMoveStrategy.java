package pattern.strategy;

public class FirstMoveStrategy implements MoveableStrategy {

	@Override
	public void move() {
		System.out.println("첫번째 전략!");
	}
}

