package java.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
	
//	String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile("\\b(\\w+)(\\W+\\1\\b)+",Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher matcher = pattern.matcher(input);
            
            while (matcher.find()) 
                input = input.replaceAll(matcher.group(),matcher.group(1));
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

