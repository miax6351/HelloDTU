import java.util.Scanner;

public class Password {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = in.nextLine();

        int length = password.length();

        if (length >= 9) {
            System.out.println("Password too long");
        } else if (length <= 4) {
            System.out.println("Password too short");
        } else {
            System.out.println("Password tilpas");
        }

    }

}
