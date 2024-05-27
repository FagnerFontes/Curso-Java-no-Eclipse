package laços.enquanto;

import java.util.Scanner;

/*
======= Média de Números ============ 

    Escreva um programa que peça ao usuário para digitar números. O programa deve continuar pedindo números até que o usuário digite zero. Quando zero for digitado, o programa deve calcular e exibir a média dos números digitados (excluindo zero)

    Dica: Use variáveis para acumular a soma e conta a quantidade de números digitados. 
   
*/
public class Exer5 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in);


		
		int soma = 0; //Inicializa a variável soma para armaznar a soma dos números digitados

		int contador = 0; //Inicializa o contador para contar quantos números foram digitados 

		int numero ; //Declara a variável numero que será usada para armazenar os números digitados pelo usuário. 

		
		System.out.println("Digite um números para calcular a média (zero para sair:  ) ");

		//Inicia um loop infinito para permitir a entrada de múltiplos números 
		while (true) { 
			//Pede ao usuário para digitar um número
			System.out.print("Digite um número: ");

			//Lê número digitado pelo usuário
			numero = porta.nextInt(); 

			//Se o número digitado for zero, sai do loop
			if(numero == 0){
				break; 
			}

			//Adiciona o número digitado à soma 
			soma += numero; 

			//Incrementa o contador
			contador++; 
		}	

		//Verificar se algum número foi digitado (contador > 0)
		if(contador > 0){
			//Calcula a média dos números digitados 
			double media = (double) soma / contador;
			
			//Exibe a média dos números digitados
			System.out.println("A média dos números digitados é:  " + media);
			

		}
	}
}
