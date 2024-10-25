import java.time.LocalTime;
public class OrderType {
   private LocalTime orderTime;
   private int ID;

   //CONSTRUCTOR
public OrderType(int ID) {
   this.ID = ID;

} //GETTER-METODE FOR AT INDHENTE BESTILLINGSTIDSPUNKT
   public LocalTime getorderTime() {
      return orderTime;

} //GETTER-METODE FOR AT INDHENTE ID
   public int getID() {
      return ID;

} //UDSKRIVE ORDER TIME OG ID VIA TOSTRING
   @Override
   public String toString() {
      return "Order Time: " + orderTime.toString() + ", ID: " + ID;
   }


}

