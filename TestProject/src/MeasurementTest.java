import static org.junit.Assert.*;

import org.junit.Test;

public class MeasurementTest {

	@Test
	public void testAdd() {
		Measurement me=new Measurement(10);
		Measurement me1=new Measurement(20);
		me.add(me1);
		int ans=me.getValue();
		System.out.println(ans);
		assertEquals(30,me.getValue());
	}

	@Test
	public void testSub() {
		Measurement me=new Measurement(50);
		Measurement me1=new Measurement(20);
		me.sub(me1);
		int ans=me.getValue();
		System.out.println(ans);
		assertEquals(30,me.getValue());
	}

}
