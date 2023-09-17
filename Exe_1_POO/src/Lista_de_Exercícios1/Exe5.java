package Lista_de_Exercícios1;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        scanner.close();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}