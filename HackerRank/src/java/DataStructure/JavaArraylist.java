package java.DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
       public static Scanner in = new Scanner(System.in);
    public static void query(ArrayList<Integer>[] arrList)
    {
        int q = in.nextInt();
        for(int i=0; i<q; i++)
        {
            int index1 = in.nextInt();
            int index2 = in.nextInt()-1;
            try{
               int temp = arrList[index1].get(index2);
                System.out.println(temp);
            }catch(IndexOutOfBoundsException e)
            {
                System.out.println("ERROR!");
            }
        }
    }
    public static void main(String[] args) {
        
        int n = in.nextInt();
        ArrayList<Integer>[] arrList = new ArrayList[n+1];
        for (int i = 0; i < arrList.length; i++) {
        	arrList[i] = new ArrayList<Integer>();	
		}
        for(int i=1;i<=n;i++)
        {
            int d = in.nextInt();
            for(int j=0; j<d; j++)
            {
            	int temp = Integer.valueOf(in.nextInt());
            	arrList[i].add(j,temp);
            }      
        }
      query(arrList);  
    }
}
