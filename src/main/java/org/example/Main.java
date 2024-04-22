package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seja bem-vindo!!");
        int tipo;
        do {
            System.out.println("Digite o que você está buscando:");
            System.out.println("1 - Personagens");
            System.out.println("2 - Locais");
            System.out.println("0 - Sair");

            tipo = scanner.nextInt();

            switch (tipo) {
                case 1:
                    System.out.println("Você escolheu Personagens");
                    buscarPersonagem();
                    break;
                case 2:
                    System.out.println("Você escolheu Locais");
                    break;
                case 0:
                    System.out.println("Você escolheu encerrar a aplicação");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (tipo < 0 || tipo > 2); // Continua pedindo opções até que o usuário escolha sair
    }

    public static void buscarPersonagem() {
        int id;
        System.out.println("Digite o ID do personagem que você está buscando:");
        id = scanner.nextInt();
        // Adicione sua lógica para buscar o personagem com o ID fornecido

        fomatarPersonagem();
    }

    public static void fomatarPersonagem(){
        System.out.println("fORMATOU PERSONAGEM");
    }
}
