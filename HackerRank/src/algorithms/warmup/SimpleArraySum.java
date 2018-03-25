package warmup;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n,sum=0;
	n=in.nextInt();
	for(int i=0; i<n; i++)
	    sum+=in.nextInt();
	System.out.println(sum);
    }
}
