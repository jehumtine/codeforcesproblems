import static java.lang.System.out;
import java.util.Scanner;

public class A281{

	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.next();
		String firstLetter = input.substring(0,1);
		firstLetter = firstLetter.toUpperCase();
		String lastPart = input.substring(1);
		input =firstLetter.concat(lastPart);
		out.println(input);
	}


}
