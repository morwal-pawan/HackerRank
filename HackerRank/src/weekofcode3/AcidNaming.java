package weekofcode3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AcidNaming {
    static String acidNaming(String acid_name) {
	String pre =  "hydro";
	String post = "ic";
	if(acid_name.regionMatches(0, pre, 0, 5)&&acid_name.endsWith(post)) return "non-metal acid";
	else if(acid_name.endsWith(post)) return "polyatomic acid";
	else return "not an acid";
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("src/files/AcidNaming.txt"));
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
