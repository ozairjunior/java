import java.util.Scanner;

public class ImpaPar {

	public static void main(String[] args) {
		
		int contagem = 10; int numeros = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\ninforme 10 numeros");
		while(contagem > 0){ 
			
			numeros = leitor.nextInt();
			contagem --;
			
			if(numeros < 0) {
				System.out.println("ERRO: numero invalido, tente novamente");
				break;
			}else if(numeros%2 == 0){
				System.out.println("este numero e par");
			}else {
				System.out.println("este numero e impar");				
			}
		}
	}

}
