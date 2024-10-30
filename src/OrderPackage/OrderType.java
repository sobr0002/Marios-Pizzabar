package OrderPackage;

import MenuPackage.MenuItem;
import java.time.LocalTime;
import java.util.ArrayList;

public class OrderType {

    private int ID;
    private Time time = new Time(); //Instantierer time-objektet
    private ArrayList<MenuItem> order = new ArrayList<>();
    protected boolean isPhoneOrder;


    //CONSTRUCTOR
    public OrderType(int ID) {
        this.isPhoneOrder = false;
        this.ID = ID;
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
    public LocalTime getOrderTime() {
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
        if (isPhoneOrder){
            System.out.println("Telefon Ordre " + ID);
        } else {
            System.out.println("Ordrenr.: " + ID + "\n");
        }

        float totalPrice = 0; //Ny variabel til at holde styr på total pris af ordre
        if (order.isEmpty()){ // Tjekker at arrayListe er tom
            System.out.println("Ordren er tom");
        } else {
            for (MenuItem item : order){ //For-loop der tjekker aller items if arrayliste order.
                System.out.println(item.getName() + " " + item.getPrice() + " kr."); //printer navn og pris på vare.
                totalPrice += item.getPrice();
            }

            System.out.println();
            System.out.println(time.toString()); //Printer bestillingstidspunkt.
            if (isPhoneOrder){
                System.out.println("Afhentningstidspunkt: " + finishTime());
            } else {
                System.out.println("Ordre klar: " + finishTime());
            }
            System.out.println("Total: " + totalPrice + " kr.\n"); //printer totalpris
            System.out.println("-----------------------------");
        }
    }

    public LocalTime finishTime(){
        return null;
    }

    public ArrayList<MenuItem> getOrder(){
        return order;
    }

}

