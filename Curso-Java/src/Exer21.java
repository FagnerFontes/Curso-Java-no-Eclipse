

/*
	 Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao 
	 usuário o valor do saque e depois informar quantas notas de cada valor 
	 serão fornecidas. As notas disponíveis serão de 1,5,10, 50 e 100 reais. 
	 O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve
	 se preocupar com a quantidade de notas existentes na máqina. 
	 
	 * Ex. 1: Para sacar a quantia de 256, o programa fornece duas notas de 100, 
	 uma nota de 50, uma de 5 e uma nota de 1; 
	 
	 * Ex. 2: Para sacar a quantia de 399, o programa fornece três notas de 100, 
	 1 nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1; 
	   
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer21 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

		// Solicita o valor do saque ao usuário
		System.out.print("Digite o valor do saque(entre 10 e 600 reais): ");
		int valorSaque = porta.nextInt();

		// Verifica se o valor está dentro do intervalo permitido
		if (valorSaque < 10 || valorSaque > 1000) {
			System.out.println("Valor inválido. O valor deve estar entre 10 e 600 reais.");	
		}else {
			//Calcula a quantidade de notas necessárias
			int notas100 = valorSaque / 100; 
			valorSaque %= 100; 
			
			int notas50 = valorSaque /50; 
			valorSaque %=50;
			
			int notas10 = valorSaque /10;
			valorSaque %=10; 
			
			int notas5 = valorSaque /5; 
			valorSaque %=5;
			
			int notas1 = valorSaque; 
			
			//Exibe o resultado
			System.out.println("Notas fornecidas");
			if (notas100 > 0) System.out.println("Notas de 100: " + notas100);
            if (notas50 > 0) System.out.println("Notas de 50: " + notas50);
            if (notas10 > 0) System.out.println("Notas de 10: " + notas10);
            if (notas5 > 0) System.out.println("Notas de 5: " + notas5);
            if (notas1 > 0) System.out.println("Notas de 1: " + notas1);
		}
	}
}
