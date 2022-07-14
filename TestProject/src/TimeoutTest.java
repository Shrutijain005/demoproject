import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;



@Timeout(10)
class TimeoutTest {

	@Test
	void testInterrupted() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
	}
	
	
	@Test
	void testGetValue() throws InterruptedException
	{
		assertTimeout(Duration.ofSeconds(4),()->{getValue();});
	}
	
	//we want time to be less than 4sec then it'll run 
	String getValue() throws InterruptedException //not testcase just separate method
	{
		TimeUnit.SECONDS.sleep(3);
		return "";
	}

}
