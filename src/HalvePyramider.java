import java.util.Scanner;

public class HalvePyramider {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;

        /*if (n > 0) {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
            }


        }

         */


        for(int i = 0; i < n; i++){

            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.print("\n");

            }


        }


    }

