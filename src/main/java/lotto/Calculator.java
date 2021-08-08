package lotto;

public class Calculator {

	public Integer calculate(final String input) {
		String[] numbers = input.split(",|:");
		Integer sum = 0;
		for(String number : numbers) {
			sum += Integer.parseInt(number);
		}
		return sum;
	}
}
