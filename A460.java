import static java.lang.System.out;
import java.util.*;

public class A460{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n= in.nextInt();
	int m= in.nextInt();
	if(n==m){
		out.println((n/m)+n);		
	}else if(n<m){
			out.println(n);
	}
	
	else{
	
	out.println(((n+m)/m)+n);}
}


}
