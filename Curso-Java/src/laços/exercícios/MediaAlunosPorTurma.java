package laços.exercícios;

/* =============== Número médio de Alunos ==================

   - Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.  
 */
import java.util.Scanner;

public class MediaAlunosPorTurma {

    public static void main(String[] args) {

        // Cria um objeto "scanner" para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        int somaAlunos = 0;

        for (int i = 1; i <= quantidadeTurmas; i++) {
            int alunosNaTurma;
            do {
                System.out.print("Digite a quantidade de alunos na turma " + i + " (máximo 40 alunos): ");
                alunosNaTurma = scanner.nextInt();
                if (alunosNaTurma > 40) {
                    System.out.println("A quantidade de alunos por turma não pode exceder 40. Tente novamente.");
                }
            } while (alunosNaTurma > 40);

            somaAlunos += alunosNaTurma;
        }

        double mediaAlunos = (double) somaAlunos / quantidadeTurmas;

        System.out.println("A média de alunos por turma é: " + mediaAlunos);

        scanner.close();
    }
}

