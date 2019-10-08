import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {

		String nome = "";

		while (true) {

			Scanner leitor = new Scanner(System.in);

			System.out.println("Qual seu nome?");
			nome = leitor.nextLine();
			if (nome.equals("fim"))
				break;
		
			System.out.println("Digite aqui o valor do seu salário: ");
			double salario = leitor.nextInt();
			
			if(salario <=500 && salario >=0) {
				System.out.println(nome + ", seu novo salario é de: " + (salario += salario * 0.2));
			}else {
				System.out.println(nome + ", Voce nao tem aumento");
			}

		}
	}

}
