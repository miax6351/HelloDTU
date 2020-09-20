import static java.lang.Math.sin;

public class Sinus {

    public static void main(String[] args) {
        int sm = 0;
        int sp = 0;
        int x = 0;
        double sinusregning = 0;

        //for (int k = 0; k < 2; k++) { - koordinatsystemet
            for (int i = 0; i < 8; i++) {

                for (sm = 0; sm < 20; sm++) {
                    System.out.print(" ");
                }
                if (i == 0) {
                    System.out.println("*");
                } else {
                    System.out.print("|");
                    sinusregning = 20*sin(i/16.0);
                    for (sp = 0; sp < sinusregning; sp++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }

        //}
    }


}
