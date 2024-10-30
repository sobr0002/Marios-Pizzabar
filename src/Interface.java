import MenuPackage.*;
import OrderPackage.*;

import java.time.LocalTime;

public class Interface {
    Menu menu = new Menu();
    private int ID = 1;

    public Interface(){

    }

    public void interfaceStart(){
        System.out.println("""
        Valg 1 - Opret ordre
        Valg 2 - Rediger ordre
        Valg 3 - Se bestillingsliste
        Valg 4 - Se ordrehistorik
        Valg 5 - Se menukort
        """);


        switch (UserInput.inputInt()){
            case 1:
                System.out.println("valg 1 - Desk Ordre");
                System.out.println("Valg 2 - Telefon Ordre");
                switch (UserInput.inputInt()){
                    case 1:
                        System.out.println("Skriv kundes navn: ");
                        DeskOrder deskOrder = new DeskOrder(ID++, UserInput.inputStr(), LocalTime.now()); //Opretter deskOrder

                        userAddItem(deskOrder); //Kalder metode der der gør at varer kan. tilføjes til ordre.

                        ActiveOrders.addOrder(deskOrder); //Tilføjer ordre til activeOrderList
                        break;

                    case 2:
                        System.out.println("Skriv kundes navn: ");
                        String name = UserInput.inputStr();

                        System.out.println("Skriv afhentings tid. (HH:mm)");
                        String pickupTime = UserInput.inputStr();

                        PhoneOrder phoneOrder = new PhoneOrder(ID++,name, pickupTime); //Opretter phoneOrder


                        userAddItem(phoneOrder); //Kalder metode der der gør at varer kan. tilføjes til ordre.

                        ActiveOrders.addOrder(phoneOrder); //Tilføjer ordre til activeOrderList
                        break;
                }
                break;

            case 2:
                System.out.println("Vælg en ordre du vil redigere:");
                ActiveOrders.displayActiveOrders();
                int input = UserInput.inputInt();

                for (OrderType order : ActiveOrders.getActiveOrderList()) {
                    if (input == order.getID()) {

                        System.out.println("""
                                    1: Vil du annullere ordre?
                                    2: Vil du tilføje vare til ordren?
                                    3: Vil du slette en vare fra ordren?
                                    4: Fjern en ordre der færdig""");

                        switch (UserInput.inputInt()) {
                            case 1:
                                ActiveOrders.removeOrder(order);
                                break;
                            case 2:
                                order.addItem(retrieveItem());
                                break;
                            case 3:
                                order.removeItem(retrieveItem());
                                break;
                            case 4:
                                ActiveOrders.finishOrder(order);
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

    public void userAddItem(OrderType order){
        Menu.displayMenu();
        while (true){
            System.out.println("Vælg varer der skal tilføjes til ordren");
            int input = UserInput.inputInt();
            if(input >= 0 && input <= menu.getMenuList().size()){
                MenuItem item = menu.getMenuList().get(input-1);
                order.addItem(item);
                System.out.println(item.getName() + " tilføjet.");
            } else {
                System.out.println("valg ikke mulig");
            }
            System.out.println("Tilføj en ny vare?");
            String inputStr = UserInput.inputStr();
            if (inputStr.equalsIgnoreCase("nej")){
                break;
            } else {
                continue;
            }
        }
    }

    public MenuItem retrieveItem(){
        Menu.displayMenu();
        System.out.println(" ");
        System.out.println("Vælg en vare");
        int input = UserInput.inputInt();
        if(input >= 0 && input <= menu.getMenuList().size()){
            MenuItem item = menu.getMenuList().get(input-1);
            return item;
        } else {
            System.out.println("valg ikke mulig");
        }
        return null;
    }

}