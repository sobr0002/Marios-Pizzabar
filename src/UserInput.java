import java.util.Scanner;

public class UserInput {

    public static int inputInt(){ //Metode til at tage int-input fra brugeren
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String inputStr(){ //Metode til at tage String-input fra brugeren
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
