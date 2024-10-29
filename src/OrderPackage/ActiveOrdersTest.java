package OrderPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ActiveOrdersTest {


    @BeforeEach
    void setup(){
        OrderType order1 = new OrderType(); //Opretter ordrer ved at sætte værdierne
        OrderType order2 = new OrderType();
        ActiveOrders.getActiveOrderList().clear(); //Sletter indhold i ArrayList før hver test

    }

    @Test
    void testAddOrder() {
        PhoneOrder order01 = new PhoneOrder("Order01", "15:30"); //Opretter en testordre
        ActiveOrders.addOrder(order01); //Tilføjer testordren til "ActiveOrderList"
        PhoneOrder order02 = new PhoneOrder("Order02", "12:30");
        ActiveOrders.addOrder(order02);


        assertTrue(ActiveOrders.getActiveOrderList().contains(order01)); //Tester om indholdet er i ArrayListen "order01"
        assertTrue(ActiveOrders.getActiveOrderList().contains(order02)); //Tester om "order02" tilføjes rigtigt til ArrayListen
        assertEquals(2, ActiveOrders.getActiveOrderList().size()); //Tester om der er to aktive ordrer på ArrayListen
    }

    @Test
    void testRemoveOrder() {
        PhoneOrder order01 = new PhoneOrder("Order01", "15:30"); //Opretter en testordre
        ActiveOrders.addOrder(order01); //Tilføjer testordren til "ActiveOrderList"
        PhoneOrder order02 = new PhoneOrder("Order02", "12:30");
        ActiveOrders.addOrder(order02);


        ActiveOrders.removeOrder(order01);
        assertFalse(ActiveOrders.getActiveOrderList().contains(order01)); //Tester at ArrayListen ikke indeholder order01
        assertEquals(1, ActiveOrders.getActiveOrderList().size()); //Tester at der er én aktiv ordre op ArrayListen
    }


}
