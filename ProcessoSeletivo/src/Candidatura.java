import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Candidatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario;
        selecaoCandidatos();

        System.out.println("------------------");
        System.out.println("Bem vindo ao processo seletivo!");
        System.out.println("------------------");
        System.out.print("Por favor, nos diga qual a sua pretensão salarial: ");
        salario = sc.nextDouble();

    }

    static void selecaoCandidatos() {

        String[] candidatos = {"MARCIA", "WAGNER", "ERIKA", "MIGUEL", "SOPHIA", "RHAVI", "VIOLETTA", "HEITOR"}
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double pretensaoSalario = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou este valor de salário: " + pretensaoSalario);

            if(salarioBase >= pretensaoSalario) {
                candidatosSelecionados++;

                System.out.println("O candidatos " + candidato + " foi selecionado para a vaga!");
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {

        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void dadosCandidato(double pretensaoSalario) {

        double salarioBase = 2000.0;

        if(salarioBase > pretensaoSalario) {
            System.out.println("LIGAR PARA O CANDIDATO.");

        } else if(salarioBase == pretensaoSalario) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA.");

        } else {
            System.out.println("NO AGUARDE DE MAIS CANDIDATURAS.");

        }

    }
    
}