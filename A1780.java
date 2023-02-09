import static java.lang.System.out;
import java.util.*;

public class A1780{

public static void main(String args[]){

	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while(t-->0){
		int n = in.nextInt();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		for(int i =0;i<n;i++){
			int input = in.nextInt();
			if(input%2 ==0){
				even.add(i+1);
			}else {
				odd.add(i+1);
			}
		}
		if(odd.size()>=3){
			out.println("YES");
			out.print(odd.get(0)+" ");out.print(odd.get(1)+" ");out.print(odd.get(2)+"\n");
		}else if(odd.size()>=1 && even.size()>=2){
                        out.println("YES");
                        out.print(odd.get(0)+" ");out.print(even.get(0)+" ");out.print(even.get(1)+"\n");
		}else {
			out.print("NO\n");
		}
	
}
	}
}


