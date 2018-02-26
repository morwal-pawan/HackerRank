package java.Introduction;

import java.util.Scanner;

class Solution7 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;++i){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans=0;
            int p=1;
             ans = a +1*b;
            System.out.print(ans);
            for(int j=0 ; j<n-1 ;j++)
                {
                p *= 2;
                ans += b * p;
                System.out.print(" "+ans);
            }
            System.out.print("\n");
        } 
        in.close();
    }
}



