package OrderPackage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sort {

    // Metode der sorterer activeOrderList baseret på orderTime i OrderType(Spørgsmålet er så,
    // om den faktisk kan se forskel på timeToFinish og PickUpTime)
    public static void sortActiveOrders(ArrayList<OrderType> activeOrderList) {
        for (int i = 0; i < activeOrderList.size() - 1; i++) { //Vi iterere gennem vores arrayListe, undtagen dem der allerede er sorteret
            for (int j = 0; j < activeOrderList.size() - i - 1; j++) { //vi iterere igennem listen, og dem der ligger ved siden af hinanden bliver sammenlignet
                if (activeOrderList.get(j).getOrderTime().isAfter(activeOrderList.get(j + 1).getOrderTime())) {
                    // Bytter tiderne, hvis 'orderTime' er senere end den næste
                    OrderType temp = activeOrderList.get(j); //midlertidig var til at holde på den værdi der skal sammenlignes
                    activeOrderList.set(j, activeOrderList.get(j + 1)); //her bytter vi så rundt på dem
                    activeOrderList.set(j + 1, temp); //her er de placeret
                }
            }
        }
    }
}
