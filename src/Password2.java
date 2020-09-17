import java.util.Scanner;

public class Password2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.print("Skriv password: ");
            String password = s.next();
            int length = password.length();

            if (length >= 9) {
                System.out.println("Password for langt");
            } else if (length <= 4) {
                System.out.println("Password for kort");
            } else {
                System.out.println("Password tilpas");
                break;

            }


        }


    }
}