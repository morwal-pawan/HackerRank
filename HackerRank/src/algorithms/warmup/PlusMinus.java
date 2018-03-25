package warmup;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count[]= {0,0,0};
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if( arr[arr_i]==0)
                count[0]++;
            else if( arr[arr_i] <0)
                    count[1]++;
            else count[2]++;
        }
       for(int count_i=0; count_i<count.length; count_i++)
           if(n!=0)
            System.out.println((float)count[count.length-1-count_i]/n);
    }
}
