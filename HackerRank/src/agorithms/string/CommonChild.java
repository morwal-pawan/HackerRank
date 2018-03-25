package agorithms.string;

import java.util.Scanner;

public class CommonChild {

    private static int lcs[][];
    public static int commonChilds(String str1,int length1,String str2,int length2)
	{
		if(length1 == 0 || length2 ==0) return 0;
		if(lcs[length1][length2] !=0) return lcs[length1][length2];
		if(str1.charAt(length1-1) == str2.charAt(length2-1))	
			return lcs[length1][length2] = commonChilds(str1, length1-1, str2, length2-1) + 1;
		else  return lcs[length1][length2] = Math.max(commonChilds(str1, length1-1, str2, length2), commonChilds(str1, length1, str2, length2-1));	
	}
	
	public static int commonChild(String str1,String str2) {
		
		int length1 = str1.length();
		int length2 = str2.length();
		lcs = new int[length1+1][length2+1];
		return commonChilds(str1, length1, str2, length2);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
    }
}
