

package com.mycompany.exercicio10;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        
        do {
            System.out.print("Digite um número inteiro : ");
            n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("O número precisa ser maior que zero!");
            }
        } while (n <= 0);

        int soma = 0;

        System.out.println("--- SAÍDA ---");

        
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " "); 
            soma += i;                
        }

        
        System.out.println("\nSoma = " + soma);
    }
}
