import static java.lang.System.out;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class A236{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.next();
		Set<Character> j = new HashSet<>();
		for(int i=0; i< input.length();i++){
			j.add(input.charAt(i));
		}
		
		int numberOfLetters = j.size();
		if(numberOfLetters%2 ==0){
			out.println("CHAT WITH HER!");
		}
		else{
			out.println("IGNORE HIM!");
		}
	}

}
