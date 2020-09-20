import java.util.Scanner;

public class Pyramider {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int hashtag = 0;

        System.out.println("Pyramid " + n);

        if (n == 1) {
            System.out.println("#");
        } else {

            for (int i = 1; i <= n; i++) {

                for (int k = n; k > i; k--) {
                    System.out.print(".");

                }

                hashtag = 2 * i - 1;
                for (int j = 1; j <= hashtag; j++) {
                    System.out.print("#");

                }

                for (int k = n; k > i; k--) {
                    System.out.print(".");

                }
                System.out.print("\n");

            }


        }
        s.close();
    }
}
