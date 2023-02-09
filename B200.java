import static java.lang.System.out;
import java.util.*;


public class B200{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		float sum =0;
		for(int i =0; i<n; i++){
			float temp = in.nextFloat();
			sum= sum+ temp;
		}
		float divisor = 100*n;
		float perce= sum/divisor;
		out.println(perce*100);
	
	}

}
