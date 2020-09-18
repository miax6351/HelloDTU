import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Datoer {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int år = 0;
        int måned = 0;
        int dag = 0;

        måned = s.nextInt();
        dag = s.nextInt();
        år = s.nextInt();

        switch (måned) {

                case 1, 3, 5, 7, 8, 10, 12:

                    switch (dag) {

                        case 31:
                            System.out.println(1);
                            måned++;
                            break;
                        default:
                            dag++;
                            System.out.println(dag);
                            break;

                    }
                    break;



            case 2,4,6,9,11:
                dag = s.nextInt();
                switch (dag) {

                    case 30:
                        System.out.println(1);
                        måned++;
                        break;
                    default:
                        dag++;
                        System.out.println(dag);
                        break;

                }
            default: break;

        }



        System.out.println(år);

        s.close();

    }

}