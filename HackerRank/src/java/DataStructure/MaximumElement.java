package java.DataStructure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) throws FileNotFoundException {
	Scanner in = new Scanner(new FileReader("src/files/MaximumElement.txt"));
	Deque<Integer> stack = new ArrayDeque<>();
	Deque<Integer> maxStack = new ArrayDeque<>();
	int n = in.nextInt();
	int query = 0;
	maxStack.offerLast(0);
	while(n-- >0)
	{
	    query = in.nextInt();
	    if(query==1)
	    {
		int temp = in.nextInt();
		stack.offerLast(temp);
		if(maxStack.peekLast() <= temp) maxStack.offerLast(temp);
	    }
		
	    else if(query == 2)
	    {
		int temp = stack.pollLast();
		if(maxStack.peekLast() == temp) maxStack.pollLast();
	    }
	    else if(query == 3)
		System.out.println(maxStack.peekLast());
	}
    }
}
