package java.DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
    
    public static Scanner in = new Scanner(System.in);
    public static  ArrayList<Integer> operation(ArrayList<Integer> list)
    {
        int q = in.nextInt();
        for(int i= 0 ; i<q; i++){
            String query = in.next();
            if("Insert".equals(query)) 
            {
                 int index = in.nextInt();
                 int value = in.nextInt();
                 list.add(index,value);  
            }
            if("Delete".equals(query)) 
            {
                list.remove(in.nextInt());
            }
        }
        return list;
       
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int list_size = in.nextInt();
        for(int i=0; i<list_size;i++)
        {
            list.add(Integer.valueOf(in.nextInt()));
        }
        ArrayList<Integer> result = operation(list);
        for(Integer value:list)
        {
            System.out.print(value +" ");
        }
        
    }
}