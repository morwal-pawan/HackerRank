package java.DataStructure;

import java.io.FileNotFoundException;
import java.util.BitSet;
import java.util.Scanner;

class JavaBitSet {

    public static int[] set_bits= {0,0};
    public static BitSet[] B= new BitSet[2];
    public static String op=null;
  
     public static void operations(String op,int agr1,int agr2)
      {
          if("AND".equals(op)) 	     { B[agr1-1].and(B[agr2-1]); }
          else if("OR".equals(op))   { B[agr1-1].or(B[agr2-1]);  }
          else if("XOR".equals(op))  { B[agr1-1].xor(B[agr2-1]); }
          else if("FLIP".equals(op)) { B[agr1-1].flip(agr2);   }
          else if("SET".equals(op))  { B[agr1-1].set(agr2);    } 
          set_bits[0]=B[0].cardinality();
	        set_bits[1]=B[1].cardinality();
          

    }
    public static void main(String[] args) throws FileNotFoundException
    {
	  Scanner in = new Scanner(System.in);
	  int bits = in.nextInt();
	  int ops = in.nextInt();
	  B[0] = new BitSet(bits);
	  B[1] = new BitSet(bits);
	 while(ops-- >0)
	 {  op = in.next();
	     operations(op, in.nextInt(), in.nextInt());
	     System.out.println(set_bits[0] +" " + set_bits[1]);
	 }
	
    }
}
