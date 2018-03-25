package agorithms.string;

import java.util.Scanner;

public class AlternatingCharacters {

    public static  int alternatingCharacters(String str)
	{
		int count=0;
		for (int str_index = 1; str_index < str.length(); str_index++) {
			if(str.charAt(str_index)==str.charAt(str_index-1))
				count++;
		}
		return count;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
