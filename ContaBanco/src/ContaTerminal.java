import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        String sobrenome;
        int agencia;
        int numero;
        double saldo = 5600.50;
        String resultado;

        System.out.println("Olá, sejá bem vindo!");
        System.out.println("----------------------------");

        System.out.print("Por favor, insira o seu nome: ");
        nome = sc.next();
        System.out.print("Agora, digite seu sobrenome: ");
        sobrenome = sc.next();
        System.out.println("----------------------------");

        System.out.println("Insira o número da sua agência (sem traços): ");
        agencia = sc.nextInt();
        System.out.println("Insira o número do cartão (sem traços): ");
        numero = sc.nextInt();
        System.out.println("----------------------------");

        System.out.println("Obrigado por criar uma conta em nosso banco, " + nome + "!");
        System.out.println("Segue abaixo dados que obtive sobre você:");
        System.out.println("Nome completo: ".concat(nome).concat(" ").concat(sobrenome));
        System.out.println("Agência: " + agencia);
        System.out.println("Número do cartão: " + numero);
        System.out.println("----------------------------");

        System.out.println("Deseja verificar seu saldo disponível?");
        resultado = sc.next();
        char resposta = resultado.toLowerCase().charAt(0);
        if (resposta == 's') {
            System.out.println("----------------------------");
            System.out.println("Saldo disponível: " + saldo + "$");
            System.out.println("----------------------------");
        }
        else if (resposta == 'n') {
            System.out.println("----------------------------");
        }
        sc.close();
    }
}