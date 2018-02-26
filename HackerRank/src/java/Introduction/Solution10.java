package java.Introduction;

import java.util.Scanner;

public class Solution10 {

    static boolean flag;
    static int B, H;
    static {
	Scanner in = new Scanner(System.in);
	B = in.nextInt();
	H = in.nextInt();
	if (B > 0 && H > 0)
	    flag = true;
	else
	    System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args){

	if(flag)
		System.out.print((B * H));
    }
}
