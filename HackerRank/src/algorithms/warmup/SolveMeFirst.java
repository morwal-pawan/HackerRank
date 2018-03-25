package warmup;

import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
	return (a + b);
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(solveMeFirst(in.nextInt(), in.nextInt()));
    }
}
