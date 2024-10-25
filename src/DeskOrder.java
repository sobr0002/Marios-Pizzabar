
import java.time.LocalTime;

public class DeskOrder extends OrderType{

    private String customer;
    private LocalTime timeToFinish;

    // Constructor with timeToFinish parameter
    public DeskOrder(String customer, LocalTime timeToFinish, int orderID) {
        super(orderID);
        this.customer = customer;
        this.timeToFinish = (timeToFinish != null) ? timeToFinish : LocalTime.now().plusMinutes(15);
    }

    //getter og setter for customer
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    //Getter og Setter for timeToFinish

    public LocalTime getTimeToFinish() {
        return timeToFinish;
    }
    public void setTimeToFinish(LocalTime timeToFinish) {
        this.timeToFinish = timeToFinish;
    }


}
