package algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPart2 {

    static void insertionSort2(int n, int[] arr) {
	for (int i = 0; i < n; i++) {
	    for (int j = i; j > 0; j--) {

		if (arr[j - 1] > arr[j]) {
		    int temp = arr[j];
		    arr[j] = arr[j - 1];
		    arr[j - 1] = temp;
		} else {
		    break;
		}
	    }
	    if (i != 0)
		print(arr);
	}
    }

    public static void print(int[] arr) {
	for (int n : arr)
	    System.out.print(n + " ");
	System.out.println();
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] arr = new int[n];
	for (int arr_i = 0; arr_i < n; arr_i++) {
	    arr[arr_i] = in.nextInt();
	}
	insertionSort2(n, arr);
	in.close();
    }
}
