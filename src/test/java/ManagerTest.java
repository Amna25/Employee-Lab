import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    management.Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jack", "A08786876", 25000, "DIY");
    }
    @Test
    public void getName(){
        assertEquals("Jack", manager.getName());
    }

    @Test
    public void getNiNumb(){
        assertEquals("A08786876", manager.getNiNumber());
    }

    @Test
    public void getDeptName(){
        assertEquals("DIY", manager.getDeptName());
    }

    @Test
    public void getSalary(){
        assertEquals(25000, manager.getSalary());
    }
    @Test
    public void getIncreasedSalary(){
        manager.raiseSalary(1.1);
        assertEquals(27500,manager.getSalary());
    }

    @Test
    public void getBonusTest(){
        assertEquals(250, manager.payBonus());

    }

}
