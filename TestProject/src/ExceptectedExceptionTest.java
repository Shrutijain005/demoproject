import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptectedExceptionTest {

	@Test
	void testExceptectedExceptionTest() {
		NumberFormatException nf=assertThrows(NumberFormatException.class,()->{
			Integer.parseInt("One");},"NumberFormat Exception is expected"
		);
		assertEquals("For input string: \"One\"",nf.getMessage());
	}

	@Test
	void testWithParentType() {
		assertThrows(IllegalArgumentException.class,()->{
			Integer.parseInt("One");
		});
	}
}
