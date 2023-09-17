package Lista_de_Exercícios2;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um Numero: ");
		
		int numero = scanner.nextInt();
		
		scanner.close();
		
		int resultado;
		
		if(numero >0) {
			resultado = numero *2;
		}else {
			resultado = numero *3;
		}
		
		System.out.println("O resultado é: "+resultado);
		
		
	}
	
	
	
}
