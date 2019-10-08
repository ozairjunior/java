import java.util.Scanner;

public class PercentualSalario {

	public static void main(String[] args) {
		
		double salario; double aumento;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe seu salario");
		salario = leitor.nextDouble();
		
		System.out.println("informe a % do reajuste");
		aumento = leitor.nextDouble();
		
		System.out.printf("seu novo salario e de: %.2f ",  salario + (salario * (aumento/100)));

		
	}

}
