import java.util.Scanner;

public class Password2 {

    public static void main(String[] args) {
        String password = "";
        Scanner input = new Scanner(System.in);

        while (password.length()<=4 || password.length()>=9) {

            System.out.println("Skriv password");
            password = input.next();
            //Input.close() skal ikke bruges da scanneren dermed skal åbnes igen hver iteration af loopet
            if (password.length()>=9) {
                System.out.println("password er for langt");
            }
            else if (password.length()<=4){
                System.out.println("password er for kort");
            }
        }

        System.out.println("password er tilpas");
        System.out.println(password);





    }
}