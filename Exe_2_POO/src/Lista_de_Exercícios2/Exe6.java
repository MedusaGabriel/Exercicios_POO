package Lista_de_Exercícios2;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor booleano (true/false): ");
        boolean valor1 = scanner.nextBoolean();

        System.out.print("Digite o segundo valor booleano (true/false): ");
        boolean valor2 = scanner.nextBoolean();

        scanner.close();

        if (valor1 && valor2) {
            System.out.println("Ambos os valores são VERDADEIROS.");
        } else {
            System.out.println("Pelo menos um dos valores é FALSO.");
        }
    }
}