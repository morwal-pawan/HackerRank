package agorithms.string;

import java.util.Scanner;

public class TheLoveLetterMystery {

 	public static int loveLetterMystery(String str)
	{
		int count=0;
		
		for (int left = 0,right = str.length()-1; left < right; left++,right--) {
			if(str.charAt(left)!=str.charAt(right))
			{	char ch1 = str.charAt(left);
				char ch2 = str.charAt(right);
				count += Math.abs(ch1-ch2);
			}
		}
		return count;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = loveLetterMystery(s);
            System.out.println(result);
        }
    }
}
