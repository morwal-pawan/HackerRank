package java.BigInt;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;++i)
	     s[i] = sc.next();
         
        Arrays.sort(s,0,n, new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return -a.compareTo(b);
            }
        });
        for(int i=0;i<n;++i)
	    System.out.println(s[i]);
      	sc.close();
    }
}
