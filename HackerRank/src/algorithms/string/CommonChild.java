package agorithms.string;

import java.util.Scanner;

public class CommonChild {

   public static int stringConstruction(String str)
	{
		int count[] = new int[256];
		int count1=0;
		for (int index = 0; index < str.length(); index++) 
			count[str.charAt(index)]++;
			
		for (int i = 0; i < count.length; i++) {
			if(count[i]!=0) 
				count1++;
		}
		return count1;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
