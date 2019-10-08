import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		int i;
		int j;
		
		Scanner leitor = new Scanner(System.in);

		j = leitor.nextInt();
		
		for(i=0; i<11; i++) {
			System.out.printf("%d x %d =%d\n", i, j, j*i);
			//for(j=j; j<j; j++) {
			//}
		}
	}
}
