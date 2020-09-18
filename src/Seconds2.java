import java.util.Scanner;

public class Seconds2 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int sec = Integer.parseInt(s.nextLine());

        double days,hours, minutes, restSec1, restSec2, restSec3 = 0;

         /*
        1 min = 60 sec
        1 hour = 360 sec
        1 day = 86400 sec
        */

        System.out.print(sec + " seconds equals ");

        days = (int)(sec/86400);
        restSec1 = (sec - (days*86400));
        System.out.print(days + " days, ");

        hours = (int)(restSec1/360);
        restSec2 = (restSec1 - (hours*360));
        System.out.print(hours + " hours, ");

        minutes = (int)(restSec2/60);
        restSec3 = (restSec2 - (minutes*60));
        System.out.print(minutes + " minutes and ");

        System.out.print(restSec3 + " seconds");


    }


}
