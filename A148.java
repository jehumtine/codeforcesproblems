import static java.lang.System.out;
import java.util.Scanner;

public class A148{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int k = in.nextInt(); int l = in.nextInt();
		int m = in.nextInt(); int n = in.nextInt();
		int d = in.nextInt();
		int count = 0;
		for(int i =1; i<=d;i++){
			if(i%k==0 || i%l==0 || i%m==0 ||i%n==0 ){
				count++;
			}
		
		}
		out.println(count);
		in.close();
	
	}


}
