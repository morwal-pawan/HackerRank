package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min=0,max=0;
       long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
         Arrays.sort(arr);
         for(int arr_i=0; arr_i < 5; arr_i++){
            if(arr_i<4)
                min+=arr[arr_i];
            if( arr_i>0 )
                max+=arr[arr_i];
        }
        System.out.println(min+" "+max);
    }
}
