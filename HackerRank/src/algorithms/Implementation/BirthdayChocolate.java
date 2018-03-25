package algorithms.Implementation;

import java.util.Scanner;

public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {
	int result = 0, sum = 0;
	for (int m_i = 0; m_i < m - 1; m_i++) {
	    sum += s[m_i];
	}
	for (int s_i = m - 1; s_i < s.length; s_i++) {
	    sum += s[s_i];
	    if (sum == d)
		result++;
	    sum = sum - s[s_i - m + 1];
	}
	return result;
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] s = new int[n];
	for (int s_i = 0; s_i < n; s_i++) {
	    s[s_i] = in.nextInt();
	}
	int d = in.nextInt();
	int m = in.nextInt();
	int result = solve(n, s, d, m);
	System.out.println(result);
    }
}
