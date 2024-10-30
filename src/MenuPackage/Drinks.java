package MenuPackage;

public class Drinks extends MenuItem{
//Konstruktør opretter drinks-instans af MenuItem-klassen
    public Drinks(int itemNumber, float price, String name) {
        super(itemNumber, price, name);

        Menu.addMenuItem(this);
    }
}
