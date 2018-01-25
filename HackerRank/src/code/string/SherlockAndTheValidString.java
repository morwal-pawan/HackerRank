package code.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndTheValidString {

	public static String isValid(String str)
	{
		
		int length = str.length();
		int count=0;
		int min=0;
		int min_count=0;
		StringBuffer sb = new StringBuffer();
		int[] countChars = new int[26];
		for (int str_index = 0; str_index < length; str_index++) {
			countChars[str.charAt(str_index)-'a']++;
		}
	     Arrays.sort(countChars);
	     for (int i = 0; i < countChars.length; i++) {
	    	 if(countChars[i]!=0)
	    	 {
	    		 min = countChars[i];
	    		 break;
	    	 }
		}
		for (int index = 0; index < countChars.length; index++) {
			if(countChars[index]!=0)
			{
				sb.append((char)(index +'a'));
				if(min >= countChars[index])
				{
					System.out.println(min + "chars " + (char)(index +'a'));
					min = countChars[index];
					min_count++;
				}
					
			}
				
		}
		String str1 = sb.toString();
		for (int index = 0; index < str1.length(); index++) {
			System.out.println(countChars[str1.charAt(index) -'a']);
//			System.out.println( "count "+ countChars[str1.charAt(index) -'a']);
				int temp =Math.abs(countChars[str1.charAt(index) -'a'] -min);
				if(temp >=1) count+=temp;
//				System.out.println(min + " " + temp);
			
		}
		System.out.println(min + " min_count " + min_count);
		if(count==1 || count==0 ||min==1&&min_count==1) return  "YES";
		return "NO";
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		 Scanner in = new Scanner( new File("src/files/SherlockAndTheValidString.txt"));
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
