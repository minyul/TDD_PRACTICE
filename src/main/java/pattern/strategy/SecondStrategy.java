package pattern.strategy;

public class SecondStrategy implements MoveableStrategy {

	@Override
	public void move() {
		System.out.println("두번째 전략!");
	}
}
