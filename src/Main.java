import MenuPackage.Menu;
import MenuPackage.Pizza;
import OrderPackage.*;
import org.junit.jupiter.api.Order;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Interface program = new Interface();

        while (true){
            program.interfaceStart();
        }


       /*Menu menu = new Menu();


        PhoneOrder order = new PhoneOrder("Long", "00:00");
        order.addItem(mag);
        order.addItem(skinke);

        DeskOrder order1 = new DeskOrder("Din Mor", LocalTime.now());
        order1.addItem(pep);
        order1.addItem(skinke);

        ActiveOrders.addOrder(order);
        ActiveOrders.addOrder(order1);

        order1.removeItem(skinke);

        ActiveOrders.finishOrder(order1);

        ActiveOrders.displayActiveOrders();

        OrderHistory.displayOrderHistory();
*/
    }
}
