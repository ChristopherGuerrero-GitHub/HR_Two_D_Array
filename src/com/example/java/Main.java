package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            This is a solution for HackerRank problem 2D-Array. Given a 6x6 matrix.
            They have define an hourglass in to be a subset of values with indices
            falling in this pattern in the matrix. Calculate the hourglass sum for
            every hourglass in the matrix , then print the maximum hourglass sum.

            There are 6 lines of input, where each line contains space-separated
            integers describing 2D Array matrix; every value in will be in the
            inclusive range of -9 to 9.
         */

       /* Below is the sample input: You can copy it and paste it in the console.
          the output answer sum should be 13.

        1 1  1  0  0 0
        0 1  0  0  0 0
        1 1  1  0  0 0
        0 9  2 -4 -4 0
        0 0  0 -2  0 0
        0 0 -1 -2 -4 0

        */

        Scanner in = new Scanner(System.in);
        int [][] arrayData = new int[6][6];

        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j < 6 ; j++) {

                arrayData[i][j] = in.nextInt();
            }

        }

        int sum = 0, max = -63;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
               sum += arrayData[i][j];
               sum += arrayData[i][j+1];
               sum += arrayData[i][j+2];

               sum += arrayData[i+1][j+1];

               sum += arrayData[i+2][j];
               sum += arrayData[i+2][j+1];
               sum += arrayData[i+2][j+2];

               if (sum > max){
                 max = sum;
               }else {
                   sum = 0;
               }


            }
        }

        System.out.println(max);


    }
}
