package com.bridgelabz.algorithm;
import java.util.Arrays;
import java.util.Scanner;

class Sort {
    void merge(int[] arr, int l, int m, int r) {
        int fir = l;
        int sec = m + 1;
        int[] k = new int[r - l + 1];
        int t = 0;

        while (fir <= m && sec <= r) {
            if (arr[fir] <= arr[sec]) {
                k[t] = arr[fir];
                t++;
                fir++;
            } else  {
                k[t] = arr[sec];
                t++;
                sec++;
            }
        }
        while (fir <= m) {
            k[t] = arr[fir];
            t++;
            fir++;

        }

        while (sec <= r) {
            k[t] = arr[sec];
            t++;
            sec++;

        }
        for(int i = l; i <= r; i += 1) {
            arr[i] = k[i - l];
            System.out.println(arr[i]);
        }
    }



    void sort(int[] arr,int l, int r)
    {
        if(l<r) {

            int m = (r + l) / 2;
            System.out.println(m);
            System.out.println(l+" "+ r);
           sort(arr, l, m);
          sort(arr, m + 1, r);
           merge(arr,l,m,r);
        }
    }

}

public class MergeSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        Sort obj = new Sort();
        obj.sort (arr,0,n-1);
        }
}

