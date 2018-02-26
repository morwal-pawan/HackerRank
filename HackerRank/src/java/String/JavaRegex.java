package java.String;

import java.util.Scanner;

class MyRegex {
    static final String zeroTo255 = "(\\d{1,2}|(0|1)\\d{1,2}|2[0-4]\\d|25[0-5])";
    static final String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

}

class JavaRegex {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
	    String IP = in.next();
	    System.out.println(IP.matches(new MyRegex().pattern));
	}

    }
}
