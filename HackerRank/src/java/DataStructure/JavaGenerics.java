package java.DataStructure;

import java.lang.reflect.Method;



class Printer<Item>
{
  public  void printArray(Item[] arr)
  {
    for(Item item:arr)
        System.out.println(item);
  }
}

public class JavaGenerics {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            if ("printArray".equals(method.getName()))
		++count;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}



