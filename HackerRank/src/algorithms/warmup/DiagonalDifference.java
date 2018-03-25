package warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left_d=0;
        int right_d=0;
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
         for(int a_i=0; a_i < n; a_i++){
                left_d+= a[a_i][a_i];
                right_d+= a[a_i][n-1-a_i];
            }
        System.out.println(Math.abs(left_d - right_d));
    }
}
