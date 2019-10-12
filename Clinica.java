import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {

	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<Paciente>();
        
        int auxilixar = 0;
        int auxiliara2 = 0;
        int total = 0;
        int numeroHomens = 0;
        int totalMulherAlturaPeso = 0;
        int idadePessoas = 0;
        int maiorIdade = 0;
        double menorAltura = 0;
        double idadeHomem = 0;
        String pacienteVelho = null;
        String mulherBaixa = null;
        String nome = "";

        while(true){
        	
            Paciente paciente = new Paciente();
            pacientes.add(paciente);

            System.out.println("Nome: ");
            nome = leitor.nextLine();
            if(nome.equals("fim")) break;
            paciente.setNome(nome);
            total++;

            System.out.println("Idade: ");
            paciente.setIdade(leitor.nextInt());
            leitor.nextLine();

            System.out.println("Sexo (M/F): ");
            paciente.setSexo(leitor.nextLine());

            System.out.println("Altura: ");
            paciente.setAltura(leitor.nextDouble());
            leitor.nextLine();

            System.out.println("Peso: ");
            paciente.setPeso(leitor.nextDouble());
            leitor.nextLine();
        }

        for (Paciente paciente: pacientes) {
         
            String sexo = String.valueOf(paciente.getSexo());

            if(paciente.getIdade() >= 18 && paciente.getIdade() <= 25){
                idadePessoas++;
            }
            if(sexo.equals("M")){
                if(auxiliara2 == 0){
                    maiorIdade = paciente.getIdade();
                    pacienteVelho = paciente.getNome();
                    auxiliara2++;
                }else if(paciente.getIdade() > maiorIdade){
                    maiorIdade = paciente.getIdade();
                    pacienteVelho = paciente.getNome();
                }
                idadeHomem += paciente.getIdade();
                numeroHomens++;
            }else if(sexo.equals("F")){

                if(auxilixar == 0){
                    menorAltura = paciente.getAltura();
                    mulherBaixa = paciente.getNome();
                    auxilixar++;
                }else if (paciente.getAltura() < menorAltura){
                    menorAltura = paciente.getAltura();
                    mulherBaixa = paciente.getNome();
                }
                if((paciente.getAltura() >= 1.6 && paciente.getAltura() <= 1.7) && paciente.getPeso() > 70){
                    totalMulherAlturaPeso++;
                }
            }
        }
        System.out.println("Total de pacientes: " + total);
        System.out.println("Idade media dos homens: " + (idadeHomem / numeroHomens));
        System.out.println("Total de mulheres(altura e peso): " + totalMulherAlturaPeso);
        System.out.println("Total de pessoas com idade entre 18 e 25: " + idadePessoas);
        System.out.println(pacienteVelho + " é o paciente mais velho.");
        System.out.println(mulherBaixa + " é a mulher mais baixa.");	
	}

}
