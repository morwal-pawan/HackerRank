package code.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromeIndex {

	public static int palindromeIndex(String str)
	{
		int index=0;
		int length = str.length();
		int left,right;
		if(length%2==0)
		{
			right = length/2;
			left = length/2-1;
			
			
		}else 
			{
			left = length/2;
//			left=right = length/2;
			right = left+1;
				
			}
		for (; left>=0 && right<length ; left--,right++) {
//			System.out.println(left +" " + right);
			if(str.charAt(left)!=str.charAt(right))
			{ 
				if(str.charAt(left)!=str.charAt(right-1)) return left;
				else if(str.charAt(left+1)!=str.charAt(right)) return right;
				else if (str.charAt(left-1)!=str.charAt(right)&& left>0) return right;
				else if (str.charAt(left)!=str.charAt(right+1)&& right< length -1)  return left;
			}
		}
		return -1;
	}
	public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner( new File("src/files/palindromeIndex.txt"));
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
	}
}
