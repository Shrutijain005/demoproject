import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class EmployeeTest {


	@Test(expected = EmployeeNotFound.class)
    public void testGetEmployee() {
        Employee em = new Employee();
        em.getEmployee(1);
    }

}
