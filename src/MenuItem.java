public class MenuItem {

    private int itemNumber;
    private float price;
    private String name;

    /*Setter attributterne direkte i konstruktøren for at sikre, at de får tildelt en nødvendig værdi fra starten
    = sikrer initialisering af attributter */

    public MenuItem(int itemNumber, float price, String name) {
        this.setItemNumber(itemNumber);
        this.setPrice(price);
        this.setName(name);
    }

    //Getter- og setter-metoderne sikrer indkapsling
    public int getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public float getPrice() {
        return price;
    }
    //setter sikrer justering af attribut
    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
