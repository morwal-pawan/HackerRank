package weekofcode3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class RevisedRussianRoulette {
    static int[] revisedRussianRoulette(int[] doors) {
       int[] result = {0,0};
       boolean min = false;
       for(int index=0; index <doors.length; ++index)
	if (doors[index] == 1) {
	    if (index < doors.length - 1 && doors[index + 1] == 1) {
		{
		    index++;
		    min = true;
		}
	    }
	    result[0]++;
	    if (min) {
		result[1] += 2;
		min = false;
	    } else
		result[1]++;
	}
       return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("src/files/RevisedRussianRoulette.txt"));
        int n = in.nextInt();
        int[] doors = new int[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
