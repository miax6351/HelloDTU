import java.util.Scanner;

public class Datoer3 {

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


        if (år%4 == 0 && år%400 == 0){

            switch (måned) {

                case 1, 3, 5, 7, 8, 10, 12:

                    switch (dag) {

                        case 31:
                            System.out.println(1);
                            måned++;
                            System.out.println(måned + "");
                            break;
                        default:
                            dag++;
                            System.out.print(dag + "/");
                            System.out.print(måned + " ");
                            break;

                    }
                    break;



                case 4,6,9,11:
                    switch (dag) {

                        case 30:
                            System.out.println(1);
                            måned++;
                            System.out.println(måned + " ");
                            break;
                        default:
                            dag++;
                            System.out.print(dag + "/");
                            System.out.print(måned + " ");
                            break;

                    }

                case 2:
                    switch (dag) {

                        case 29:
                            System.out.println(1);
                            måned++;
                            System.out.println(måned + " ");
                            break;
                        default:
                            dag++;
                            System.out.print(dag + "/");
                            System.out.print(måned + " ");
                            break;

                    }

                default: break;

            }

        } else {

            switch (måned) {

                case 1, 3, 5, 7, 8, 10, 12:

                    switch (dag) {

                        case 31:
                            System.out.println(1);
                            måned++;
                            System.out.println(måned + "");
                            break;
                        default:
                            dag++;
                            System.out.print(dag + "/");
                            System.out.print(måned + " ");
                            break;

                    }
                    break;



                case 4,6,9,11:
                    switch (dag) {

                        case 30:
                            System.out.println(1);
                            måned++;
                            System.out.println(måned + " ");
                            break;
                        default:
                            dag++;
                            System.out.print(dag + "/");
                            System.out.print(måned + " ");
                            break;

                    }

                case 2:
                    switch (dag) {

                        case 28:
                            System.out.println(1);
                            måned++;
                            System.out.println(måned + " ");
                            break;
                        default:
                            dag++;
                            System.out.print(dag + "/");
                            System.out.print(måned + " ");
                            break;

                    }

                default: break;

            }

        }

    }




}
