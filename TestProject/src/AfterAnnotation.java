import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


class AfterAnnotation {

	@RepeatedTest(3)
	void addNum(TestInfo testInfo,RepetitionInfo repetitioninfo)
	{
		System.out.println("Running Test :"+repetitioninfo.getCurrentRepetition());
		assertEquals(2,Calculator.add(1,1),"adding 1+1");
	}
	
	//@Disabled
	@Test
	void testCalc() {
		assertEquals(6,Calculator.add(2,4));
	}

	@AfterAll
	public static void cleanUp() {
		System.out.println("After all cleanup methods");
	}
	
	@AfterEach
	public void cleanUpEach() {
		System.out.println("After each test case");
	}
}
