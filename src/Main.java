import java.util.Scanner;

public class Main {
    // hour = 360/12; //means 30 degree per hour
    // minutes = 360/60; //means 6 degree per minute
    //hour = (hour/60); // means 0.5 degree per minute
    //degree = |h-m|
    public static void main(String[] args) {
        int h;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the time hh:mm : ");
        h = sc.nextInt();
        m = sc.nextInt();
        if (h <0 || m<0 || h>12 || m>60)
            System.out.println("Please enter correct time");
        if (h==12) h=0;
        if (m==60) m=0;
        double hour = 0.5 * ((60*h)+m);
        int minute = 6 * m;
        double degree = Math.abs((hour-minute));
        if (degree > 180)
            degree = 360 - degree;
        System.out.println("Degree Between " + h + " AND "+ m + " is " + degree );

    }
}
