import static java.lang.System.out;
import java.util.Scanner;

public class A266{

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] l = in.next().toCharArray();
		int countRed, countBlue,countGreen, count =0;
		for(int i =0; i<n-1;i++){
			if(l[i]==l[i+1]){
				count++;
			}else{}
		
		}
		out.println(count);
		
	
	}

}

/*if(l[i]=="R"){
				countRed++;
			}
			else if(l[i]=="B"){
				countBlue++;
			}
			else{
				countGreen++;
			}*/
