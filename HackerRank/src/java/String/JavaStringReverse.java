package java.String;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int r= str.length()-1;
        int l=0;
        for (; l < r; r--) {
	    if (str.charAt(l) != str.charAt(r)) {
		System.out.println("No");
		break;
	    }
	    ++l;
	}
            
        if(l>=r)
            System.out.println("Yes");
        
    }
}
