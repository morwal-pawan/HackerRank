package warmup;

import java.util.Scanner;

public class CompareTheTriplets {

    static int[] solve(int []a,int b[]){
        int []result= {0,0};
        for(int i=0; i<a.length;++i)
        {
           if(a[i] > b[i]){
               ++result[0];
           }else if(a[i] < b[i]){
               ++result[1];
           }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []a = new int[3];
        int []b = new int[3];
        for(int i=0; i<a.length;i++)
        {
            a[i]=in.nextInt();
           
        }
        for(int i=0; i<b.length;i++)
        {
            b[i]=in.nextInt();
           
        }
        /*int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();*/
        int[] result = solve(a,b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
