package OrderPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;


public class OrderHistoryTest {

    @BeforeEach
    void setup(){
        OrderHistory.getOrderHistoryList().clear(); //Sørger for at listen er tom før hver test
    }
    
    @Test
    void testAddOrder() {
        DeskOrder order01 = new DeskOrder("Lange", LocalTime.now()); //Instantierer testordre af "DeskOrder"-klassen
        DeskOrder order02 = new DeskOrder("Hæst", LocalTime.now());
        
        OrderHistory.addOrder(order01);
        assertTrue(OrderHistory.getOrderHistoryList().contains(order01)); //Tester om ordrer tilføjes korrekt til ArrayListen "OrderHistoryList"
        
        OrderHistory.addOrder(order02); //Tilføjer order02 til "OrderHistoryList" vha. "OrderHistory"-klassens metode .addOrder()
        assertTrue(OrderHistory.getOrderHistoryList().contains(order02));

        assertEquals(2, OrderHistory.getOrderHistoryList().size()); //Tester om "OrderHistoryList" indeholder de to testordrer

    }


}
