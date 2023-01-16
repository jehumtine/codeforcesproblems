import static java.lang.System.out;
import java.util.Scanner;

public class A977{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		for(int i =0; i<k;i++){
			if(n%10 ==0){
			n = n/10;
			}else{
				n = n-1;			
			}		
		}
		out.println(n);
	}

}
