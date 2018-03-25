package java.DataStructure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static String getTagt(String input) {
	Scanner process_input = new Scanner(input); 
	Pattern pattern = Pattern.compile("<([^>]+)>.*</1>");
	Matcher matcher = pattern.matcher(input);
	while(matcher.find())
	{
	    System.out.println(input);
	    System.out.println(matcher.group());
	    System.out.println(matcher.group(1));
	    System.out.println(matcher.group(2));
	    
	}
	return null;
    }
    public static void main(String[] args) throws FileNotFoundException{
	      
	      Scanner in = new Scanner(new FileReader("src/files/TagContentExtractor.txt"));
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String line = in.nextLine();
	         getTagt(line);
	         testCases--;
	      }
	   }
}
