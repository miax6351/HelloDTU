import java.util.Scanner;

public class Datoer {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int år = 0;
        int måned = 0;
        int dag = 0;

        System.out.println("DAGEN EFTER d..");
        System.out.println("skriv dato, måned og år:");
        dag = s.nextInt();
        måned = s.nextInt();
        år = s.nextInt();

        if (måned < 0 || måned > 0) {
            System.out.println("Ugyldig dato");
        }

        switch (måned) {

            case 1, 3, 5, 7, 8, 10:

                    if (dag == 31) {
                        dag = 1;
                        måned++;
                    } else if (dag > 31 || dag < 0) {
                        System.out.println("Ugyldig dato");
                    }
                    else {
                        dag++;
                    }
                    break;

            case 4,6,9,11:

                    if (dag == 30) {
                        dag = 1;
                        måned++;
                    }  else if (dag > 30 || dag < 0) {
                        System.out.println("Ugyldig dato");
                    }else {
                        dag++;
                }
                    break;

            case 2:
            if (år%4==0 && år%400==0 && dag==29) {
                dag = 1;
                måned++;
                if (dag > 29 || dag < 0) {
                    System.out.println("Ugyldig dato");
                }
            } else if (år%4 == 0 && år%100==0 && dag==28) {
                dag = 1;
                måned++;
                if (dag > 28 || dag < 0) {
                    System.out.println("Ugyldig dato");
                }
            } else if (år%4 == 0 && år%100!=0 && dag == 29){
                dag = 1;
                måned++;
                if (dag > 29 || dag < 0) {
                    System.out.println("Ugyldig dato");
                }
            }
            else {
                dag++;
            }

            case 12:
            if (dag == 31) {
                dag = 1;
                måned = 1;
                år++;
            } else if (dag > 31 || dag < 0) {
                System.out.println("Ugyldig dato");
            }

            }

        System.out.println(dag + "/" + måned + " " + år);

        s.close();

    }

}