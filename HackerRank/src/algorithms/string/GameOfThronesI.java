package agorithms.string;

import java.util.Scanner;

public class GameOfThronesI {

    public static String gameOfThrones(String str)
	{
		int count[] = new int[256];
		int count1=0;
		for (int index = 0; index < str.length(); index++) 
			count[str.charAt(index)]++;
			
		for (int i = 0; i < count.length; i++) {
			if(count[i]%2==01) count1++;
		}
		if(count1>1) return "NO";
				
		return "YES";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
