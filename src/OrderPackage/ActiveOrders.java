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
    
    //Metode der fjerner ordre fra aktive liste og tilføjer til ordre history liste
    public static void finishOrder(OrderType order){
        OrderHistory.addOrder(order);
    }

    public static void displayActiveOrders(){
        if(activeOrderList.isEmpty()){
            System.out.println("Bestillingsliste er tom");
        } else {
            Sort.sortActiveOrders(activeOrderList); //her har vi sorteret dem med sortMetoden

            System.out.println("Bestillingsliste: ");
            for(OrderType order: activeOrderList){ //itererer gennem "activeOrderList" og printer elementerne ud
                order.displayOrder();
                System.out.println(" ");
            }
        }
    }

    //Getter for arrayList
    public static ArrayList<OrderType> getActiveOrderList() {
        return activeOrderList;
    }
}
