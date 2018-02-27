package java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int a;
	int b;
	try{
	    a = in.nextInt();
	    b = in.nextInt();
	    if(a <0|| b < 0 || b==0)  throw new ArithmeticException("/ by zero");
	    System.out.println(a/b);
	}catch (ArithmeticException e) {
	  System.out.println(e);
	}
	catch (InputMismatchException e) {
	  System.out.println(e.getClass().getName());
	}
    }
}