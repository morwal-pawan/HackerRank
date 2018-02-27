package java.DataStructure;

import java.util.Scanner;

public class JavaStack {
     public static boolean idValidRegx(String input)
    {
	String regex = "\\(\\)|\\{\\}|\\[\\]";
	input = input.replaceAll("[^\\[\\]\\{\\}\\(\\)]", "");
	while(input.length() != (input = input.replaceAll(regex, "")).length()) ;
	return input.isEmpty();
    }
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
       
      while(in.hasNextLine())
	     System.out.println(idValidRegx(in.nextLine())); 	
   }
}
