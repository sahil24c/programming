package com.bridgelabz.utility;

public class TicTac {
	int n = 3;
    int[] rowC = new int[n];
    int[] colC = new int[n];
    int[] diagleft = new int[n];
    int[] diagright = new int[n];

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }
        System.out.println("sum of array" + sum);
        return sum;
    }

    public int move(int row, int col, int player) {
        int move = player == 1 ? 1 : -1;
        rowC[row] += move;
        colC[col] += move;
        if (row == col)
            diagleft[row] += move;
        if (row == (n - col - 1))
            diagright[row] += move;

        return 0;
    }
}