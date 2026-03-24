

package com.mycompany.exercicio6;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00;
        int opcao;
        do{
        System.out.println("--CAIXA ELETRÔNICO--");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    
                  
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("O valor de depósito deve ser maior que zero.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                   
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque; 
                        System.out.println("Saque realizado com sucesso!");
                    } else if (saque <= 0) {
                        System.out.println("O valor do saque deve ser maior que zero.");
                    } else {
                        System.out.println("Saldo insuficiente para este saque.");
                    }
                    break;

                case 3:
                    // Usando printf para formatar com duas casas decimais
                    System.out.println("Saldo atual: R$"+ saldo);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    System.out.println("Seu saldo final é: R$"+ saldo);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }   while (opcao != 4);
    }
}
