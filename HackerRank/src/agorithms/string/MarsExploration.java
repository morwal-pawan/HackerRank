package agorithms.string;

import java.util.Scanner;

public class MarsExploration {

    public static boolean checkSos(String str,String sos)
	{
        
		for(int index=0; index<str.length();index++)
			if(str.charAt(index)!=sos.charAt(index))
				return false;
		return true;
	}
	
	public static  int marsExploration(String str)
	{
        String sos = "SOS";
		int count=0;
		int sos_length = sos.length();
		for (int index = 0; index < str.length() - sos_length+1; index++) {
			if(checkSos(str.substring(index, index +sos_length), sos))
				count++;
		}
		count = str.length()/sos_length -count;
		return count;
	}
    public static int mmarsExploration(String str)
	{
		int count=0;
		for (int index = 0; index < str.length(); index+=3) {
			if(str.charAt(index)!='S')
				count++;
			if(str.charAt(index+1)!='O')
				count++;
			if(str.charAt(index+2)!='S')
				count++;
		}
			return count;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = mmarsExploration(s);
        System.out.println(result);
        in.close();
    }
}
