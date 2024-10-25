import java.time.LocalTime;
import java.util.Scanner;

public class PhoneOrder extends OrderType {

    private LocalTime pickupTime;
    private String customer;


    // Constructor
    public PhoneOrder(String customer, String pickupTime, int orderID) {
        super(orderID); // Call the constructor of the superclass (OrderType)
        this.pickupTime = LocalTime.parse(pickupTime);
        this.customer = customer;

        System.out.println(customer + " " + this.pickupTime); // Prints customer and pickup time
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
