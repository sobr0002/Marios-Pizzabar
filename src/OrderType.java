import java.time.LocalTime;

public class OrderType {
   private LocalTime orderTime;
   private int ID;

public OrderType(int ID) {
   this.ID = ID;

}
   public LocalTime getorderTime() {
      return orderTime;
}
   public int getID() {
      return ID;
}
   @Override
   public String toString() {
      return "Order Time: " + orderTime.toString() + ", ID: " + ID;
   }


}

