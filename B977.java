import static java.lang.System.out;
import java.util.*;


public class B977{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int length = in.nextInt();
	char[] l= in.next().toCharArray();
	String[] bunch = new String[length-1];
	for(int i=0; i<l.length-1;i++){
		String s = "";
		s=s+l[i]+l[i+1];
		bunch[i] = s;
	}
	int maxCount=0;
	String mostFrequent ="";
	int newLength = bunch.length-1;
	if(bunch.length ==1){
		out.println(bunch[0]);
	}else{
	for(int i =0; i<newLength; i++){

		int count =0;
		for(int j=0;j<=newLength; j++){
//		out.println("is "+bunch[i]+ " equals"+ bunch[j] );
			if(bunch[i].equals(bunch[j])){
				count++;

			}
		}

		if(count >maxCount){
			maxCount =count;
			mostFrequent = bunch[i];
		}
	
	}
	out.println(mostFrequent);
	}
}

}
