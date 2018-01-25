package code.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MakingAnagrams {

	public static int makingAnagrams(String str1,String str2)
	{
		int count=0;
		int count1[] = new int[256];
		int count2[] = new int[256];
		int len1 = str1.length();
		int len2 = str2.length();
		for (int index = 0; index < len1 ||index <len2; index++) {
			if(index < len1) count1[str1.charAt(index)]++;
			if(index < len2) count2[str2.charAt(index)]++;
		}
		for (int index = 0; index <256; index++) {
			if(count1[index]!=count2[index])
			{
				count+= Math.abs(count1[index]-count2[index]);
			}
		}
		return count;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner( new File("src/files/makingAnagrams.txt"));
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
