import static java.lang.System.out;
import java.util.*;

public class A1352{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Integer t = in.nextInt();
		while(t-->0){
			ArrayList<Integer> l = new ArrayList<>();
			Integer n = in.nextInt();
			int pow = 1;
			while(n>0){
				if(n%10>0){
					l.add((n%10)*pow);
				}
				n/= 10;
				pow*=10;
			}
			out.println(l.size());
			for(Integer ans: l){
				out.print(ans+ " ");
			}
		
		}
	
	}

}
