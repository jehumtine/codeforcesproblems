import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class A707{
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
        
		for(int i =0; i<(r*c);i++){
			String a = in.next();
			if(a.charAt(0)=='C'||a.charAt(0)=='Y'||a.charAt(0)=='M'){
				out.println("#Color");
				System.exit(0);
			}
		}
		
		 out.println("#Black&White");
	}


}
