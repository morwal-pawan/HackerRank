package java.String;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int len = sc.nextInt();
        String min = word.substring(0,len);
        String max = "";
        for(int i=0  ; i<= word.length()-len ;++i)
            {
                if(i + len > word.length())
                    break;
                else if(word.substring(i,i + len).compareTo(max)>0)
                       max = word.substring(i,i + len);
                else if(word.substring(i,i + len).compareTo(min)<0)
                        min = word.substring(i,i + len);
            
        }
          System.out.println(min+"\n"+max);
        
        
    }
}




