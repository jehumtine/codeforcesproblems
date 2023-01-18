import static java.lang.System.out;
import java.util.Scanner;

public class A737{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	String result = in.next();
	char[] l = result.toCharArray();
	int countA=0;
	int countD=0;
	for(int i =0; i<n ; i++){
		if(l[i]=='A'){
			countA++;
		}
		else{
			countD++;
		}
	
	}
	if(countA> countD){
		out.println("Anton");	
	}else if(countD>countA){
		out.println("Danik");
	}else{
		out.println("Friendship");
	}

}

}
