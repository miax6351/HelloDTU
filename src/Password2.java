import java.util.Scanner;

public class Password2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String password = "";
        int length = 0;

        while (true) {

            System.out.print("Skriv password: ");
            password = s.next();
            length = password.length();

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