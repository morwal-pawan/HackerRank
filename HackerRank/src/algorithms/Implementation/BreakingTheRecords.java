package algorithms.Implementation;

import java.util.Scanner;

public class BreakingTheRecords {

    static int[] getRecord(int[] s){
       
    		int hight_low[]={s[0],s[0]};
    		int result[]={0,0};
    		for (int s_i = 1; s_i < s.length; s_i++) {
    			
    			if (hight_low[0]>s[s_i]) {
					hight_low[0]=s[s_i];
					result[1]++;
				}else if(hight_low[1]<s[s_i]){
					hight_low[1]=s[s_i];
					result[0]++;
				}
				
			}
    		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
