import java.util.Scanner;

public class PostoGasolina {

	public static void main(String[] args) {
		
		double litros;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("quantos listros de gasolina deseja colocar?");
		
		litros = leitor.nextDouble();
		
		System.out.printf("Voce gastou %.2f reais", (litros *= 2.50)	+ 6);
		
		
	}

}
