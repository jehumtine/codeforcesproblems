import static java.lang.System.out;
import java.util.*;
public class game{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int testCases = in.nextInt();
	int[] output = new int[testCases];
	int k=0;
	for(int i =0; i<testCases;i++){
		int nom = in.nextInt();
		int[] lom = new int[nom];
		int som = 0;
		for(int j=0;j<nom;j++){
			int temp = in.nextInt();
			som +=temp;
			lom[j] = temp;
		}

		while(som >0){
			som= som-2;
			if(som>0){
				som = som-1;
			}
			/*for(; k<lom.length; k++){
				if(lom[k]>0){
				lom[k] = lom[k]-1;
				som= som-1;
				}
			}*/k++;
		}
		

		output[i] =k;
	}
	out.println(k);
}

}
