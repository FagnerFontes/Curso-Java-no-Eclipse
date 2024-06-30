package laços.exercícios;

/* =============== Validação de Entrada ==================

   - Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um
 */
import java.util.Scanner;

public class ValorMedioCd {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);
        
       System.out.print("Quantos CDs deseja comprar? ");
       int quantCds = porta.nextInt(); 

       int valorCd = 0;  
       int TotalValorCD = 0; 

        if (quantCds <= 0) {
            System.out.println("A quantidade de cds deve ser maior que 0");
        }

        for(int i = 1 ; i < quantCds + 1; i++){
            System.out.print("Informe o valor do " + i + " CD: ");
            double valorcd = porta.nextDouble(); 
            TotalValorCD += valorcd;  
        }

        int valorMedioCD = TotalValorCD / quantCds; 

       System.out.println("O valor total dos CDs foi de: " + TotalValorCD + " reais.");

       System.out.println("O valor médio dos CDs foi de: " + valorMedioCD + " reais.");

        
    }
}
