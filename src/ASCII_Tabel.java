import java.util.Scanner;

public class ASCII_Tabel {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char symbol = ' ';
        String input = "";

        while (true) {

            input = s.next();
            symbol = input.charAt(0);

            if (input.compareTo("exit") == 0) {
                System.out.println("Program ended");
                break;
            }
            if (symbol <= 'Z' && symbol >= 'A') {
                System.out.println("Tegnet er et stort bogstav");
            } else if (symbol <= 'z' && symbol >= 'a') {
                System.out.println("Tegnet er et lille bogstav");

            } else if (symbol >= '0' && symbol <= '9') {
                System.out.println("Tegnet er et tal");
            } else if (symbol == '#' || symbol == '!' || symbol == '+' || symbol == '\\') {
                System.out.println("Tegnet er et af de 4 specialtegn");
            } else {
                System.out.println("Tegnet er ikke kendt af dette program");

            }


        }

    }
}




