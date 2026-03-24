

package com.mycompany.exercicio8;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        System.out.println("Você precisará digitar 10 números inteiros.\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();


            if (numero > 0) {
                positivos++; 
            } else if (numero < 0) {
                negativos++; 
            } else {
                zeros++;   
            }
        }


        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Números Positivos: " + positivos);
        System.out.println("Números Negativos: " + negativos);
        System.out.println("Quantidade de Zeros: " + zeros);
    
    }
}
