package com.bridgelabz.algorithm;
import java.util.Scanner;

class Tell {
    void notes(int[] dem, int mon) {
        int i = 0;
        while (mon != 0)
        {
            if (mon == 0) {
                System.out.println("hey");
            } else {
                if (mon >= dem[i]) {
                    int notes = mon / dem[i];
                    mon = mon % dem[i];
                    System.out.println(notes + " of " + dem[i]);
                }
            }
        i++;
    }
}

    }

public class VendingMachine {

    public static void main(String[] args) {
        System.out.println("enter your money");
        Scanner in = new Scanner(System.in);
        int mon = in.nextInt();
        int[] dem = {2000, 500, 200, 100, 50, 10, 2, 1};
        Tell obj = new Tell();
        obj.notes(dem, mon);

    }
}
