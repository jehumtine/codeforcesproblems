import static java.lang.System.out;
import java.util.Scanner;

public class A110{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	char[] n = in.next().toCharArray();
	int num =0;
	for(int i=0; i<n.length;i++){
		if(n[i]=='4' || n[i]=='7'){
			num++;
		}
	}
	if(num==4 || num==7){
			out.println("YES");
	}else out.println("NO");
	
	
	
//	Integer size =(int) (Math.log10(n) + 1);	
/*	if(size.equals(7) || size.equals(4) || size%7 ==0|| size%4 == 0){
		out.println("YES");
	}else out.println("NO");
*/
}

}
