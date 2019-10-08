import java.util.Scanner;

public class Prefeitura {

	public static void main(String[] args) {
		double salario, prestacao;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe seu salario bruto: ");
		salario = leitor.nextDouble();
		System.out.println("informe o valor das prestações: ");
		prestacao = leitor.nextDouble();
		
		if(prestacao <= salario * 0.3) {
			System.out.println("O emprestimo foi concedido");
		}else {
			System.out.println("O emprestimo nao foi concedido");
		}
		
	}

}
