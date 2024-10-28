package OrderPackage;

import java.util.ArrayList;

public class ActiveOrders {

    private ArrayList<OrderType> activeOrderList = new ArrayList<>();

    //Metode der modtager argument af datatypen/objektet OrderType, som tilføjes til activeOrderList
    public void addOrder(OrderType order) {
        activeOrderList.add(order);
    }


}
