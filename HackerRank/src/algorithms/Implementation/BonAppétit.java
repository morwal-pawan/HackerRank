package algorithms.Implementation;

import java.util.Scanner;

public class BonAppétit {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Integer sum = 0;
	int n = in.nextInt();
	int k = in.nextInt();
	int[] ar = new int[n];
	for (int ar_i = 0; ar_i < n; ar_i++) {
	    ar[ar_i] = in.nextInt();
	    sum += ar[ar_i];
	}
	double split = sum / 2;
	int b = in.nextInt();
	Integer realBlance = 0;
	if (b == split) {
	    realBlance = (Integer) (b - (sum - ar[k]) / 2);
	} else {
	    System.out.println("Bon Appetit");
	    return;
	}
	System.out.println(realBlance);
	return;
    }
}
