package lotto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

	@Test
	@ParameterizedTest
	@CsvSource(value = {" |0", "1,2|3", "1,2:3|6"}, delimiter = '|')
	void add_calculate(String paramOne, int paramTwo) {
		Calculator calculator = new Calculator();
		int result = calculator.calculate(paramOne);
		assertThat(result).isEqualTo(paramTwo);
	}
}
