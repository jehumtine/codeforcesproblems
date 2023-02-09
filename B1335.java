import static java.lang.System.out;
import java.util.*;

public class B1335{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while(t-->0){
	int n = in.nextInt();	int a = in.nextInt(); 
	int b = in.nextInt();
	for(int i =0;i<n;i++){
		out.print((char)( 'a'+i%b));
	}
	out.println();
	}
	 
	
}

}
