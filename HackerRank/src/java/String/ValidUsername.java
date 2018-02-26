package java.String;

import java.util.Scanner;

public class ValidUsername {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
//            String pattern = "^[a-zA-Z][a-zA-Z0-9/_]{7,29}$";
            if (userName.matches("^[a-zA-Z][a-zA-Z0-9/_]{7,29}$")) {
		System.out.println("Valid");
	    } else {
		System.out.println("Invalid");
	    }           
        }
    }
}


