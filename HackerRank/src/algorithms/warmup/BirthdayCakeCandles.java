package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
       Arrays.sort(ar);
       int result=0;
       for(int ar_i = n-1; ar_i >=0; ar_i--){
           if(ar[ar_i]==ar[n-1])
               result+=1;
        } return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
