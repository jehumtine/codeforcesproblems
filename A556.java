import static java.lang.System.out;
import java.util.*;

public class A556{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	char[] l = in.next().toCharArray();
	int c1 =0;	int c0 =0;
	for(int i =0; i<n; i++){
		if(l[i]=='0'){
			c0++;
		}else c1++;
	}
	out.println(Math.abs(c1-c0));
}

}
