package Lista_de_Exercícios2;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Digite o valor A: ");
		int A = scanner.nextInt();
		System.out.print("Digite o Valor B: ");
		int B = scanner.nextInt();
		
		int C;
		
		if (A == B) {
			C = A + B;
		} else {
			C = A * B;
		    System.out.print("O valor de C é: "+C);
		}
	
		}
}
