package java.DataStructure;

import java.util.HashMap;
import java.util.Scanner;

class JavaMap
{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
       HashMap<String, Integer> book = new HashMap<String, Integer>();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         book.put(name,phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          if(book.get(s)!=null)
                 System.out.println(s +"="+ book.get(s)); 
         else  System.out.println("Not found"); 
      }
   }
}