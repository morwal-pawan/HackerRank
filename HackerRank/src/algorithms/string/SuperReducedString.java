package agorithms.string;

import java.util.Scanner;

public class SuperReducedString {

    static String super_reduced_string(String str)
        {
		for (int index = 1; index <str.length(); index++ ) {
			if(str.charAt(index-1)==str.charAt(index))
				{
					str = str.substring(0, index-1) + str.substring(index+1, str.length());
					index = 0;
				}
		}
		if(str.length()==0) 	return "Empty String";
		else 					return str;
		
	}
		
	
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
