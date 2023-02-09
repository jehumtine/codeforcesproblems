import static java.lang.System.out;
import java.util.*;

public class A1294{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int n = in.nextInt();
			int max = a+b+c+n;
			if(max%3 ==0 && a<=max/3 && b<=max/3 && c<=max/3){
				out.println("YES");
			}else{
				out.println	("NO");
			}
				
			
		}
	
	}

}
