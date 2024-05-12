
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numb1;
        int numb2;

        System.out.println("-------------------------------------------");

        System.out.println("Vamos trabalhar com 2 valores para saber o número de interações entre eles.");
        System.out.println(" ");

        System.out.println("Para começarmos, digite o primeiro número: ");
        numb1 = sc.nextInt();

        System.out.println("Agora, digite o segundo número: ");
        numb2 = sc.nextInt();

        System.out.println("-------------------------------------------");

        try {
            contar(numb1, numb2);

        } catch (ParametrosException e) {

            System.out.println("!!! ERRO !!!");
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int parametroA, int parametroB) throws ParametrosException {

            if (parametroA >= parametroB) {
                throw new ParametrosException();

            } else {
                int diferenca = parametroA - parametroB;

                for (int i = 1; i <= diferenca; ++i) {
                    System.out.println(i + "° interação: " + i);
                }
            }
    }

    public static int ler(Scanner scanner) {

        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro:");
            }
        }
    }
}