package agorithms.string;

import java.util.Scanner;

public class TwoCharacters {

    public static boolean checkAlter(String str )
	{	if(str.length() < 2 || str.charAt(0)==str.charAt(1)) return false;
	
		char a = str.charAt(0);
		char b = str.charAt(1);
		int index;
		for ( index = 1; index < str.length(); index+=2) {
			if(str.charAt(index-1) != a || str.charAt(index) !=b)
				return false;	
		}
		if(index==str.length())
			return (str.charAt(index-3)==str.charAt(index-1));
		return true;
	}
    public static String createString(String str,char a,char b)
	{
		StringBuffer sb = new StringBuffer();
		for (int index = 0; index < str.length(); index++) {
			if(str.charAt(index)==a)
				sb.append(a);
			if(str.charAt(index)==b)
				sb.append(b);
				
		}
		
		return sb.toString();
	}
    public static String findDiffertChar(String str) {
		int count[] = new int[265];
		StringBuffer temp = new StringBuffer();
		for(int i=0; i<str.length();i++)
			count[str.charAt(i)]++;
		
		for(int i =0;  i< 256; i++)
			if(count[i]!=0)
				temp.append((char)i);
		return temp.toString();
	}
	public static int findAlterNoRecur(String str,String chars)
	{
		int max=0;
		for (int index = 0; index < chars.length(); index++) {
			for (int inner = 0; inner < chars.length(); inner++) {
				if(chars.charAt(index)!=chars.charAt(inner))
				{
					String temp = createString( str,chars.charAt(index),chars.charAt(inner));
					if(checkAlter(temp) && max < temp.length())
					{
						max = temp.length();
					}
						
				}
			}
			
		}
		return max;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String str = in.next();
        String chars = findDiffertChar(str);
        int result = findAlterNoRecur(str,chars);
        System.out.println(result);
        in.close();
    }
}
