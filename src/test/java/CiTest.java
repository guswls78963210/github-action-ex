import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CiTest {

	@Test
	void success(){

		Assertions.assertEquals(1, 1);
	}

	@Test
	void fail(){

		Assertions.assertEquals(1, 0);
	}
}
