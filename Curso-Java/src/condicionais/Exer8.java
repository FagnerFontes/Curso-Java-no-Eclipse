package condicionais;

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Exer8 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		System.out.print("Digite o valor do primeiro produto: ");
		double produto1 = porta.nextDouble();
		
		System.out.print("Digite o valor do segundo produto: ");
		double produto2 = porta.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		double produto3 = porta.nextDouble();
		
		
		
		
		if(produto1 < produto2 && produto1 < produto3) {
			System.out.println("Este é o produto com menor valor: " + produto1);
		}else if(produto2 < produto1 && produto2 < produto3){
			System.out.println("ESte é o produto com menor valor: " + produto2);		
		}else if(produto3 < produto1 && produto3 < produto2){
			System.out.println("Este é o produto comm menor valor:" + produto3);
			
			porta.close();
		}	
		
		
	}	
}
