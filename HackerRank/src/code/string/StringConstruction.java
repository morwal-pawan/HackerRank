package code.string;

public class StringConstruction {

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
}
