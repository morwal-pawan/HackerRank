package algorithms.sorting;

import java.util.Scanner;

public class CountingSort2 {

    static int[] countingSort(int[] arr) {
        int count[]  = new int[100];
        for(int i=0; i <arr.length; i++)
            count[arr[i]]++;
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] count = countingSort(arr);
        
        for (int i = 0; i < 100; i++) {
                for(int j = 0; j<count[i]; j++)
                    System.out.print(i+" ");
        }
        System.out.println("");


        in.close();
    }
}
