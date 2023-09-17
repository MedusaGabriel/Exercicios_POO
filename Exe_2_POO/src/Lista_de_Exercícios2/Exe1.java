package Lista_de_Exercícios2;

import java.util.Scanner;

public class Exe1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Escreva Valores de A: ");
		int A = scanner.nextInt();
		System.out.println("Escreva Valores de B: ");
		int B = scanner.nextInt();
		System.out.println("Escreva Valores de C: ");
		int C = scanner.nextInt();
		
		scanner.close();
		if(A+B<C) {
			System.out.println("A soma de A+B é menor que C");
		}else
			System.out.println("A soma de A+B não é menor que C");
	}

}
