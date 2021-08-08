package lotto;

public class Calculator {

	private static final Integer INIT_SUM = 0;

	public Integer calculate(final String input) {
		String[] numbers = input.split(",|:");
		return getResult(numbers);
	}

	private Integer getResult(final String[] numbers) {
		Integer sum = INIT_SUM;
		for (String number : numbers) {
			sum += Integer.parseInt(number);
		}
		return sum;
	}
}
