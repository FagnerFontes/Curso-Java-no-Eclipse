package laços.exercícios;

/* =============== Média da Turma  ==================

   - Faça um programa que peça para n pessoas a sua idade, ao final o programa deverá verificar se a média da turma varia entre 0 e 25, 26 e 60 e maior que 60; então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada. 
 */
import java.util.Scanner;

public class mediaTurma {

    public static void main(String[] args) {

        //Cria um objeto "scanner" para ler a entrada do usuário
        Scanner porta = new Scanner(System.in);

        System.out.print("Quantas pessoas?");
        int n = porta.nextInt();

        double soma = 0;
        double media = 0;

        if (n < 0) {
            System.out.print("Informe um número maior que 0");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("digite a " + i + " idade.");
            int idade = porta.nextInt();

            soma += idade;
        }

        media = soma / n;

        System.out.println("A soma das idade é: " + soma);
        System.out.println("A media da idade é: " + media);

        if (media < 25) {
            System.out.println("Esta é uma turma jovem.");
        } else if ((media >= 26) && (media <= 60)) {
            System.out.println("Esta é uma turma adulta.");
        } else if(media > 60){
            System.out.println("Esta é uma turma idosa.");
        }
    }
}
