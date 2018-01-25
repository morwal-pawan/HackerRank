package code.string;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MarsExploration {
	
	public static boolean checkSos(String str,String sos)
	{
		System.out.println(str + " " + sos);
		for(int index=0; index<str.length();index++)
			if(str.charAt(index)!=sos.charAt(index))
				return false;
		return true;
	}
	
	
	public static int countChanges(String message) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != sos.charAt(i % 3)) count++;
        }
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
	public static  int marsExploration(String str,String sos)
	{
		int count=0;
		int sos_length = sos.length();
		for (int index = 0; index < str.length() - sos_length+1; index++) {
			if(checkSos(str.substring(index, index +sos_length), sos))
				count++;
		}
		count = str.length()/sos_length -count;
		return count;
	}
	
	public static void main(String[] agrs) throws IOException
	{
        Scanner in = new Scanner(new File("src/files/marsExploration.txt"));
//		String line = "The white tiger was Bigger then the Stronger";
//		String words[] = line.split(" ");
//		BufferedReader br = new BufferedReader(new FileReader("src/files/Anagram1Map.txt"));
		String str = in.nextLine();
		String sos = in.nextLine();
		System.out.println(" INPUT : " + str );
		System.out.println(" Result :" + marsExploration(str, sos));
	}
	
}
