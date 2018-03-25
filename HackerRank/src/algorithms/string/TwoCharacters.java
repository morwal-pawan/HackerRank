package agorithms.string;

import java.util.Scanner;

public class TwoCharacters {

    static String caesarCipher(String str, int k) {
        StringBuffer result = new StringBuffer();
		char ch ;
		for(int index = 0; index<str.length(); index++)
		{	 
			if(str.charAt(index) >='a' && str.charAt(index) <='z' || str.charAt(index) >='A' && str.charAt(index) <='Z')
			{
			  if(str.charAt(index) >='a' && str.charAt(index) <='z')
				  	ch = (char) ('a' + (str.charAt(index) - 'a' + k)%26);
			  else  ch = (char) ('A' + (str.charAt(index) - 'A' + k)%26);
			  result.append(ch);  
			}	
            else result.append(str.charAt(index));
		}
		return result.toString();
    }
    
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
