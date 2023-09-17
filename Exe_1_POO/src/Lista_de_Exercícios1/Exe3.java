package Lista_de_Exercícios1;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        saldo = saldo * 1.01;

        System.out.println("Saldo com reajuste: " + saldo);
    }
}
