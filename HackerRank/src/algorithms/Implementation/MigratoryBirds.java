package algorithms.Implementation;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MigratoryBirds {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int[] max = { 1, 0 };
	int n = in.nextInt();
	TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();
	for (int i = 1; i <= 5; i++) {
	    hm.put(i, 0);
	}
	// int[] ar = new int[n];
	for (int ar_i = 0; ar_i < n; ar_i++) {
	    int temp = 0, key;
	    key = in.nextInt();
	    temp = (Integer) hm.get(key) + 1;
	    hm.put(key, temp);
	}
	Set set = hm.entrySet();
	Iterator i = set.iterator();
	while (i.hasNext()) {
	    Map.Entry me = (Map.Entry) i.next();
	    if (max[1] < (Integer) me.getValue()) {
		max[0] = (Integer) me.getKey();
		max[1] = (Integer) me.getValue();
	    }

	}
	System.out.println(max[0]);
    }
}
