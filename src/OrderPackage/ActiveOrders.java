package OrderPackage;

import java.util.ArrayList;

public class ActiveOrders {

    private ArrayList<OrderType> activeOrderList = new ArrayList<>();

    //Metode der modtager argument af datatypen/objektet OrderType, som tilføjes til activeOrderList
    public void addOrder(OrderType order) {
        activeOrderList.add(order);
    }

    //Metode der fjerner ordre fra arrayListen
    public void removeOrder(OrderType order){
        if (activeOrderList.contains(order)){ //Tjekker at arrayListe indeholder ordren
            activeOrderList.remove(order); // fjerner ordreren
        } else{
            System.out.println("Ordren findes ikke"); //error message
        }
    }

}
