import management.Director;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    management.Director director;

    @Before
    public void before(){
        director = new Director("Amna Bashir", "A45678", 52000, "IT", 100000);
    }

    @Test
    public void getName(){
        assertEquals("Amna Bashir", director.getName());
    }

    @Test
    public void getNiNumb(){
        assertEquals("A45678", director.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(52000, director.getSalary());
    }
    @Test
    public void getIncreasedSalary(){
        director.raiseSalary(1.1);
        assertEquals(57200,director.getSalary());
    }

    @Test
    public void getBonusTest(){
        assertEquals(520, director.payBonus());

    }

    @Test
    public void getDeptTest(){
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void getBudgetTest(){
        assertEquals(100000, director.getBudget());
    }

}
