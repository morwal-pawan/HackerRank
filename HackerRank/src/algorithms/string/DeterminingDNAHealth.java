package agorithms.string;

import java.util.Scanner;

public class DeterminingDNAHealth {
    public static int determiningDnaHealth(String[] genes,int[] health,String d,int first,int last) {
		int count=0;
		String temp ="";
		String temp1="";
		int length =0;
		for (int gen_index = first; gen_index <= last; gen_index++) {
				 temp = genes[gen_index];
				 length = temp.length();
			for (int d_index = 0; d_index < d.length()-length+1; d_index++) {
				temp1 =d.substring(d_index,d_index+length);
				if(temp.equals(temp1))
				    count+=health[gen_index]; 
			}
		}
		return count;
	}
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unhealthiest = 0;
        int healthiest = 0; 
        int n = in.nextInt();
        String[] genes = new String[n];
        for(int genes_i = 0; genes_i < n; genes_i++){
            genes[genes_i] = in.next();
        }
        int[] health = new int[n];
        for(int health_i = 0; health_i < n; health_i++){
            health[health_i] = in.nextInt();
        }
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int first = in.nextInt();
            int last = in.nextInt();
            String d = in.next();
            int value = determiningDnaHealth(genes, health, d, first, last);
            if(value >healthiest) healthiest = value;
            else if(value <unhealthiest) unhealthiest = value;
        }
        System.out.println(unhealthiest +" " + healthiest);
        in.close();
    }
}
