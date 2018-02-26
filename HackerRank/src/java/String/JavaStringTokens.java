package java.String;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str="";
        try{
            
            if(!in.hasNext())
            {
                System.out.println(0);
                System.exit(0);
            }
            str = in.nextLine();
        }catch(NoSuchElementException e)
        {
            System.out.println(0);
            System.exit(0);
        }
//        String regx = "[ !,?.\\_'@]+";
        String tokens[] = str.trim().split("[ !,?.\\_'@]+");
        System.out.println(tokens.length);
        for(String token : tokens)
            System.out.println(token);
        in.close();
    }
}

