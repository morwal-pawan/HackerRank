package java.DataStructure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MactchBraces {
    public static boolean isValid(String  arr)
    {
	arr = arr.replaceAll("[^\\[\\]\\{\\}\\(\\)]", "");
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int index =0; index<arr.length();++index)
        {
            char ch = arr.charAt(index);
            if(ch == '[' || ch == '{' || ch == '(')
        	  stack.offerLast(ch);
              
            else if( ch == ']' || ch == '}' || ch == ')')
            {
        	char ch1 = stack.peekLast();
        	if(ch==']' && ch1=='[') stack.pollLast();
        	else if(ch=='}' && ch1=='{') stack.pollLast();
        	else if(ch==')' && ch1=='(') stack.pollLast();
        	else return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
        
    }
    public static boolean idValidRegx(String input)
    {
	String regex = "\\(\\)|\\{\\}|\\[\\]";
	input = input.replaceAll("[^\\[\\]\\{\\}\\(\\)]", "");
	while(input.length() != (input = input.replaceAll(regex, "")).length()) ;
	if(input.isEmpty()) return true;
	else return false;
		
    }
   public static void main(String[] args) throws FileNotFoundException{
      Scanner in = new Scanner(new FileReader("src/files/MactchBraces.txt"));
      for (int testCases = Integer.parseInt(in.nextLine()); testCases > 0;)
	System.out.println(isValid(in.nextLine()) ? "Valid" : "Invalid"); 	
   }
}


