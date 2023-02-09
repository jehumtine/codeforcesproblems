import static java.lang.System.out;
import java.util.Scanner;
import java.util.*;

public class MissingNumber{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	Long n = in.nextLong();
	ArrayList<Long> l = new ArrayList<Long>();
	for(int i=1; i<n;i++){
		Long a = in.nextLong();
		l.add(a);	
	}
	Collections.sort(l);
	int j =1;
	for(int i =0;i<n;i++){

		if( j!=l.get(i)){
			out.println(j);
			break;
		}
		j++;
	}

}

}
