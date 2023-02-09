import static java.lang.System.out;
import java.util.*;

public class A520{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashSet<Character> vals = new HashSet<>();
		char[] chars = in.next().toLowerCase().toCharArray();
		Character[] charArrBoxed = new String(chars).chars().mapToObj(c->(char)c).toArray(Character[]::new);
		Collections.addAll(vals,charArrBoxed);	
		if(vals.size()==26){
			out.println("YES");
		}else	out.println("NO");
		
	
	}

}
