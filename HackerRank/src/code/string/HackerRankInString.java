package code.string;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HackerRankInString {

	public static String hackerRankInString(String str,String pat) {

		int pat_len = pat.length();
		int check_index=0;
		for(int index=0; index <str.length(); index++)
		{	System.out.println(str.charAt(index) + " "+ pat.charAt(check_index) );
			if(str.charAt(index)==pat.charAt(check_index) && check_index<pat_len)
				check_index++;
		}
		System.out.println( check_index +" "+ pat_len);
		if(check_index ==pat_len)
			return "YES";
		else  return "NO";
	}
	public static void main(String[] agrs) throws IOException
	{
        Scanner in = new Scanner(new File("src/files/hackerRankInString.txt"));
//		String line = "The white tiger was Bigger then the Stronger";
//		String words[] = line.split(" ");
//		BufferedReader br = new BufferedReader(new FileReader("src/files/hackerRankInString.txt"));
		String str = in.nextLine();
		String pat = in.nextLine();
		System.out.println(" INPUT : " + str );
		System.out.println(" PAT : " + pat );
		System.out.println(" Result :" + hackerRankInString(str, pat));
	}
}
