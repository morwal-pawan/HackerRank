package java.String;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String A=in.next();
        String B=in.next();
        System.out.println(A.length()+B.length());
        System.out.println((A.compareTo(B)>0)?"Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1));

        
    }
}
