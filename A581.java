import static java.lang.System.out;
import java.util.*;


public class A581{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();int b = in.nextInt();
	int i =0;
	int countOfSameSocks =Math.min(a,b);
	i = Math.max(Math.abs(countOfSameSocks-a),Math.abs(countOfSameSocks-b));
	out.print(countOfSameSocks+ " ");out.print(i/2);

}
}
