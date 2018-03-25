package warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int outer_i=0; outer_i<n; outer_i++ ){
            for(int inner_i=n-2- outer_i; inner_i>=0; inner_i-- )
            {
                System.out.print(" ");
            } 
             for(int inner_i=0; inner_i<outer_i+1; inner_i++)
            {
                System.out.print("#");
            } System.out.println();
        }
    }
}
