package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
 */
import java.util.Scanner;

public class ValidarSenha {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        String nome; 
        String senha; 
        

    do{
        System.out.print("Digite seu nome de usuário: ");
         nome = porta.next();

        System.out.print("Digite sua senha: ");
        senha = porta.next();

        if(nome.equalsIgnoreCase(senha)){
            System.out.println("Nome de usuário e senha iguais. Digite novamente");
        }

    }while(nome.equalsIgnoreCase(senha));
       
       System.out.println("Cadastro feito com sucesso!!");
    }
}
