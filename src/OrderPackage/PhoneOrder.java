package OrderPackage;

import java.time.LocalTime;

public class PhoneOrder extends OrderType {

    private LocalTime pickupTime;
    private String customer;


    // Constructor
    public PhoneOrder(String customer, String pickupTime) {
        super(); // Kalder  constructor af superclass (OrderPackage.OrderType)
        this.pickupTime = LocalTime.parse(pickupTime); //Parse omdanner ml. datatyper, så String bliver til time
        this.customer = customer;

        System.out.println(customer + " " + this.pickupTime); // Printer
    }



    //GETTER og SETTER
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    //GETTER og SETTER
    public LocalTime getPickupTime() {
        return pickupTime;
    }
    public void setPickupTime(LocalTime pickupTime) {
        this.pickupTime = pickupTime;
    }


}