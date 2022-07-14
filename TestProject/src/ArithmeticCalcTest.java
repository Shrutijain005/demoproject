import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticCalcTest {
	
	

	@Test(expected=ArithmeticException.class)
	public void testCalc() {
		ArithmeticCalc ac=new ArithmeticCalc();
		ac.calc(2,2);
	}

}
