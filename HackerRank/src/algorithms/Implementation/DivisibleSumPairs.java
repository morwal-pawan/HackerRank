package algorithms.Implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
	int result = 0;
	for (int ar_i = 0; ar_i < n; ar_i++) {
	    for (int ar_j = ar_i + 1; ar_j < n; ar_j++) {
		if ((ar[ar_i] + ar[ar_j]) % k == 0) {
		    result++;
		}
	    }
	}
	return result;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int[] ar = new int[n];
	for (int ar_i = 0; ar_i < n; ar_i++) {
	    ar[ar_i] = in.nextInt();
	}
	int result = divisibleSumPairs(n, k, ar);
	System.out.println(result);
    }
}
