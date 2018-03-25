package algorithms.Implementation;

import java.util.Scanner;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
	if ((x1 > x2) && (v1 > v2) || (x2 > x1) && (v2 > v1)) {
	    return "NO";
	} else {
	    if ((v1 > 0) && (v2 > 0) || (v1 < 0) && (v2 < 0)) {
		int X = Math.abs(x1 - x2);
		int V = Math.abs(v1 - v2);
		float ans = (float) X % V;
		if (ans == 0.0) {
		    return "YES";
		} else
		    return "NO";
	    }
	}
	return "";
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int x1 = in.nextInt();
	int v1 = in.nextInt();
	int x2 = in.nextInt();
	int v2 = in.nextInt();
	String result = kangaroo(x1, v1, x2, v2);
	System.out.println(result);
    }
}
