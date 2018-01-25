package code.string;

public class CamelCase {

	public static int cameCase(String str) {
		int count =0;
		String result = "";
		int first_index=0 ;
		for (int index = 0; index < str.length(); index++) {
			if(str.charAt(index) >= 'A'&& str.charAt(index) <= 'Z' )
			{
				count++;
				result+=str.substring(first_index, index) + " "; 
				first_index = index ;
			}
			
		}
		count++;
		result+=str.substring(first_index);
		
		return count;
	}
}
