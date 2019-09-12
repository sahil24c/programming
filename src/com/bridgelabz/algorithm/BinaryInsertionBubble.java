package com.bridgelabz.algorithm;
import java.util.Arrays;
import java.util.Scanner;

class Myutil {

    void binarysearchInt(int[] arr, int size, int ele) {
        Arrays.sort(arr);
        int start = 0;
        int end = size - 1;
        int mid = (end + start) / 2;
        if (start <= end) {
            if (arr[mid] == ele) {
                System.out.println("your element found at index " + mid);
            } else if (ele < arr[mid]) {
                end = mid - 1;
            } else if (ele > arr[mid]) {
                start = mid + 1;
            }
        }

    }

    void binarysearchString(String[] parr, int size, String alpha) {
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            System.out.println("mid value " + mid);
            if (parr[mid].equals(alpha)) {
                System.out.println("your element found at index " + mid);
                break;
            } else if (parr[mid].compareTo(alpha) > 0) {
                System.out.println("sa");
                end = mid - 1;
                System.out.println(end);
            } else if (parr[mid].compareTo(alpha) < 0) {
                System.out.println("soo");
                start = mid + 1;
                System.out.println(start + " " + end);
            }
        }

    }

    void insertionsort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }

    void insertionsortstr(String[] parr, int m) {
        for (int i = 1; i < m; i++) {
            String key = parr[i];
            int j = i - 1;
            while (j >= 0 && parr[j].compareTo(key)>0) {
                parr[j + 1] = parr[j];
                j = j - 1;
            }
            parr[j + 1] = key;
        }
        for (int j = 0; j < m; j++) {
            System.out.println(parr[j]);
        }

    }
    void bubblesort(int[] arr,int  n)
    {
        int temp;
        for(int i =0 ; i<n-1;i++)
        {
            for(int j=0; j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void bubblesortstr(String[] parr, int m)
    {
        String temp;
        for(int i =0 ; i<m-1;i++)
        {
            for(int j=0; j<m-1;j++)
            {
                if(parr[j].compareTo(parr[j+1])>0)
                {
                    temp = parr[j];
                    parr[j]= parr[j+1];
                    parr[j+1]= temp;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.println(parr[i]);
        }
    }
}

public class BinaryInsertionBubble {

    public static void main(String[] args) {
        Myutil bina = new Myutil();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter\n 1 for binary search intergers,\n 2 for binary search string,\n 3 for insertion sort integers,\n 4 for insertion sort string,\n 5 for bubble sort integers,\n 6 for bubble sort string ");
        int a = in.nextInt();
        switch (a) {
            case 1: {
                System.out.println("enter number of elements");
                int n = in.nextInt();
                int[] arr = new int[n];
                System.out.println("enter elements of array");
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println("enter number to be found");
                int x = in.nextInt();
                bina.binarysearchInt(arr, n, x);
                break;
            }

            case 2: {
                System.out.println("enter number of strings");
                int m = in.nextInt();
                String[] parr = new String[m];
                System.out.println("enter string");
                for (int i = 0; i < m; i++) {
                    parr[i] = in.next();
                }
                System.out.println("enter string to be found");
                String f1 = in.next();
                bina.binarysearchString(parr, m, f1);
                break;

            }

            case 3: {
                System.out.println("enter number of elements");
                int n = in.nextInt();
                int[] arr = new int[n];
                System.out.println("enter elements");
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                Myutil func = new Myutil();
                func.insertionsort(arr, n);
                break;

            }

            case 4: {
                System.out.println("enter number of strings");
                int m = in.nextInt();
                String[] parr = new String[m];
                System.out.println("enter string");
                for (int i = 0; i < m; i++) {
                    parr[i] = in.next();
                }

                System.out.println("sorted string array is");
                bina.insertionsortstr(parr, m);
                break;

            }
            case 5:
            {
                System.out.println("enter number of elements");
                int n = in.nextInt();
                int[] arr = new int[n];
                System.out.println("enter elements");
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                bina.bubblesort(arr,n);
                break;

            }
            case 6:
            {
                System.out.println("enter number of strings");
                int m = in.nextInt();
                String[] parr = new String[m];
                System.out.println("enter string");
                for (int i = 0; i < m; i++) {
                    parr[i] = in.next();
                }

                System.out.println("sorted string array is");
                bina.bubblesortstr(parr, m);
                break;
            }
        }
    }
}
