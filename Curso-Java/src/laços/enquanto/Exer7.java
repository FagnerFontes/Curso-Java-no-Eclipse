package laços.enquanto;

import java.util.Scanner;

/*
======= Números De Dígitos ============ 

    Escreva um programa que peça ao usuário para um número n. O programa deve calcular e exibir os n primeiros números da sequência de Fibonacci. 

	Dica: Utilize duas variáveis para armazenar os dois números anteriores da sequência e calcule o próximo número somando-os. 
   
*/
public class Exer7 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in);

		//Solicita uma instância da classe Scanner par ler a entre do usuário
		System.out.println("Digite o número de termos da sequência de Fibonacci: ");

		//Lê o número de termos que o usuário deseja calcular na sequência de Fibonacci 
		int n = porta.nextInt();
		
		//Inicializa as duas primeira variáveis da sequência de Fibonacci
		int a = 0, b = 1; 

		//Exibe uma mensagem indicando termos da sequência serão exibidos  
		System.out.println("Os primeiros " + n + "termos da sequência de Fibonacci são  ");

		//Inicializa o contador do loop
		int i = 1; 

		//Loop para calcular e imprimir os termos da sequência de Fibonnaci 
		while(i <= n){

			//Imprime o termo atual da sequencia de Fibonacci
			System.out.println(a + " ");

			//Calcula o próximo termo da sequência de Fibonacci 
			int proximo = a + b; 

			//Atualiza os valores de 'a' e 'b' os próximos termos
			a = b; 
			b = proximo; 

			//Incrementa o contador 
			i++; 
		}
	}
}
