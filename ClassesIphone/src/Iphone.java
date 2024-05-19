import java.util.Scanner;

public class Iphone implements Telefone, Musica, Internet {

    // Telefone
    public void ligar() {
        System.out.println("LIGANDO...");
    }
    public void atender() {
        System.out.println("!! ATENDENDO !!");
    }
    public void correioVoz() {
        System.out.println("CORREIO DE VOZ INICIANDO...");
    }

    // Música
    public void tocar() {
        System.out.println("!!! REPRODUZINDO MÚSICA !!!");
    }
    public void pausar() {
        System.out.println("!! PAUSANDO !!");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA...");
    }

    // Internet
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA...");
    }
    public void novaAba() {
        System.out.println("ADICIONANDO NOVA ABA...");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA...");
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;

        System.out.println("----------");
        System.out.println("BEM VINDO!");
        System.out.println("----------");

        do {
            System.out.println("MENU:");
            System.out.println( "1. TELEFONE \n"
                    + "2. MÚSICA \n"
                    + "3. INTERNET \n"
                    + "0. ENCERRAR \n");
            System.out.print("POR FAVOR, DIGITE UMA DAS OPÇÕES ACIMA: ");
            opcao = sc.nextInt();
            System.out.println("---------------");

            switch (opcao) {
                case 1:
                    System.out.print("1. TOCAR \n" +
                            "2. PAUSAR \n"
                            + "3. SELECIONAR MÚSICA \n"
                            + "DIGITE A OPÇÃO ESCOLHIDA: ");
                    opcao = sc.nextInt();
                    System.out.println("---------------");

                    if (opcao == 1) {
                        iphone.ligar();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("LIGAÇÃO CONCLUÍDA COM SUCESSO.");
                        System.out.println("---------------");

                    } else if (opcao == 2) {
                        iphone.atender();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("CHAMADA DE VOZ ATENDIDA.");
                        System.out.println("---------------");

                    } else if (opcao == 3) {
                        iphone.correioVoz();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("CORREIO DE VOZ ENCERRADO.");
                        System.out.println("---------------");
                    } else {
                        System.out.print("!! ERROR !! \n"
                                + "DIGITE UM NÚMERO ENTRE 1 E 3");
                        Thread.sleep(1000);
                    }
                    break;

                case 2:
                    System.out.print("1. TOCAR \n" +
                            "2. PAUSAR \n"
                            + "3. SELECIONAR MÚSICA \n"
                            + "DIGITE A OPÇÃO ESCOLHIDA: ");
                    opcao = sc.nextInt();
                    System.out.println("---------------");

                    if (opcao == 1) {
                        iphone.tocar();
                        Thread.sleep(1000);
                        System.out.println("---------------");

                    } else if (opcao == 2) {
                        iphone.pausar();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("MÚSICA PAUSADA.");
                        System.out.println("---------------");

                    } else if (opcao == 3) {
                        iphone.selecionarMusica();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("MÚSICA SELECIONADA.");
                        System.out.println("---------------");
                    } else {
                        System.out.print("!! ERROR !! \n"
                                + "DIGITE UM NÚMERO ENTRE 1 E 3");
                        Thread.sleep(1000);
                    }
                    break;

                case 3:
                    System.out.print("1. PÁGINA INICIAL \n" +
                            "2. NOVA ABA \n"
                            + "3. ATUALIZAR PÁGINA \n"
                            + "DIGITE A OPÇÃO ESCOLHIDA: ");
                    opcao = sc.nextInt();
                    System.out.println("---------------");

                    if (opcao == 1) {
                        iphone.exibirPagina();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("PÁGINA EXIBIDA.");
                        System.out.println("---------------");

                    } else if (opcao == 2) {
                        iphone.pausar();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("NOVA ABA ADICIONADA.");
                        System.out.println("---------------");

                    } else if (opcao == 3) {
                        iphone.selecionarMusica();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("PÁGINA ATUALIZADA.");
                        System.out.println("---------------");
                    } else {
                        System.out.print("!! ERROR !! \n"
                                + "DIGITE UM NÚMERO ENTRE 1 E 3");
                        Thread.sleep(1000);
                    }
                    break;

                case 0:
                    System.out.println("DESLIGANDO IPHONE...");
                    Thread.sleep(900);
                    System.out.println(" ");
                    System.out.println("!! IPHONE ENCERRADO !!");
                    System.out.println("---------------");
                    break;

                default:
                    System.out.print("!! ERROR !! \n"
                            + "DIGITE UM NÚMERO ENTRE 1 E 3");
                    Thread.sleep(1000);
                    System.out.println("---------------");
            }
        } while (opcao != 0);
        sc.close();
    }
}