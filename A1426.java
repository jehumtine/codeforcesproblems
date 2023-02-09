import static java.lang.System.out;
import java.util.*;

public class A1426{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); 
		while(t-->0){
			int n = in.nextInt(); 
			int x = in.nextInt(); 
			if (n<=2) out.println(1);
			else out.println(((n-3)/x)+2);
		
		}
		
		
	}

}
