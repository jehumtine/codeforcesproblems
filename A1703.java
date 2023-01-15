import static java.lang.System.out;
import java.util.Scanner;

public class A1703{

	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] l = new String[n];
		for(int i =0; i< n; i++){
			String a = in.next();
			l[i]= a;		
		}
		for(int i =0; i<n;i++){
			if((l[i].toLowerCase()).equals("yes")){
				out.println("YES");
			}
			else{
				out.println("NO");
			} 
		
		}
		
	}

}
