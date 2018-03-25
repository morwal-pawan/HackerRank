package algorithms.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

    
    static class  MyComparator implements Comparator<String> {
	    public int compare(String x, String y) {
	        if (x.length() == y.length()) {
	            return x.compareTo(y);
	        } 
	        return x.length() - y.length();
	    }
    }
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        Arrays.sort(arr,new MyComparator());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i != arr.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
