import java.util.Scanner;

public class Pyramider {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int hashtag = 0;



        for (int p = 1; p <= n; p++) {

            if (n == 1) {
                System.out.println("Pyramid " + 1);
                System.out.println("#");
            } else {

                System.out.println("Pyramid " + p);

                for (int i = 1; i <= p; i++) {

                    //der skal printes punktummer ift niveau pyramide
                    for (int k = p; k > i; k--) {
                        System.out.print(".");

                    }

                    //antallet af hashtags pr niveau pyramide
                    hashtag = 2 * i - 1;
                    for (int j = 1; j <= hashtag; j++) {
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


            }
            s.close();

    }
}
