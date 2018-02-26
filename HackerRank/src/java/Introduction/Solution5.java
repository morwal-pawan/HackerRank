package java.Introduction;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String sl=in.next();
               
                  String x=in.next();
                for(int k=x.length();k<3;k++)
                  x="0"+x ;
                
                 
                for(int j=sl.length();j<15;j++)
                 sl=sl+" ";
                System.out.printf("%s%s\n",sl,x);
            }
            System.out.println("================================");

    }
}


