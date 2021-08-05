package parttern.strategy2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.strategy2.Car;
import pattern.strategy2.NumberGenerator;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

	@DisplayName("숫자 4이하를 Car가 받았을 때, 움직이는지 확인하는 테스트")
	@Test
	void car_move_test() {
		Car car = new Car(0);
		NumberGenerator numberGenerator = new NumberGenerator() {
			@Override
			public int getRandom() {
				return 4;
			}
		};
		car.move(numberGenerator);
		assertThat(car).extracting("position").isEqualTo(Arrays.asList(0));
	}
}
