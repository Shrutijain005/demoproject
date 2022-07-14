import static org.junit.Assert.*;

import org.junit.*;

import java.util.*;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class PrimeNoTest {

	private Integer input;
	private Boolean expectedResult;
	PrimeNo p;
	
	
	//constructor
	
	public PrimeNoTest(Integer nums,Boolean expectedResult) {
		input=nums;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection pNums() {
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{23,true},
			{22,false}
		});
	}
	
	@Before
	public void initate() {
		p=new PrimeNo();
	}
	
	@Test
	public void testValidate() {
		assertEquals(expectedResult,p.validate(input));
	}

}
