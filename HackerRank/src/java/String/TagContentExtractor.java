package java.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

   public static void getTag(String input) {
      String process_input = input; 
      Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
      Matcher matcher = pattern.matcher(process_input);
      boolean find = false;
      while(matcher.find())
      {
          System.out.println(matcher.group(2));
          find=true;
      } 
      if(!find)
      System.out.println("None");   
	
    }
    public static void main(String[] args) {
	      
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	        getTag(in.nextLine()); 
	         testCases--;
	      }
	   }
}


