package Lista_de_Exercícios1;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Porcentagem do IPI a ser acrescido: ");
        double ipi = scanner.nextDouble();

        System.out.print("Código da peça 1: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Valor unitário da peça 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade de peças 1: ");
        int quant1 = scanner.nextInt();

        System.out.print("Código da peça 2: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Valor unitário da peça 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade de peças 2: ");
        int quant2 = scanner.nextInt();

        scanner.close();

        double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.println("Valor total a ser pago: " + valorTotal);
    }
}
