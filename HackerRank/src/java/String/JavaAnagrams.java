package java.String;

import java.util.Scanner;

public class JavaAnagrams {


    static boolean isAnagram(String str1, String str2) {
	       int count[] = new int[256];
	        if(str1.length()!=str2.length())
	            return false;
	        for(int i=0 ; i<256 ; i++)
	            count[i]=0;
	        String aa = str1.toLowerCase();
	        String bb = str2.toLowerCase();
	        for(int index=0;(index <aa.length())&&(index <bb.length()); ++index)
	        {
	            ++count[aa.charAt(index) - 'a'];
	            ++count[bb.charAt(index) - 'a'];
	        }
	        for(int index=0;(index <aa.length())&&(index <bb.length()); ++index)
	        {
	            if(count[aa.charAt(index)- 'a']%2!=0)
	               return false;
	        }
	        
	        return true;
	        
	    }

    public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        scan.close();
        System.out.println((isAnagram(str1, str2)) ? "Anagrams" : "Not Anagrams");
    }
}
