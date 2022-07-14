import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
@RunWith(Parameterized.class)
public class FactorialTest {

	private int input;
	private int expectedResult;
	private Factorial f;
	
	public FactorialTest(int input,int expectedResult) {
		this.input=input;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Iterable<Object[]> arr(){
		return Arrays.asList(new Object[][] {
			{0,1},
			{1,1},
			{3,6},
			{5,120}
		});
	}
	
	@Before
	public void initate() {
		f=new Factorial();
	}
	
	@Test
	public void test() {
		int output=f.fact(input);
		assertEquals(expectedResult,output);
	}

}
