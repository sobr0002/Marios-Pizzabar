package OrderPackage;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DeskOrder extends OrderType{

    private String customer;
    private LocalTime timeToFinish;

    // Constructor with timeToFinish parameter.
    public DeskOrder(int ID, String customer, LocalTime timeToFinish) {
        super(ID);
        isPhoneOrder = false;
        this.customer = customer;
        this.timeToFinish = LocalTime.now().plusMinutes(15);
        //This timeToFinish = (timeToFinish != null) ? timeToFinish : LocalTime.now().plusMinutes(15);
        //En terniary, der sætter tiden til nu og derefter plusser 15 min. til, så afhentningstidspunktet
        // altid bliver 15 min fra nu
    }

    //getter og setter for customer
    @Override
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
