package agorithms.string;

import java.util.Scanner;

public class TwoStrings {

    public static String twoStrings(String str1,String str2)
	{
		int count1[] = new int[256];
		int count2[] = new int[256];
		int len1 = str1.length();
		int len2 = str2.length();
		for (int index = 0; index < len1 ||index <len2; index++) {
			if(index < len1) count1[str1.charAt(index)]++;
			if(index < len2) count2[str2.charAt(index)]++;
		}
		
		for (int i = 0; i < 256; i++) 
			if(count1[i]!=0 && count2[i]!=0) return "YES";
		
		return "NO";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
