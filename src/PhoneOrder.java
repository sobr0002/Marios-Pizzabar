import java.time.LocalTime;
import java.util.Scanner;

public class PhoneOrder extends OrderType {

    private LocalTime pickupTime;
    private String customer;


    //Constructor
    public PhoneOrder(String customer, String pickupTime){

        Scanner sc = new Scanner(System.in);
        System.out.println("hvornår skal pizzaen hentes?");
        LocalTime.parse(pickupTime);

        this.customer = customer;

        System.out.println(customer + pickupTime);
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
