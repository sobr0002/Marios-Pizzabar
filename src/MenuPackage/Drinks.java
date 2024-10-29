package MenuPackage;

public class Drinks extends MenuItem{

    public Drinks(int itemNumber, float price, String name) {
        super(itemNumber, price, name);

        Menu.addMenuItem(this);
    }
}
