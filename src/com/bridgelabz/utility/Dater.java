package com.bridgelabz.utility;

public class Dater {
    public static void date(int d,int m,int y)
    {
        int x = 0;int y0= 0;int d0=0;int m0=0;
        y0 = y - (14 - m)/12;
        x= y0+y0/4+y0/100+y0/400;
        m0=m+ 12*((14-m) / 12)-2;
        d0 = (d+x+31*m0/12)%7;

        System.out.println(d0);
    }
}
