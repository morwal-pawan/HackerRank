package code.string;

public class WeightedUniformStrings {
	static final int ASSCI_SIZE =256;
	
	public static void sort3(int[] arr,int low, int high) {
		if(low >= high) return;
		
		int left = low,index = low ,right = high;
		int partion_element = arr[low];
		
		while(index <= right)
		{
			if   (arr[index] < partion_element) exchange(arr, left++,index++ );  // 3- partitioning
			else if(arr[index] > partion_element) exchange(arr, right--, index); // 3- partitioning
			else index++;														 // 3- partitioning
		}
		sort3(arr, low, left-1);
		sort3(arr, right+1, high);
		
	}
	private static void exchange(int arr[],int a  ,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	private static int[] countCharsWeigth(String str)
	{
		int countChars[] = new int[ASSCI_SIZE];
		for(int index = 0; index< str.length();index++)
			countChars[str.charAt(index)]++;
		
		int weights[] = new int[str.length()];
		
		for (int index = 0,weight_index = 0; index < ASSCI_SIZE && weight_index <str.length(); index++) {
			if(countChars[index]!=0)
			{
				int count = countChars[index];
				int j = 1;
				while( j <= count) {
					weights[weight_index] = (str.charAt(weight_index) + 1 - 'a')*j;
					j++; weight_index++;
				}
			}		
			
		}
		sort3(weights, 0, weights.length-1);
		return weights;
	}
	public static String indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return "YES";
        }
        return "NO";
    }
	


}
