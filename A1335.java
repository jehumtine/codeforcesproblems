import static java.lang.System.out;
import java.util.*;

public class A1335{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while(t-->0){
		int n = in.nextInt();
		int result = n/2;
		if(n%2 ==0){
			out.println(result-1);
		}else{
			out.println(result);
		}
			
	}

}

}
