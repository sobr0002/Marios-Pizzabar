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
            System.out.println("Ingen ordrehistorik.");
        }  else {
            System.out.println("Ordrehistorik");
            System.out.println(" ");
            for (OrderType order : orderHistoryList) {
                order.displayOrder();
                System.out.println(" "); //Printer tom linje, så hver ordre kommer på ny linje
            }
            System.out.println(" ");
            System.out.println("Omsætning: " + totalRevenue());
            System.out.println(" ");
        }

    }

    public static float totalRevenue(){
        float revenue = 0;
        for (OrderType order : orderHistoryList){
            revenue += order.getTotalPrice();
        }
        return revenue;
    }

    public static ArrayList<OrderType> getOrderHistoryList(){
        return orderHistoryList;
    }

}
