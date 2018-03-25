package agorithms.string;

import java.util.Scanner;

public class FunnyString {

    public static String funnyString(String str)
	{
		int length = str.length();
		for(int left =1,right=length-1; left <(length/2) && right >(length/2);left++,right--)
		{
			if( Math.abs(str.charAt(left)-str.charAt(left-1))!=Math.abs(str.charAt(right)-str.charAt(right-1)))
				return "Not Funny";
		}
		if(length%2==1)
			if(str.charAt(length/2 -1)!=str.charAt(length/2 +1))
					return "Not Funny";
			
		return "Funny";
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
