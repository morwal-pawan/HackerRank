package code.string;

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
}
