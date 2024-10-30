import MenuPackage.Menu;
import MenuPackage.MenuItem;
import OrderPackage.*;

import java.time.LocalTime;

public class Interface {
    Menu menu = new Menu();

    public Interface() {
        System.out.println("""
                Valg 1 - Opret ordre
                Valg 2 - Rediger ordre
                Valg 3 - Se bestillingsliste
                Valg 4 - Se ordrehistorik
                Valg 5 - Se menukort
                """);


        switch (UserInput.inputInt()) {
            case 1:
                System.out.println("valg 1 - Desk Ordre");
                System.out.println("Valg 2 - Telefon Ordre");
                switch (UserInput.inputInt()) {
                    case 1:
                        System.out.println("Skriv kundes navn: ");
                        DeskOrder deskOrder = new DeskOrder(UserInput.inputStr(), LocalTime.now()); //Opretter deskOrder

                        userAddItem(deskOrder); //Kalder metode der der gør at varer kan. Tilføjes til ordre.

                        ActiveOrders.addOrder(deskOrder); //Tilføjer ordre til activeOrderList
                        break;

                    case 2:
                        System.out.println("Skriv kundes navn: ");
                        String name = UserInput.inputStr();

                        System.out.println("Skriv afhentnings tid. (HH:mm)");
                        String pickupTime = UserInput.inputStr();

                        PhoneOrder phoneOrder = new PhoneOrder(name, pickupTime); //Opretter phoneOrder


                        userAddItem(phoneOrder); //Kalder metode der der gør at varer kan. Tilføjes til ordre.

                        ActiveOrders.addOrder(phoneOrder); //Tilføjer ordre til activeOrderList
                        break;


                }
                break;

            case 2:
                System.out.println("Vælg en ordre du vil redigere:");
                ActiveOrders.displayActiveOrders();

                for (OrderType order : ActiveOrders.getActiveOrderList()) {
                    if (UserInput.inputInt() == order.getID()) {

                        System.out.println("""
                                1: Vil du annullere ordre?
                                2: Vil du tilføje vare til ordren?
                                3: Vil du slette en vare fra ordren?""");

                        switch (UserInput.inputInt()) {
                            case 1:
                                ActiveOrders.removeOrder(order); //Fjerner hele ordren fra ActiveOrderList
                                break;
                            case 2:
                                order.addItem(retrieveItem()); //tilføjer en enkelt varer til ordren
                                break;
                            case 3:
                                order.removeItem(retrieveItem()); //Fjerner en enkelt varer fra ordren
                                break;
                        }
                    }
                }
                break;

            case 3:
                ActiveOrders.displayActiveOrders(); //Viser aktiv bestillingsliste
                break;

            case 4:
                OrderHistory.displayOrderHistory(); //Viser ordrehistorik
                break;

            case 5:
                Menu.displayMenu(); //Viser menukort
                break;

            default:
                System.out.println("Valg ikke mulig");
                break;

        }
    }

    public void userAddItem(OrderType order) {
        Menu.displayMenu();
        while (true) {
            System.out.println("Vælg varer der skal tilføjes til ordren");
            int input = UserInput.inputInt();
            if (input >= 0 && input <= menu.getMenuList().size()) {
                MenuItem item = menu.getMenuList().get(input - 1);
                order.addItem(item);
                System.out.println(item.getName() + " tilføjet.");
            } else {
                System.out.println("valg ikke mulig");
            }
            System.out.println("Tilføj en ny vare?");
            String inputStr = UserInput.inputStr();
            if (inputStr.equalsIgnoreCase("no")) {
                break;
            } else {
                continue;
            }
        }
    }

    public MenuItem retrieveItem() {
        Menu.displayMenu();
        System.out.println("");
        System.out.println("Vælg en vare");
        int input = UserInput.inputInt();
        if (input >= 0 && input <= menu.getMenuList().size()) {
            MenuItem item = menu.getMenuList().get(input);
            return item;
        } else {
            System.out.println("valg ikke mulig");
        }
        return null;
    }

}