package parttern.firstclass;

import firstclass.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameTest {

	@DisplayName("네임의 일급객체를 동일함을 확인하는 테스트")
	@Test
	void test_name() {
		Name name = new Name("minyul");
		assertThat(name).isEqualTo(new Name("minyul"));
	}
}
