import static java.lang.System.out;
import java.util.*;

public class A1283{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int h = in.nextInt();
			int m = in.nextInt();
			h*=60;
			int totalmin= h+m;
			out.println(1440-totalmin);
		}
	
	}


}
