package algorithms.Implementation;

import java.util.Scanner;

public class DrawingBook {

    static int solve(int n, int p) {
	int Total_turns = n / 2;
	int turn = p / 2;
	if (turn < (Total_turns - turn)) {
	    return turn;
	} else {
	    return (Total_turns - turn);
	}

    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int p = in.nextInt();
	int result = solve(n, p);
	System.out.println(result);
    }
}
