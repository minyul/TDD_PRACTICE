package pattern.strategy;

public class App {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Train train = new Train();

		bus.setStrategy(new FirstMoveStrategy());
		train.setStrategy(new SecondStrategy());

		bus.move();
		train.move();

		bus.setStrategy(new SecondStrategy());
		bus.move();
	}
}
