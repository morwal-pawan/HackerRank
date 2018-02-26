package java.BigInt;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        System.out.println((a1.add(b1)));
        System.out.println((a1.multiply(b1)));
        
    }
}