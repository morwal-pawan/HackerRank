package code.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString {
	public static int beautifulBinaryString(String str)
	{
		int count=0;
		Pattern p = Pattern.compile("010");
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.println(m.start() + " " +m.end() + " " + m.group());
		}
			
		return count;
	}
	public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/files/beautifulBinaryString.txt"));
        int n = in.nextInt();
        String str = in.next();
        int result = beautifulBinaryString(str);
        System.out.println(result);
        in.close();
    }
}
