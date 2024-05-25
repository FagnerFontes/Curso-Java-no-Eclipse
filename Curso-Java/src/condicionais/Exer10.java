package condicionais;

/*Faça um programa que pergunte em que turno você estuda. Peça para digitar 

* M - Matutino
* V - Vespertino
* N - Noturno 
	
	Imprima a mensagem "Bom Dia", "Boa Tarde", "Boa Noite" ou 
	"Valor ínválido!", conforme o caso.
*  
*
*
*/

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
//Faça um Programa que leia três números 
public class Exer10 {

	public static void main(String[] args) {

		Scanner porta = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
		
		//Usa o switch para determinar o dia da sema
		
		System.out.println("Digite o turno em que estuda sendo M- Mautino; V- Vespertino; N-Noturno: ");
		String turno = porta.next().trim().toUpperCase();
		
		switch(turno) {
			
		case "M":
			System.out.println("Bom Dia");
			break; 
		case "V": 
			System.out.println("Boa Tarde");
			break;
		case "N":
			System.out.println("Boa Noite");
			break;
		default: 
			System.out.println("Valor inválido");
			break;
		}	
	}	
}
