package algorithms.Implementation;

import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        in.nextLine();
        String steps = in.nextLine();
        int sea_level=0,valley=0;
        boolean below_sea=false;
        for(int i=0 ; i<n ;i++){
            char step = steps.charAt(i);
            if(step=='U')
                sea_level++;
            if(step=='D')
                sea_level--;
            
            if(!below_sea&&sea_level<0)
            {
                valley++;
                below_sea=true;
            }
            if(sea_level>=0)
                below_sea=false;
        }
        System.out.println(valley);
    }
}