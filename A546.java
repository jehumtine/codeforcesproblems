import static java.lang.System.out;
import java.util.Scanner;


public class A546{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	
	int k = in.nextInt();
	int n = in.nextInt();
	int w = in.nextInt();
	int cost=0;
	for(int i=1;i<=w; i++){
		cost =cost+(k *i);
	}
	if(n>=cost){
		out.println(0);
	}else{
	int borrow = Math.abs(n-cost);
	out.println(borrow);
	}

}

}
