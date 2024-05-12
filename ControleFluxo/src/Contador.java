import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int numb1, numb2;

        System.out.println("-----------------------");
        System.out.println("BEM VINDO AO CONTADOR!");
        System.out.println("-----------------------");

        System.out.print("Digite o primeiro número:");
        numb1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numb2 = sc.nextInt();

        System.out.println("-----------------------");
        System.out.println("INICIANDO CONTAGEM...");
        System.out.println("-----------------------");

        try {
            contar(numb1, numb2);

        } catch (ParametrosException e) { 
            System.out.println("-------------------------------");
            System.out.println("!!! Error !!!");
            System.out.println(e.getMessage());

        }

        System.out.println("-----------------------");
        System.out.println("FIM.");
        System.out.println("-----------------------");
    }

    static void contar(int numb1, int numb2) throws ParametrosException {

        if (numb1 > numb2) {
            throw new ParametrosException("O segundo número deve ser maior que o primeiro");

        } for(int i = numb1; i <= numb2; i++) {
            System.out.println("Número: " + i);

        }
    }
}