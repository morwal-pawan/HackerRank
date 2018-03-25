package java.DataStructure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class EqualStacks {

  
    public static int min(int a,int b,int c)
    {
	if(a < b) 
	    if(a < c) return a;
	    else return c;
	else 
	    if(b < c) return b;
	    else return c;
    }
    public static int equal(Deque s1,Deque s2,Deque s3,int sum[]) {
		int min =0;
		while(true)
		{
		    if(sum[0]==sum[1] && sum[1] == sum[2])
		    		return sum[0];
		       min = min(sum[0],sum[1],sum[2]);
		       if(min < sum[0]) sum[0]-=(int)s1.pollFirst();
		       if(min < sum[1]) sum[1]-=(int)s2.pollFirst();
		       if(min < sum[2]) sum[2]-=(int)s3.pollFirst();
		}
		
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("src/files/EqualStacks.txt"));
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
       
        
        Deque<Integer> s1 = new ArrayDeque<>(); 
        Deque<Integer> s2 = new ArrayDeque<>(); 
        Deque<Integer> s3 = new ArrayDeque<>(); 
        int sum[] = {0,0,0};
        
        for(int h1_i=0; h1_i < n1; h1_i++){
            int input = in.nextInt();
            sum[0]+=input;
            s1.offerLast(input);
        }
        
        for(int h1_i=0; h1_i < n2; h1_i++){
            int input = in.nextInt();
            sum[1]+=input;
            s2.offerLast(input);
        }
        
        for(int h1_i=0; h1_i < n3; h1_i++){
            int input = in.nextInt();
            sum[2]+=input;
            s3.offerLast(input);;
        }
        System.out.println(equal(s1, s2, s3,sum));
        
    }
}
