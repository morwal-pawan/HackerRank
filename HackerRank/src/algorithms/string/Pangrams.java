package agorithms.string;

import java.util.Scanner;

public class Pangrams {
    public static boolean checPangrams(String str)
	{
		boolean[] check = new boolean[26];
		int check_index=0;
		for(int index=0; index<str.length(); index++)
		{
			if(str.charAt(index) >='a' && str.charAt(index) <='z')
			{
				check_index = str.charAt(index) - 'a';
				check[check_index] = true;
			}
			else if(str.charAt(index) >='A' && str.charAt(index) <='Z')
			{
				check_index = str.charAt(index) - 'A';
				check[check_index] = true;
			}
		}
		for(int index = 0; index <26; index++)
			if(!check[index]) return false;
		
		return true;
	}
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(checPangrams(str)? "pangram" : "not pangram");
    }
}
