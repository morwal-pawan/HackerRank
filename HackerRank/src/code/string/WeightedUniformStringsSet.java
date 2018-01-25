package code.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WeightedUniformStringsSet {
	
	public static Set<Integer> weightedUniformStringHashMap(String str)
	{
		Set<Integer> map = new HashSet<Integer>();
		for(int index=0; index <str.length(); index++)
		{
			int key = str.charAt(index) -'a' + 1;
			int weight  = key ;
			if(map.contains(key))
			{ 
				key = key + weight;
				while(map.contains(key))
				{
					key = key + weight;
				}
				 map.add(key);
			}
			else map.add(key);
			
		}

		
		for (Integer integer : map) {
			System.out.println(integer);
		}
		return map;
	}

	
//	public static Set<Integer> weightedUniformStringHashMap(String str)
//	{
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		for(int index=0; index <str.length(); index++)
//		{
//			int weigth = str.charAt(index) -'a' + 1;
//			String key = str.charAt(index)+"";
//			if(map.containsKey(key))
//			{ 
//				int value = map.get(key);
//				key = str.charAt(index)+key;
//				while(map.containsKey(key))
//				{
//					 key = str.charAt(index)+key;
//					 value = value + weigth;
//				}
//				 value = value + weigth;
//				 map.put(key, value);
//			}
//			else map.put(key, weigth);
//			
//		}
//
//		Set<Entry<String, Integer>> set = map.entrySet();
//        Set<Integer> result = new HashSet<Integer>();
//		for(Entry<String, Integer> entry : set )
//		{
//			System.out.println(entry.getKey() +" : " + entry.getValue());
//                               result.add(entry.getValue());
//		}
//		for (Integer integer : result) {
//			System.out.println(integer);
//		}
//		return result;
//	}
	public static void main(String[] agrs) throws IOException
	{
		//Scanner in = new Scanner(System.in);
//		String line = "The white tiger was Bigger then the Stronger";
//		String words[] = line.split(" ");
		BufferedReader br = new BufferedReader(new FileReader("src/files/weightedUniformStringHashMap.txt"));
		String str="";
		try {
			str = br.readLine();
			
		} catch (NumberFormatException e) {
			System.out.println(" Values Must be Integer ");
			System.out.println("but   " + e.getMessage());
			System.exit(0);
		}
		System.out.println(" String : " + str);
		weightedUniformStringHashMap(str);
		br.close();
			
	}

}
