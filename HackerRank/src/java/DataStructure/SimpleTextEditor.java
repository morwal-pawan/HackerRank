package java.DataStructure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {
    private static class Node{
	String result;
	String previous;
	int op;
	public Node() {}
	public Node(String result, String previous) {
	    this.result = result;
	    this.previous = previous;
	}
	public String toString() {
	    return this.result + " pre " + this.previous + " op " + this.op;
	}
	
    }
    public static void main(String[] args) throws FileNotFoundException {
	Scanner in = new Scanner(new FileReader("src/files/SimpleTextEditor.txt"));
	Deque<Node> stack = new ArrayDeque<>();
	Node temp =null;
	stack.offerLast(new Node("",""));
	int op = in.nextInt();
	while(op-- >0) {
	    int qry = in.nextInt();
	    if(qry == 1) {
		
		Node current = new Node();
		temp = stack.peekLast();
		System.out.println("in append");
		System.out.println(temp);
		current.previous = temp.result;
		current.result = current.previous + in.nextLine(); current.op=1;
		System.out.println(current);
		stack.offerLast(current);
	    }
	    else if(qry == 2) {
		System.out.println("in delete");
		int k = in.nextInt();
		temp = stack.pollLast();
		System.out.println("Befor " +temp);
		String str = temp.result;
		temp.previous = temp.result;
		temp.result =  str.substring(str.length()-k); 
		temp.op=2;
		System.out.println("after "+ temp);
		stack.offerLast(temp);
	    }
	    else if(qry == 3) {
		int k = in.nextInt();
		temp = stack.peekLast();
		System.out.println(temp.result.charAt(k));
	    }
	    else if(qry == 4) {
		temp = stack.pollLast();
		if(temp.op==1)
		{
		  Node preTemp = stack.pollLast();
		  temp.result = temp.previous;
		  temp.previous = preTemp.result;
		  temp.op = preTemp.op;
		  stack.offerLast(preTemp);
		  stack.offerLast(temp);
		  
		}else if(temp.op ==2) {
		          Node preTemp = stack.pollLast();
			  temp.result = temp.previous;
			  temp.previous = preTemp.result;
			  temp.op = preTemp.op;
			  stack.offerLast(preTemp);
			  stack.offerLast(temp);
		
		}
	    }
	    
	}
	
    }
}
