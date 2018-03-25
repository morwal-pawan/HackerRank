package agorithms.string;

import java.util.Scanner;

public class HackerRankInAString {

    public static String hackerRankInString(String str) {
        String pat ="hackerrank";
		int pat_len = 10;
		int check_index=0;
		for(int index=0; index <str.length()&& check_index<pat_len; index++)
			if(str.charAt(index)==pat.charAt(check_index) )
				check_index++;
        
		if(check_index==pat_len)
			return "YES";
		else  return "NO";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerRankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
