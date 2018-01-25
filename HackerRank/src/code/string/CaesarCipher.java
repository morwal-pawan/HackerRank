package code.string;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {

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
	
	public static void main(String[] agrs) throws IOException
	{
        Scanner in = new Scanner(new File("src/files/CaesarCipher.txt"));
//		String line = "The white tiger was Bigger then the Stronger";
//		String words[] = line.split(" ");
//		BufferedReader br = new BufferedReader(new FileReader("src/files/Anagram1Map.txt"));
		String str = in.nextLine();
		int k = in.nextInt();
		System.out.println(" INPUT : " + str );
		System.out.println(" Result :" + caesarCipher(str,k));
	}
}
