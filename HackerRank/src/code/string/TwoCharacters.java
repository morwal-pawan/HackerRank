package code.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


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
	
	public static String remove(String str,char a) {
		if(str.length() <=2) return str;
		
		StringBuffer result = new StringBuffer() ;
		for (int index = 0; index < str.length(); index++) {
			if(str.charAt(index)!=a)
				result.append(str.charAt(index));
		}
		return result.toString();
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
	
public static int findAlter(String str,String chars) {
		
		int max=0;
		int maximum=0;

		if(checkAlter(str) && max <str.length())
			{ 
				
				max = str.length();
				System.out.println("Got it   "+ str +" max " + max );
				return max;
			}
		if(chars.length() <2) return 0;
		String temp="";
		System.out.println(" in Alter chars size  " + chars.length() + " chars "+ chars + " str > " + str );
		
		
	
		for (int index =  0; index < chars.length(); index++) {
			
				temp =str;
				temp = remove(str, chars.charAt(index));
				if(checkAlter(temp) && max < temp.length())
				{
					max = temp.length();
					System.out.println("Got    "+ temp +" max " + max );
					if(index ==chars.length()-1)
						return max;
				}
				String ch = chars.substring(0, index) + chars.substring(index+1);
				max=findAlter(temp,ch);
				if(max > maximum)
					maximum = max;
						
			}
		
	return maximum;
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
	public static int findAlterNoRecur(String str,String chars)
	{
		int max=0;
		for (int index = 0; index < chars.length(); index++) {
			for (int inner = 0; inner < chars.length(); inner++) {
				if(chars.charAt(index)!=chars.charAt(inner))
				{
					String temp = createString( str,chars.charAt(index),chars.charAt(inner));
//					System.out.println(temp);
					if(checkAlter(temp) && max < temp.length())
					{
						max = temp.length();
						System.out.println("Got it " + temp + " with size "+ max);
					}
						
				}
			}
			
		}
		return max;
	}
	public static void main(String[] agrs) throws IOException
	{
//      Scanner in = new Scanner(System.in);
//		String line = "The white tiger was Bigger then the Stronger";
//		String words[] = line.split(" ");
		BufferedReader br = new BufferedReader(new FileReader("src/files/TwoCharacters.txt"));
		String str = br.readLine();	
		System.out.println(" INPUT : " + str);
		String chars = findDiffertChar(str);
//		System.out.println(findAlter(str,chars));
		System.out.println(findAlterNoRecur(str, chars));
		
	}
	
	
}
