import java.time.LocalTime;

public class PhoneOrder extends OrderType {

    private LocalTime pickupTime;
    private String customer;

    //Constructor
    public PhoneOrder(String customer, LocalTime pickupTime){
        this.customer = customer;
        this.pickupTime = pickupTime;
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
