package OrderPackage;

import java.util.ArrayList;

public class OrderHistory {

    //Static fordi vi kun har én orderHistoryList
    private static ArrayList<OrderType> orderHistoryList = new ArrayList<>(); //ArrayListen er objekter af klassen "OrderType"

    //Metode der tager OrderType som argument og tilføjer order til orderHistoryList
    public static void addOrder(OrderType order){
        orderHistoryList.add(order);
    }

    public static void displayOrderHistory() {
        if (orderHistoryList.isEmpty()) {
            System.out.println("Der forefindes ingen ordrehistorik.");
        }  else {
            System.out.println("Ordre Historik");
            System.out.println("");
            for (OrderType order : orderHistoryList) {
                order.displayOrder();
                System.out.println(" "); //Printer tom linje, så hver ordre kommer på ny linje
            }
        }
    }

    public static ArrayList<OrderType> getOrderHistoryList(){
        return orderHistoryList;
    }

}
