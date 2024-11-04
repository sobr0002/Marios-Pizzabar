package MenuPackage;

import java.util.ArrayList;

public class Menu {
    private static ArrayList<MenuItem> menuItems;

    public Menu(){
        menuItems = new ArrayList<>();
        createPizzas();
        createDrinks();
    }

    //Metode der tilføjer et menuItem til listen
    public static void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    //Metode der fremviser indholdet af menuen
    public static void displayMenu() {
        if (menuItems.isEmpty()) {
            System.out.println("Menuen er tom");
        } else {
            for (MenuItem item : menuItems) {
                System.out.println(item.getItemNumber() + ". " + item.getName() + " " + item.getPrice() + "kr. " + item.getIngredients());
                //item.displayIngredients();
                System.out.println("");
            }
        }
    }

    public ArrayList<MenuItem> getMenuList(){
        return menuItems;
    }

    public void createPizzas(){
        // Opretter pizzaer ud fra menuen fra Mario
        Pizza vesuvio = new Pizza(1, 57, "Vesuvio", 2, 1, 3, 5); // Tomatsauce, Ost, Skinke, Oregano
        Pizza amerikaner = new Pizza(2, 53, "Amerikaner", 2, 1, 6, 5); // Tomatsauce, Ost, Oksefars, Oregano
        Pizza cacciatore = new Pizza(3, 57, "Cacciatore", 2, 1, 4, 5); // Tomatsauce, Ost, Pepperoni, Oregano
        Pizza carbona = new Pizza(4, 63, "Carbona", 2, 1, 7, 8, 9, 5); // Tomatsauce, Ost, Kødsauce, Spaghetti, Cocktailpølser, Oregano
        Pizza dennis = new Pizza(5, 65, "Dennis", 2, 1, 3, 4, 9, 5); // Tomatsauce, Ost, Skinke, Pepperoni, Cocktailpølser, Oregano
        Pizza bertil = new Pizza(6, 57, "Bertil", 2, 1, 10, 5); // Tomatsauce, Ost, Bacon, Oregano
        Pizza silvia = new Pizza(7, 61, "Silvia", 2, 1, 4, 11, 12, 13, 5); // Tomatsauce, Ost, Pepperoni, Rød Peber, Løg, Oliven, Oregano
        Pizza victoria = new Pizza(8, 61, "Victoria", 2, 1, 3, 16, 12, 5); // Tomatsauce, Ost, Skinke, Ananas, Champignon, Løg, Oregano
        Pizza toronfo = new Pizza(9, 61, "Toronfo", 2, 1, 3, 10, 16, 17, 5); // Tomatsauce, Ost, Skinke, Bacon, Kebab, Chili, Oregano
        Pizza capricciosa = new Pizza(10, 61, "Capricciosa", 2, 1, 3, 16, 12, 5); // Tomatsauce, Ost, Skinke, Champignon, Løg, Oregano
        Pizza hawaii = new Pizza(11, 61, "Hawaii", 2, 1, 3, 15, 5); // Tomatsauce, Ost, Skinke, Ananas, Oregano
        Pizza le_blissola = new Pizza(12, 61, "Le Blissola", 2, 1, 3, 18, 5); // Tomatsauce, Ost, Skinke, Rejer, Oregano
        Pizza venezia = new Pizza(13, 61, "Venezia", 2, 1, 3, 10, 5); // Tomatsauce, Ost, Skinke, Bacon, Oregano
        Pizza mafia = new Pizza(14, 61, "Mafia", 2, 1, 4, 10, 12, 5); // Tomatsauce, Ost, Pepperoni, Bacon, Løg, Oregano
        Pizza haest = new Pizza(15, 62, "Hæst", 2, 1, 4, 6, 5); // Tomatsauce, Ost, Pepperoni, Oksefars, Oregano
        Pizza lange = new Pizza(16, 64, "Lange", 2, 1, 3, 8, 9, 5); // Tomatsauce, Ost, Skinke, Spaghetti, Cocktailpølser, Oregano
        Pizza jan = new Pizza(17, 63, "Jan", 2, 1, 10, 12, 13, 5); // Tomatsauce, Ost, Bacon, Løg, Oliven, Oregano
        Pizza skrump = new Pizza(18, 65, "Skrumpe", 2, 1, 7, 10, 15, 5); // Tomatsauce, Ost, Kødsauce, Bacon, Ananas, Oregano
        Pizza napoli = new Pizza(19, 58, "Napoli", 2, 1, 3, 15, 5); // Tomatsauce, Ost, Skinke, Ananas, Oregano
        Pizza roma = new Pizza(20, 60, "Roma", 2, 1, 4, 16, 5); // Tomatsauce, Ost, Pepperoni, Champignon, Oregano
        Pizza milano = new Pizza(21, 59, "Milano", 2, 1, 3, 11, 5); // Tomatsauce, Ost, Skinke, Rød Peber, Oregano
        Pizza sicilia = new Pizza(22, 64, "Sicilia", 2, 1, 7, 12, 5); // Tomatsauce, Ost, Kødsauce, Løg, Oregano
        Pizza firenze = new Pizza(23, 62, "Firenze", 2, 1, 6, 16, 13, 5); // Tomatsauce, Ost, Oksefars, Champignon, Oliven, Oregano
        Pizza torino = new Pizza(24, 63, "Torino", 2, 1, 4, 17, 10, 5); // Tomatsauce, Ost, Pepperoni, Kebab, Bacon, Oregano
        Pizza genova = new Pizza(25, 66, "Genova", 2, 1, 3, 12, 14, 5); // Tomatsauce, Ost, Skinke, Løg, Rejer, Oregano
        Pizza amalfi = new Pizza(26, 61, "Amalfi", 2, 1, 4, 13, 16, 5); // Tomatsauce, Ost, Pepperoni, Oliven, Champignon, Oregano
        Pizza sardinia = new Pizza(27, 65, "Sardinia", 2, 1, 7, 18, 5); // Tomatsauce, Ost, Kødsauce, Rejer, Oregano
        Pizza bologna = new Pizza(28, 64, "Bologna", 2, 1, 3, 10, 11, 5); // Tomatsauce, Ost, Skinke, Bacon, Rød Peber, Oregano
        Pizza bari = new Pizza(29, 63, "Bari", 2, 1, 6, 16, 5); // Tomatsauce, Ost, Oksefars, Champignon, Oregano
        Pizza palermo = new Pizza(30, 62, "Palermo", 2, 1, 10, 14, 5); // Tomatsauce, Ost, Bacon, Rejer, Oregano
    }

    public void createDrinks(){
        // Opretter drinks med navn og pris
        Drinks cola = new Drinks(31, 20, "Cola");
        Drinks fanta = new Drinks(32, 20, "Fanta");
        Drinks sprite = new Drinks(33, 20, "Sprite");
        Drinks pepsi = new Drinks(34, 20, "Pepsi");
        Drinks redbull = new Drinks(35, 25, "Red Bull");
        Drinks water = new Drinks(36, 15, "Vand");
        Drinks mineralWater = new Drinks(37, 18, "Mineralvand");
        Drinks icedTea = new Drinks(38, 22, "Iste");
        Drinks lemonade = new Drinks(39, 22, "Lemonade");
        Drinks appleJuice = new Drinks(40, 20, "Æblejuice");
        Drinks gazoz = new Drinks(41, 20, "Gazoz");
    }


}
