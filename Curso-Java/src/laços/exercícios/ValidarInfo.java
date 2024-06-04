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

        
        // ============== Verifica Nome ======================
        String nome = null;
        do {
            System.out.print("Insira seu nome: ");
            nome = porta.next();
            if (nome.length() < 3) {
                System.out.println("O nome precisa ter mais que 3 caracteres. Digite novamente");
            }

        } while (nome.length() < 3);

       

 // ============== Verifica Idade ======================
        int idade; 
        do{
            System.out.print("Insira sua idade: ");
            idade = porta.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida: Insira uma idade entre 0 e 150");
            }

        }while (idade < 0 || idade > 150); { 
           
        }

 // ============== Verifica Salário  ======================
        double salario; 

         do{
            System.out.print("Digite seu salário: ");
            salario = porta.nextDouble();

            if(salario < 0){
                System.out.println("Insira um valor maior que válido");
            }
         }while(salario < 0);
      

// ============== Verifica Sexo ============================
    
         char sexo; 
        

        do { 
            System.out.print("Digite o sexo: (M = Masculino ; F = Feminino: )");
            sexo = porta.next().charAt(0); 
 
            if(sexo != 'f' && sexo !='m'){
            System.err.println("Sexo inválido. Tente novamente");
            }

        } while (sexo != 'f' && sexo !='m');
        
// ============== Verifica Estado Civil  ============================

        char estado; 

        do{
             System.out.print("Digite o Estado Civil: (S => Solteiro: C => Casado: V => Viúvo: D => Divorciado )");
             estado = porta.next().charAt(0);

             if((estado != 's') && (estado !='c' ) && (estado != 'V') && (estado != 'd')){
             }
        }while((estado != 's') && (estado !='c' ) && (estado != 'V') && (estado != 'd'));

       // System.out.println("Cadastro concluído com sucesso!!");
        System.out.println("======================================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estado);
    }
}
