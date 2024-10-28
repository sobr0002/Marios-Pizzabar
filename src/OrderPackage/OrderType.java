package OrderPackage;

import MenuPackage.MenuItem;
import java.time.LocalTime;
import java.util.ArrayList;

public class OrderType {

    private int ID = 0;
    private Time time = new Time(); //Instantierer time-objektet
    private static ArrayList<MenuItem> order = new ArrayList<>();


    //CONSTRUCTOR
    public OrderType() {
        this.ID = ID++;
        time.orderTime();
    }

    public static void addItem(MenuItem item) { //Tilføjer varer til ArrayList "Order"
        order.add(item);

    }

    public static void removeItem(MenuItem item) { //Sletter én vare fra aktuel ordre

        if (order.contains(item)) {
            order.remove(item);
        } else {
            System.out.println("Varen findes ikke.");
        }

    }
    //GETTER-METODE FOR AT INDHENTE BESTILLINGSTIDSPUNKT
    public LocalTime getorderTime() {
        return time.getTime(); //kalder metoden fra OrderPackage.Time-klassen til at angive det aktuelle tidspunkt

    } //GETTER-METODE FOR AT INDHENTE ID

    public int getID() {
        return ID;

    } //UDSKRIVE ORDER TIME OG ID VIA TOSTRING

    @Override
    public String toString() {
        return "Order OrderPackage.Time: " + time.getTime() + ", ID nr: " + ID;
    }

    //Metode der printer en ordrer ud.
    public void displayOrder(){
        float totalPrice = 0; //Ny variabel til at holde styr på total pris af ordre
        if (order.isEmpty()){ // Tjekker at arrayListe er tom
            System.out.println("Ordren er tom");
        } else {
            for (MenuItem item : order){ //For-loop der tjekker aller items if arrayliste order.
                System.out.println(item.getName() + " " + item.getPrice() + " kr."); //printer navn og pris på vare.
                totalPrice =+ item.getPrice();
            }
            System.out.println(time.toString()); //Printer bestillingstidspunkt.
            System.out.println("Total: " + totalPrice + " kr."); //printer totalpris
            System.out.println("----------------");
        }
    }

    public ArrayList<MenuItem> getOrder(){
        return order;
    }

}

