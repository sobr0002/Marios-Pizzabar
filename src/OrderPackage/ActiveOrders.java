package OrderPackage;

import MenuPackage.MenuItem;
import org.junit.jupiter.api.Order;

import java.util.ArrayList;

public class ActiveOrders {

    private static ArrayList<OrderType> activeOrderList = new ArrayList<>();

    //Metode der modtager argument af datatypen/objektet OrderType, som tilføjes til activeOrderList
    public static void addOrder(OrderType order) {
        activeOrderList.add(order);
    }

    //Metode der fjerner ordre fra arrayListen
    public static void removeOrder(OrderType order){
        if (activeOrderList.contains(order)){ //Tjekker at arrayListe indeholder ordren
            activeOrderList.remove(order); // fjerner ordreren
        } else{
            System.out.println("Ordren findes ikke"); //error message
        }
    }

    //Metode der fjerner item fra ordre
    public static void orderUpdateRemove(MenuItem item){
        OrderType.removeItem(item);
    }

    //Metode der tilføjer item til ordre
    public static void orderUpdateAdd(MenuItem item){
        OrderType.addItem(item);
    }

    public void displayActiveOrders(){
        for(OrderType order: activeOrderList){
            order.displayOrder();
            System.out.println(" ");
        }
    }

    //Getter for arrayList
    public static ArrayList<OrderType> getActiveOrderList() {
        return activeOrderList;
    }
}
