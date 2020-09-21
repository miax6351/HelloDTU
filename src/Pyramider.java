import java.util.Scanner;

public class Pyramider {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int antal_hashtags = 0;

        //int p tæller pyramidenummer
        for (int p = 1; p <= n; p++) {

            if (n == 1) {
                System.out.println("Pyramid " + 1);
                System.out.println("#");
            } else {

                System.out.println("Pyramid " + p);

                //alle pyramider indtil pyramide nr. 2 får dette foretaget
                for (int i = 1; i <= p; i++) {

                    //der skal printes punktummer ift niveau pyramide
                    for (int k = p; k > i; k--) {
                        System.out.print(".");

                    }

                    //antallet af hashtags ift niveau pyramide
                    antal_hashtags = 2 * i - 1;
                    for (int j = 1; j <= antal_hashtags; j++) {
                        System.out.print("#");

                    }

                    //der skal printes punktummer ift niveau pyramide
                    for (int k = p; k > i; k--) {
                        System.out.print(".");

                    }
                    //nyt niveau
                    System.out.print("\n");
                }
            }

            System.out.println(" ");
        }
        s.close();

    }
}
