import static java.lang.System.out;
import java.util.Scanner;

public class rando{

public static void main(String argsp[]){
	Scanner in = new Scanner(System.in);
	Integer n = in.nextInt();
	while(n!=1){
	if(n%2 ==0){
		n= n/2;
	}else {
		n = n*3;
		n= n+1;
	}
	out.println(n);
	}
	out.println(n);
}

}
