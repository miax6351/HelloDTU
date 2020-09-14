import java.util.Scanner;

public class Password2 {

    public static void main(String[] args) {

        String password = " ";
        Scanner in = new Scanner(System.in);



        int length = password.length();

        while (length > 9 || length < 4) {

            System.out.print("Enter your password: ");
            password = in.next();

            if (length > 9) {
                System.out.println("Password too long");
            } else if (length < 4) {
                System.out.println("Password too short");
            }
            System.out.print("Enter your password: ");



        }
            System.out.println("Password tilpas");





    }
}
