import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    techStaff.Developer developer;

    @Before
    public void before(){
        developer = new Developer("Amna Bashir", "A45678", 52000);
    }

    @Test
    public void getName(){
        assertEquals("Amna Bashir", developer.getName());
    }

    @Test
    public void getNiNumb(){
        assertEquals("A45678", developer.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(52000, developer.getSalary());
    }
    @Test
    public void getIncreasedSalary(){
        developer.raiseSalary(1.1);
        assertEquals(57200,developer.getSalary());
    }

    @Test
    public void getBonusTest(){
        assertEquals(520, developer.payBonus());

    }

}
