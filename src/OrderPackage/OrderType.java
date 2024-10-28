package OrderPackage;

import MenuPackage.MenuItem;

import java.time.LocalTime;
import java.util.ArrayList;

public class OrderType {

    private int ID = 0;
    private Time time = new Time(); //Instantierer time-objektet
    private ArrayList<MenuItem> order = new ArrayList<>();


    //CONSTRUCTOR
    public OrderType() {
        this.ID = ID++;
        time.orderTime();
    }

    public void addItem(MenuItem item) { //Tilføjer varer til ArrayList "Order"
        order.add(item);

    }

    public void removeItem(MenuItem item) { //Sletter én vare fra aktuel ordre

        if (order.contains(item)) {
            order.remove(item);
        } else {
            System.out.println("Varen findes ikke.");
        }

    }
    //GETTER-METODE FOR AT INDHENTE BESTILLINGSTIDSPUNKT
    public LocalTime getorderTime() {
        return time.getTime(); //kalder metoden fra Time-klassen til at angive det aktuelle tidspunkt

    } //GETTER-METODE FOR AT INDHENTE ID

    public int getID() {
        return ID;

    } //UDSKRIVE ORDER TIME OG ID VIA TOSTRING

    @Override
    public String toString() {
        return "Order Time: " + time.getTime() + ", ID nr: " + ID;
    }


}

