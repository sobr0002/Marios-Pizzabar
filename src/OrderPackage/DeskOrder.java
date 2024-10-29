package OrderPackage;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DeskOrder extends OrderType{

    private String customer;
    private LocalTime timeToFinish;

    // Constructor with timeToFinish parameter
    public DeskOrder(String customer, LocalTime timeToFinish) {
        super();
        isPhoneOrder = false;
        this.customer = customer;
        this.timeToFinish = LocalTime.now().plusMinutes(15);
        //this.timeToFinish = (timeToFinish != null) ? timeToFinish : LocalTime.now().plusMinutes(15);
        //En terniary, der sætter tiden til nu og derefter plusser 15 min. til, så afhentningstidspunktet
        // altid bliver 15 min fra nu
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

    @Override
    public LocalTime finishTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        String temp = timeToFinish.format(dtf);
        return LocalTime.parse(temp);
    }

}
