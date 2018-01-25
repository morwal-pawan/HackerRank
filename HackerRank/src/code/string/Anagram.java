package code.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Anagram {
	
	public static int anagram(String str)
	{
		if(str.length()%2==1) return -1;
		int right = str.length()/2;
		int left = right-1;
		int count=0;
		int count1[] = new int[256];
		int count2[] = new int[256];
		for(;left>=0 && right<str.length();left--,right++)
		{
			count1[str.charAt(left)]++;
			count2[str.charAt(right)]++;
		}
		for (int index = 0; index < count1.length; index++) {
			if(count1[index] >count2[index])
				count+=count1[index] -count2[index];
		}
		return count;
	}
	public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner( new File("src/files/anagram.txt"));
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
	}
}
