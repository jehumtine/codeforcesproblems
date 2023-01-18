import static java.lang.System.out;
import java.util.Scanner;

public class A791{

public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int count =0;
	
	while(a<=b){
		a = a*3;
		b= b*2;
		count++;
	}
	out.println(count);
}

}
