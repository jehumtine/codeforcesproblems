import static java.lang.System.out;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class A469{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		Set<Integer> s = new HashSet();
		for(int i =0; i<p;i++){
			int d = in.nextInt();
			s.add(d);
		}
		int q = in.nextInt();
		for(int i =0; i<q;i++){
			int d = in.nextInt();
			s.add(d);
		}
		if(s.size()==n){
			out.println("I become the guy.");
		}
		else{
			out.println("Oh, my keyboard!");
		}
		
	
	
	}

}
