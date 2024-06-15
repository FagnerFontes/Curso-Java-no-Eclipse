package laços.exercícios;

/* =============== Média Aritmética ==================

   - Faça um programa que calcule e mostre a média aritmética de N. 
 */
import java.util.Scanner;

public class MediaAritmética {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
        System.out.print("Quantas notas serão digitadas? ");
        int n = porta.nextInt(); 
       
        

       if(n<=0){
        System.out.print("A quantidade de notas deve ser maior que 0.");
        return;
       }

       double soma = 0; 
       double media = 0; 

       for (int i = 1; i <=n; i++) {
           System.out.print("Digite a " + i + " nota: ");
           double nota = porta.nextDouble();
           
           soma +=nota; 
       }

       media = soma/n;
       

       System.out.println("A soma das notas é: " + soma);
       System.out.println("A media das notas é : " + media);
        
    }
}
