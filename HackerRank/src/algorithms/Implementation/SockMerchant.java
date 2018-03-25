package algorithms.Implementation;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n = in.nextInt();
        int[] ar = new int[n];
        int pairs=0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            int value=in.nextInt();
           if(!hm.containsKey(value))
               hm.put(value,1);
           else{
               pairs++;
               hm.remove(value);
           }
        }
         
       
        System.out.print(pairs);
    
    }
}
