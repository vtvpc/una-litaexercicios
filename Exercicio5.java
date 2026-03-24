

package com.mycompany.exercicio5;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (0 para sair): ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Nenhum número para calcular.");
        } else {
            int maior = numero;
            int menor = numero;

            while (numero != 0) {   
                
                if (numero > maior) {
                    maior = numero;
                }
                
                if (numero < menor) {
                    menor = numero;
                }
                
                System.out.print("Digite um número (0 para sair): ");
                numero = scanner.nextInt();
            }
            
            System.out.println("Maior número digitado: " + maior);
            System.out.println("Menor número digitado: " + menor);
        }
    }
}
