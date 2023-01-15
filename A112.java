import static java.lang.System.out;
import java.util.Scanner;


public class A112{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		a=a.toLowerCase();b=b.toLowerCase();
		a.trim(); b.trim();
		if(a.compareTo(b)<0){
			out.println("-1");
		}
		else if(a.compareTo(b)>0){
			out.println("1");
		}
		else{
		out.println("0");
		}

	
	}

}
