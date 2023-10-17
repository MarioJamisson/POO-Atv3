package q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno:\n> ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do aluno:\n> ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da etapa 1, avaliação 1:\n> ");
        double notaEtapa1Aval1 = scanner.nextDouble();

        System.out.print("Digite a nota da etapa 1, avaliação 2:\n> ");
        double notaEtapa1Aval2 = scanner.nextDouble();

        System.out.print("Digite a nota da etapa 2, avaliação 1:\n> ");
        double notaEtapa2Aval1 = scanner.nextDouble();

        System.out.print("Digite a nota da etapa 2, avaliação 2:\n> ");
        double notaEtapa2Aval2 = scanner.nextDouble();

        Aluno aluno = new Aluno(matricula, nome, notaEtapa1Aval1, notaEtapa1Aval2, notaEtapa2Aval1, notaEtapa2Aval2);

        System.out.println("\nResultado do aluno:");
        System.out.println(aluno.apresentaResultado());

        scanner.close();
    }
}
