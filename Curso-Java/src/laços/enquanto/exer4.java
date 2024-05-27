package laços.enquanto;

import java.util.Random;
import java.util.Scanner;

/*
======= Contagem de números ============ 

    Escreva um programa que peça ao usuário para digitar um número positivo. O programa deve contar de 1 até o número fornecido e exibir o número na tela. 

    Dica: Use uma variável contadora que começa em 1 e é incrementada até atingir cada número fornecido. 
   
*/
public class exer4 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in);

		//Cria um instância da classe Randon para gerar o número secreto. 
		Random random = new Random();  

		//Gera número aleatório entre 1 a 100 (inclusive) e o armazena em um número secreto.
		
		int numeroSecreto = random.nextInt(100)+1; 
		int palpite; //Variável para armazenar o palpite do usuário

		//Informa ao usuário o objetivo do jogo
		System.err.println("Advinhe o número entre 1 e 100: ");

		//Inicia um loop infinito para permitir múltiplos palpites
		while (true) { 
			//Pede ao usuário para digitar um palpite
			System.err.println("Digite seu palpite: ");
			
			//Lê o palpite do usuário
			palpite = porta.nextInt(); 

			//Verifica se palpite é nem maior nem menor, então deve ser igual ao número secreto. 
			
			if(palpite > numeroSecreto){
				System.out.println("Muito alto! ");
			}else if (palpite < numeroSecreto){
				System.out.println("Muito baixo!"); 
			}else{
				//Se palpite não é menor nem maior, então deve ser igual ao número secreto
				System.out.println("Parabem! você advinhou o número!");
				break;
			}
		}
	}
}
