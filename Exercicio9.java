
package com.mycompany.exercicio9;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro (N): ");
        int n = scanner.nextInt();

        
        int soma = 0;

        
        for (int i = 1; i <= n; i++) {
            soma += i; 
        }

        
        System.out.println("A soma de 1 até " + n + " é: " + soma);
    }
}
