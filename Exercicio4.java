
package com.mycompany.exercicio4;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 100: ");
        double nota = sc.nextDouble();

        
        while (nota < 0 || nota > 100) {
            System.out.println("Nota inválida!");
            System.out.print("Digite uma nota válida (entre 0 e 100): ");
            nota = sc.nextDouble();
        }

        System.out.println("Nota: " + nota);
    }
}
