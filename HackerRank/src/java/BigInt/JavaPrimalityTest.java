package java.BigInt;

import java.util.Scanner;

public class JavaPrimalityTest {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String result= in.nextBigInteger().isProbablePrime(1) ? "prime" : "not prime";
       System.out.println(result);
      
       in.close();
     }
 }