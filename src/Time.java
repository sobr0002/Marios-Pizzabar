import java.time.LocalTime;

public class Time {

    private LocalTime time;

    //Konstruktør for time-objektet, som automatisk sætter det aktuelle tidspunkt
    public Time() {
        this.time = LocalTime.now(); //sætter automatisk tidspunktet ved ordreoprettelse
    }

    //Metode til at hente det aktuelle bestillingstidspunkt
    public void orderTime() {
        this.time = LocalTime.now();
    }

    //Getter-metode til at hente bestillingstidspunktet
    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() { //Udskriver bestillingstidspunkt til konsollen
        return "Bestillingstidspunkt: " + time;
    }
}

