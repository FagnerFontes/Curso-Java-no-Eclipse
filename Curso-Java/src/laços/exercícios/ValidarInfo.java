package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que leia e valide as seguintes informações:

Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'
 */
import java.util.Scanner;

public class ValidarInfo {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = porta.next(); 

        System.out.println("Digite sua idade: ");
        int idade = porta.nextInt(); 

        System.out.print("Digite seu salário: ");
        double salario = porta.nextDouble(); 

        
       

        
    }
}
