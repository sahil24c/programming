package com.bridgelabz.functional;
import java.util.Scanner;
public class Windchill {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter temp");
        double temp = in.nextInt();
if(temp>50)
{
    System.out.println("invalid temp");
return;
}
        System.out.println("enter velocity");
        double vel = in.nextInt();
        if (vel>50||vel<3)
        {
            System.out.println("invalid vel");
            return;
        }


        double windchill= 35.74+0.62516*temp+(0.4275*temp-35.75)*Math.pow(vel,0.16);
        System.out.println("Windchill "+windchill);


    }
}