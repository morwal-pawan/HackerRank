package agorithms.string;

import java.util.Scanner;

public class CamelCase {

    static int camelcase(String str) {
        int count =0;
		for (int index = 0; index < str.length(); index++) {
			if(str.charAt(index) >= 'A'&& str.charAt(index) <= 'Z' )
			{
				count++;
			}
			
		}
		count++;
		
		
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
