import staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    staff.Employee employee;

    @Before
    public void before(){
        employee = new Employee("Jack", "A08786876", 25000);
    }
    @Test
    public void getName(){
        assertEquals("Jack", employee.getName());
    }

    @Test
    public void getNiNumb(){
        assertEquals("A08786876", employee.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(25000, employee.getSalary());
    }
    @Test
    public void getIncreasedSalary(){
        employee.raiseSalary(1.1);
        assertEquals(27500,employee.getSalary());
    }

    @Test
    public void getBonusTest(){
        assertEquals(250, employee.payBonus());

    }
    @Test
    public void getNegativeSalary(){

        assertEquals("can not enter negative value", employee.raiseSalary(-1.1));
    }

    @Test
    public void testEmptyName(){
        assertEquals("can't be empty", employee.inputName(""));
    }

    @Test
    public void testName(){
        employee.inputName("Tom");
        assertEquals("Tom", employee.name);
    }
}
