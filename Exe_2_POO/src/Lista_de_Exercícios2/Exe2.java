package Lista_de_Exercícios2;

import java.util.Scanner;

public class Exe2 {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite o estado civil (SOLTEIRO, CASADO, DIVORCIADO, VIUVO): ");
        String estadoCivil = scanner.next();
        if (sexo == 'F' && estadoCivil.equalsIgnoreCase("CASADO")) {
            System.out.print("Digite o tempo de casada (anos): ");
            int tempoCasada = scanner.nextInt();
            System.out.println("A pessoa chamada " + nome + " está casada há " + tempoCasada + " anos.");
        } else {
            System.out.println("A pessoa chamada " + nome + " não está casada.");
        }

        scanner.close();
    }
		

	}
	
	
	
