import static java.lang.System.out;
import java.util.*;

public class A996{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int input = in.nextInt();
	int [] l = new int[] {1,5,10,20,100};
	int count = 0;
	while(input>0){
		if(input%100 ==0){
			input = input-100;
			count++;
		}else if(input%20 == 0){
			input = input-20;
			count++;
		}else if(input%10==0){
			input = input-10;
			count++;
		}else if(input%5==0){
			input = input-5;
			count++;
		}else{
			input = input-1;
			count++;
		}
	}
	out.println(count);

}

}
