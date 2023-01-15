import static java.lang.System.out;
import java.util.Scanner;

public class A41{
	@Deprecated
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		String a = "";
		for(int i = s.length()-1; i>=0;i--){
			a+= s.charAt(i);
		}

		if(a.equals(t)){
			out.println("YES");
		}
		else{
			out.println("NO");
		}

	
	}

}
