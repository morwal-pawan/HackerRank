package algorithms.Implementation;

import java.util.Scanner;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int result[]={0,0};
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        for(int apple_i=0; apple_i < m; apple_i++){
            int d=apple[apple_i]+a;
            if((d>=s)&&(d<=t)){
               result[0]++; 
            }
        }
         for(int orange_i=0; orange_i < n; orange_i++){
             int d=orange[orange_i]+b;
           if((d>=s)&&(d<=t)){
               result[1]++; 
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
               
    }
}
