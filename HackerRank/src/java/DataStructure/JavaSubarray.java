package java.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubarray {

    public static boolean isNegative( List<Integer> list)
    {
        int result=0;
        for(int i=0;i<list.size();i++)
              result+=list.get(i);
          
        if(result >= 0) return false;
        return true;
    }
    public static int getResult( ArrayList<Integer> list,int size){
        int count=0;
        for(int i=0;i<size;i++)
            for(int j=i;j<size; j++)
                if(isNegative(list.subList(j-i,j+1))) count++;
        return count;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = in.nextInt();
        for(int i=0 ; i<size; i++)
        {
            Integer temp = Integer.valueOf(in.nextInt());
            list.add(temp);
        } 
      System.out.println(getResult(list,size));
    }
}
