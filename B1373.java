import static java.lang.System.out;
import java.util.*;


public class B1373{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	for(int i =0; i<t; i++){
		boolean canWin = false;
		char[] l = in.next().toCharArray();
		int c1=0;
		int c0=0;
		for(int j =0; j<l.length;j++){
			if(l[j]=='0'){
				c0++;
			}else c1++;				
		}
		if(Math.min(c1, c0)%2 ==0) out.println("NET");
		else out.println("DA");
	}

}

}
