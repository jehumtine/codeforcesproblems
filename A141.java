import static java.lang.System.out;
import java.util.*;


public class A141{

public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] freq = new int[26];
		String stringA = in.next().trim();
		for(int i=0; i<stringA.length();i++){
			freq[stringA.charAt(i)-'A']++;
		}
		String stringB = in.next().trim();
		for(int i=0; i<stringB.length();i++){
			freq[stringB.charAt(i)-'A']++;
		}
		String stringC = in.next().trim();
		for(int i=0; i<stringC.length();i++){
			freq[stringC.charAt(i)-'A']--;
		}
		for(int i=0;i<freq.length;i++){
			if(freq[i]!=0){
				out.println("NO");
				return;
			}
		}
		out.println("YES");
}
		
}
