package Lista_de_Exercícios2;

import java.util.Scanner;

public class Exe7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        scanner.close();

        int resultado;

        if (numero % 2 == 0) {
            resultado = numero + 5; // Soma 5 se for par
        } else {
            resultado = numero + 8; // Soma 8 se for ímpar
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}