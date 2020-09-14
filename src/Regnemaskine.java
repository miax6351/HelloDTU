import java.util.Scanner;

public class Regnemaskine {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Vælg regnemetode");
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());

        int n = Integer.parseInt(s.nextLine());
        int o = Integer.parseInt(s.nextLine());

        method(a, b, n, o);

        System.out.println(plus(n,o));
        s.close();

        //sout + Enter = System.out.println();

    }

    static void method(int a, int b, int n, int o) {
        if (a == 0) {
            plus(n, o);

        } if (b == 1) {
            minus(n, o);
        }
    }

    static int plus(int n, int o) {
        return n + o;
}

    static int minus(int n, int o) {
        return n - o;
    }




}



