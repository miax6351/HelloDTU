import java.util.Scanner;

public class Pyramider {

    public static void main(String[] args) {

        //Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        int n = 7;
        int hashtag = 0;

        for(int i = 0; i < n; i++){

            for (int k = n - 1; k > i; k--) {
                System.out.print(".");

            }

            hashtag = 2 * i - 1;
            for (int j = 1; j <= hashtag; j++) {
                System.out.print("#");

            }

            for (int k = n - 1; k > i; k--) {
                System.out.print(".");

            }
            System.out.print("\n");

        }

    }


}