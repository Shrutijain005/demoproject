
import org.junit.*;

public class AllAnnotate {
	@Test
	public void test1() {
		System.out.println("Test method1 called");
	}
	
	@Before
	public void testBefore() {
		System.out.println("Before method1 called");
	}
	
	@After
	public void testAfter() {
		System.out.println("After method1 called");
	}
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Before Class method1 called");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("AfterClass method1 called");
	}
	
	@Ignore
	@Test
	public void testIgnore() {
		System.out.println("testIgnore");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
