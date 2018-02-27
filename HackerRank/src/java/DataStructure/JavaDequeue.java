package java.DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

  public class JavaDequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offerLast(num);
            set.add(num);
            if(deque.size()==m)
            {
            	if(set.size()>max) max = set.size();
            	int first = deque.pollFirst();
            	if(!deque.contains(first)) set.remove(first);
            }
        }
        System.out.println(max);
    }
	       
}