package agorithms.string;

import java.util.Arrays;
import java.util.Scanner;

public class CommonChild {

   public static String isValid(String str)
	{
		
		int length = str.length();
		int count=0;
		int min=0,min_count=0;
		int[] countChars = new int[26];
		for (int str_index = 0; str_index < length; str_index++) {
			countChars[str.charAt(str_index)-'a']++;
		}
       
        Arrays.sort(countChars);
       int i;
	     for ( i = 0; i < countChars.length; i++) {
	    	 if(countChars[i]!=0)
	    	 {
	    		 min = countChars[i];
	    		 break;
	    	 }
		}
		
		for (int index = i; index < countChars.length; index++) {
				int temp =Math.abs(countChars[index] - min);
				if(temp >=1) count+=temp;
                if(min ==countChars[index])min_count++;
			
		}
		if(count==1 || count==0 ||min==1&&min_count==1) return  "YES";
		return "NO";
		
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
