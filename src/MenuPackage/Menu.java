package MenuPackage;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu(){
        menuItems = new ArrayList<>();
    }

    //Metode der tilføjer et menuItem til listen
    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    //Metode der fremviser indholdet af menuen
    public void displayMenu(){
        if (menuItems.isEmpty()){
            System.out.println("Menuen er tom");
        } else {
            for (MenuItem item : menuItems){
                System.out.println(item.getItemNumber() + ". " + item.getName() + " " + item.getPrice() + "kr.");
            }
        }
    }
}
