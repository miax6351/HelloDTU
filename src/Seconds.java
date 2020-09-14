import java.util.Scanner;

public class Seconds {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Indtast sekunder");
        int sec = Integer.parseInt(s.nextLine());

        int d = 0;
        int e = 0;
        int f = 0;
        int restSec1 = 0;
        int restSec2 = 0;
        int restSec3 = 0;

        d = (sec/8640);
        restSec1 = (int) (sec - (d*8640));

        System.out.println(day(sec, d, restSec1));
        System.out.println(hour(e, restSec1, restSec2));
        System.out.println(minutes(f, restSec1, restSec2, restSec3));
        System.out.println(restSec3 + "seconds");

    }

    /*
static int calc(int sec) {
        return 1;
        //1 min = 60 sec
        //1 hour = 360 sec
        //1 day = 8640 sec
}
     */

static String day(double sec, double d, double restSec1) {
        d = (sec/8640);
        restSec1 = (int) (sec - (d*8640));
        return d + " days";

}

static String hour(double e, double restSec1, double restSec2) {
        e = restSec1/360;
        restSec2 = (int) (restSec1 -(e*360));
        return (int) e + " hours";
}

static String minutes(double f, double restSec1, double restSec2, double restSec3) {
        f = restSec2/60;
        restSec3 = (int) (restSec2 - (f*60));
        return (int) (f/60) + " minutes";
}

}
