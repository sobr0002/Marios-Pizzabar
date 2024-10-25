import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenuItemTest {

    private MenuItem menuItem;

    @BeforeEach /*Bruges til at metoden setUp() kører før hver testmetode, så vi har et
    MenuItem-objekt, som er tildelt faste værdier for hver eneste test */

    void setUp() {
        //Initialiserer menuItem med standardværdier for at kunne teste den
        menuItem = new MenuItem(1, 9.99f, "Burger");

    }
    @Test //Metode til at test om konstruktøren sætter værdierne korrekt i MenuItem-klassen
    void testConstructorSetsValuesCorrectly() {
        assertEquals(1, menuItem.getItemNumber());
        assertEquals(9.99f, menuItem.getPrice());
        assertEquals("Burger", menuItem.getName());
    }

    @Test //Metode til at teste at setter-metoden fungerer korrekt i MenuItem, ved at ændre værdierne i objektet
    void testSetItemNumber() {
        //Tester setter-metoden for itemNumber
        menuItem.setItemNumber(2);
        assertEquals(2, menuItem.getItemNumber());
    }

    @Test
    void testSetPrice() {
        //Tester setter-metoden for price
        menuItem.setPrice(14.99f);
        assertEquals(14.99f, menuItem.getPrice());
    }

    @Test
    void testSetName() {
        //Tester setter-metoden for name
        menuItem.setName("Burger");
        assertEquals("Burger", menuItem.getName());
    }
}
