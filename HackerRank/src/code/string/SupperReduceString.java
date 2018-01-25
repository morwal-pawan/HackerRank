package code.string;

public class SupperReduceString {

	public static String solution(String str)
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
}

