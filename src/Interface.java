import MenuPackage.*;
import OrderPackage.*;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.Scanner;

public class Interface {
    Menu menu = new Menu();
    private int ID = 1;

    public void interfaceStart(){
        System.out.println("""
        Valg 1 - Opret ordre
        Valg 2 - Rediger ordre
        Valg 3 - Se bestillingsliste
        Valg 4 - Se ordrehistorik
        Valg 5 - Se menukort
        Valg 6 - Luk programmet
        """);


        switch (UserInput.inputInt()){
            case 1:
                System.out.println("Valg 1 - Bestilling i butik");
                System.out.println("Valg 2 - Telefonisk bestilling");
                switch (UserInput.inputInt()){
                    case 1:
                        System.out.println("Skriv kundes navn: ");
                        DeskOrder deskOrder = new DeskOrder(ID++, UserInput.inputStr(), LocalTime.now()); //Opretter deskOrder

                        userAddItem(deskOrder); //Kalder metode der der gør at varer kan tilføjes til ordre.

                        ActiveOrders.addOrder(deskOrder); //Tilføjer ordre til activeOrderList
                        break;

                    case 2:
                        System.out.println("Indtast kundenavn");
                        String name = UserInput.inputStr();

                        System.out.println("Indtast afhentningstid: (HH:mm)");
                        String pickupTime = UserInput.inputStr();

                        PhoneOrder phoneOrder = new PhoneOrder(ID++,name, pickupTime); //Opretter phoneOrder


                        userAddItem(phoneOrder); //Kalder metode der der gør at varer kan tilføjes til ordre.

                        ActiveOrders.addOrder(phoneOrder); //Tilføjer ordre til activeOrderList
                        break;
                }
                break;

            case 2:
                System.out.println("Hvilken ordre skal redigeres?");
                ActiveOrders.displayActiveOrders();
                int input = UserInput.inputInt();

                Iterator<OrderType> iterator = ActiveOrders.getActiveOrderList().iterator();
                while (iterator.hasNext()){
                    OrderType order = iterator.next();
                    if (input == order.getID()) {
                        System.out.println("""
                                    Hvordan ønsker du at fortsætte?
                                    1: Annuller ordre
                                    2: Tilføj vare til ordre
                                    3: Slet vare fra ordre
                                    4: Afslut ordre""");

                        switch (UserInput.inputInt()) {
                            case 1:
                                iterator.remove();
                                break;
                            case 2:
                                order.addItem(retrieveItem());
                                break;
                            case 3:
                                order.removeItem(retrieveItem());
                                break;
                            case 4:
                                iterator.remove();
                                ActiveOrders.finishOrder(order);
                                break;
                            default:
                                System.out.println("Ugyldigt valg");
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

            case 6:
                System.exit(0);
                break;

            default:
                System.out.println("Ugyldigt valg");
                break;
        }
    }

    //Metode der hjælper med at tilføje varer til ordrer
    public void userAddItem(OrderType order){
        Menu.displayMenu();
        while (true){
            System.out.println("Vælg vare, der skal tilføjes til ordren");
            int input = UserInput.inputInt();
            if(input >= 0 && input <= menu.getMenuList().size()){
                MenuItem item = menu.getMenuList().get(input-1);
                order.addItem(item);
                System.out.println(item.getName() + " tilføjet");
            } else {
                System.out.println("Ugyldigt valg");
            }
            System.out.println("Tilføj en ny vare?");
            String inputStr = UserInput.inputStr();
            if (inputStr.equalsIgnoreCase("nej") || inputStr.equalsIgnoreCase("no")){
                break;
            } else {
                continue;
            }
        }
    }

    //Metode der returnerer en MenuItem efter brugerens ønske
    public MenuItem retrieveItem(){
        Menu.displayMenu();
        System.out.println(" ");
        System.out.println("Vælg en vare");
        int input = UserInput.inputInt();
        if(input >= 0 && input <= menu.getMenuList().size()){ //Tjekker at input er indefor index.
            MenuItem item = menu.getMenuList().get(input-1);
            return item;
        } else {
            System.out.println("Ugyldigt valg");
        }
        return null;
    }

}