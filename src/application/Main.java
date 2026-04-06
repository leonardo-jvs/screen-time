package application;

import model.Aplicativo;
import service.Relatorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Aplicativo> listaApps = new ArrayList<>();
        Relatorio relatorio = new Relatorio();
        int opcao;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Adicionar uso de app");
            System.out.println("2 - Ver relatório");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do app: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o tempo de uso (minutos): ");
                    int tempo = sc.nextInt();
                    sc.nextLine();

                    listaApps.add(new Aplicativo(nome, tempo));
                    System.out.println("App adicionado com sucesso!");
                    break;

                case 2:
                    relatorio.exibirRelatorio(listaApps);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
