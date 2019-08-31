package com.bridgelabz.functional;
import com.bridgelabz.utility.TicTac;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String s1 = in.next();
        System.out.println("hello, " + s1 + " lets play");
        int row;
        int col;
        int result = 0;
        int rowS = 0;
        int colS = 0;
        int dlS = 0;
        int drS = 0;
        int n = 3;
        Move game = new Move();
        Move sumarr = new Move();
        while (result == 0) {
            System.out.println("enter row and col");
            row = in.nextInt();
            col = in.nextInt();
            //player = in.nextInt();
            result = game.move(row, col, 1);
            rowS = sumarr.sumArray(sumarr.rowC);
            colS = sumarr.sumArray(sumarr.colC);
            dlS = sumarr.sumArray(sumarr.diagleft);
            drS = sumarr.sumArray(sumarr.diagright);
            if (rowS == n || colS == n || dlS == n || drS == n) {
                System.out.println("you have won");
            }



            System.out.println("computer's turn");
            row = (int) (Math.random() * 3);
            col = (int) (Math.random() * 3);
            System.out.println("row: " + row + " column: " + col);
            result = game.move(row, col, 2);
            rowS = sumarr.sumArray(sumarr.rowC);
            colS = sumarr.sumArray(sumarr.colC);
            dlS = sumarr.sumArray(sumarr.diagleft);
            drS = sumarr.sumArray(sumarr.diagright);
            if (rowS == -n || colS == -n || dlS == -n || drS == -n) {
                System.out.println("computer has won");
            }

        }

    }
}
