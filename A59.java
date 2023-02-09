import static java.lang.System.out;
import java.util.Scanner;
import java.util.List;

public class A59{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	String input = in.next();
	int upperCaseCount = 0;
	int lowerCaseCount =0;
	char[] l= input.toCharArray();
	for(int i=0; i<l.length; i++){
		if(Character.isUpperCase(l[i])){
			upperCaseCount++;
		}else{
			lowerCaseCount++;
		}
	}
	if(upperCaseCount>lowerCaseCount){
		out.println(input.toUpperCase());
	}else out.println(input.toLowerCase());

}

}
