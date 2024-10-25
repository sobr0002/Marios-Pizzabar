/* Lav en super-klasse, der hedder “OrderType” med attributterne,
 MenuItem-objekt, orderTime (int) og ID (autogenereret nummer: int).
Lav en metode i “OrderType”, der tilføjer en vare(MenuItem) til Order.
Lav en metode i “OrderType”, der fjerner en vare fra Order.
TIME: 4 timer */


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

