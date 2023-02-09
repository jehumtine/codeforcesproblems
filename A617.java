import static java.lang.System.out;
import java.util.Scanner;

public class A617{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	int[] l = new int[] {5,4,3,2,1};
	int count =0;
	int i =0;

	while(i<5){
		if(x>=l[i]){
			count = x/l[i]+ count;
			x = x%l[i];
		}
		i++;
	}
	out.println(count);

}

}
