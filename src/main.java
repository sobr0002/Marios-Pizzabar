import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kunde");

        String customer = sc.nextLine();

        System.out.println("tidspunkt");

        String tid = sc.nextLine();



        new PhoneOrder(customer, tid);
        


    }
}
