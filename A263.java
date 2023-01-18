import static java.lang.System.out;
import java.util.Scanner;

public class A263{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int i,col = 0;
	
	for(i =1; i<=5; i++){
		String s = in.nextLine().replace(" ","");
		if(s.contains("1")){
			col = s.indexOf("1")+1;
			break;
		}
	}
	out.println(Math.abs(3-i)+ Math.abs(3-col)); 
	
}

}
