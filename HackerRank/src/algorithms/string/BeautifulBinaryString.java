package agorithms.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString {

   public static int beautifulBinaryString(String str)
	{
		int count=0;
		Pattern p = Pattern.compile("010");
		Matcher m = p.matcher(str);
		while(m.find()) count++;
		return count;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
}
