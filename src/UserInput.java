import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static String returnUserInput(){
        return sc.nextLine();
    }
}
