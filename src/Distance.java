import java.util.Scanner;
import static java.lang.Math.*;

public class Distance {

    public static void main(String[] args){

        //3.1

     Scanner s = new Scanner(System.in);

        System.out.println("Angiv linjens hældning a");
        double a = Integer.parseInt(s.nextLine());

        System.out.println("Angiv linjens b-værdi");
        double b = Integer.parseInt(s.nextLine());

        System.out.println("Angiv x-værdi");
        double x1 = Integer.parseInt(s.nextLine());

        System.out.println("Angiv y-værdi");
        double y1 = Integer.parseInt(s.nextLine());

        System.out.println(distance(a,b,x1,y1));
        s.close();

}

static double distance(double a, double b, double x1,double y1) {

       return abs(a*x1-y1+b) / sqrt(1 + pow(a, 2));

}

}

