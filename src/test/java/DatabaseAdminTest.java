import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    techStaff.DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Amna Bashir", "A45678", 52000);
    }

    @Test
    public void getName(){
        assertEquals("Amna Bashir", databaseAdmin.getName());
    }

    @Test
    public void getNiNumb(){
        assertEquals("A45678", databaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(52000, databaseAdmin.getSalary());
    }
    @Test
    public void getIncreasedSalary(){
        databaseAdmin.raiseSalary(1.1);
        assertEquals(57200,databaseAdmin.getSalary());
    }

    @Test
    public void getBonusTest(){
        assertEquals(520, databaseAdmin.payBonus());

    }




}
