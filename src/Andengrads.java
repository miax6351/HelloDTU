import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Andengrads {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d;
        double x1;
        double x2;

        //regne diskriminant
        d = b * b - (4 * a * c);

        if (a == 0 && b!= 0){
            x1 = -c/b;
            System.out.println(x1);
        }
        else if (d > 0) {
            x1 = (-b + sqrt(b * b - (4 * a * c))) / 2*a;
            x2 = (-b - sqrt(b * b - (4 * a * c))) / 2*a;
            System.out.print(x1 + " " +x2);
        }

        else if (d < 0) {
            System.out.println("Ingen rødder");
        }

        else if (d == 0) {
            x1 = -b / (2*a);
            System.out.print(x1);
        }

        in.close();




    }


}
