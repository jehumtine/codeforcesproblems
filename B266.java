import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class B266{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n = in.nextInt(); int t = in.nextInt();
	char[] l = in.next().toCharArray();
//	ArrayList<Character> l= new ArrayList<Character>(tem);
	boolean switched = false;
	for(int i =0; i<t; i++){
		for(int j =0; j<n-1;){
//			out.println(l[j]);
			if(l[j]=='B' && l[j+1]=='G'){
			char temp = l[j];
			l[j] = l[j+1];
			l[j+1]= temp;
			j+=2;	
			}else{j+=1;}
		}
	
	}
	for(int i=0;i<n;i++){
		out.print(l[i]);
	}

}

}
