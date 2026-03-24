

package com.mycompany.exercicio3;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CALCULADORA ---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha um numero de 1 a 4.");
        int opcao = sc.nextInt();
        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.println("-------------------");
        
        switch (opcao) {
            case 1:
                System.out.println("Resultado da Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    System.out.println("Resultado da Divisão: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Escolha um número de 1 a 4.");
                break;
        }
    }
}
