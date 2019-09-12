package com.bridgelabz.functional;
import java.util.Scanner;
public class Stopwatch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("to start press y");

        long start = 0;
        long stop = 0;
        long time;
        boolean running = false;
        String s = in.nextLine();
        System.out.println("to stop press n");

        if (s.equals("y")) {
            //start will take system's current time
            start = System.currentTimeMillis();
            System.out.println("start time:" + start);
            //boolean to keep track
            running = true;
        }
        //accepts user response to stop
        s = in.nextLine();

        if (s.equals("n")) {
            stop = System.currentTimeMillis();
            System.out.println("stop time:" + stop);

            running = false;
        }
        if (!running) {
            //calculates time
            time = (stop - start) / 1000;
            System.out.println("stopwatch time: " + time + " seconds");
        }
    }
    }