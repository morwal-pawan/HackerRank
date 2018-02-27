package java.DataStructure;

import java.util.Scanner;

public class Java2DArray {

    public static int getMin(int[][]arr)
    {
        int value=0;
        int max = Integer.MIN_VALUE;
        for(int i=2; i<6;i++)
            for(int j=2;j<6; j++)
            {   
                value =  arr[i-2][j-2] + arr[i-2][j-1] + arr[i-2][j] 
                            + arr[i-1][j-1] + 
                         arr[i][j-2] + arr[i][j-1] + arr[i][j];
                if(value >max) max=value;
            }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(getMin(arr));
    }
}
