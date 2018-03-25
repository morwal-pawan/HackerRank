package agorithms.string;

import java.util.Arrays;
import java.util.Scanner;

public class Gemstones {

    public static int gemstones(String[] str)
	{
		int[] count = new int[26];
		int result = 0;
		String temp ="";
		int size = str.length;
		boolean []check = new boolean[26];
		for (int index = 0; index < str.length; index++) {
			temp = str[index];
			for (int inner = 0; inner < temp.length(); inner++) {
				if(!check[temp.charAt(inner)-'a'])
				{
					count[temp.charAt(inner)-'a']++;
					check[temp.charAt(inner)-'a'] = true;
					
				}
			}Arrays.fill(check, false);
		}
		for (int index = 0; index < count.length; index++) {
			if(count[index]/size==1)
				result++;
				
		}
		return result;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
