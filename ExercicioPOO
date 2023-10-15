import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\fNome do aluno: ");
        String nome = in.next();

        System.out.print("Matrícula: ");
        int matricula = in.nextInt();

        System.out.print("Frequência: ");
        int frequencia = in.nextInt();

        System.out.print("Nota P1: ");
        double p1 = in.nextDouble();

        System.out.print("Nota P2: ");
        double p2 = in.nextDouble();

        System.out.print("Nota P3: ");
        double p3 = in.nextDouble();

        System.out.print("Média de Exercícios: ");
        double mediaExercicios = in.nextDouble();

        alunoFundamentosDeProgramacao aluno1 = new alunoFundamentosDeProgramacao(nome, matricula, frequencia, p1, p2, p3, mediaExercicios, 0, 0);

        if (aluno1.getG1() >= 7 && aluno1.getFrequencia() >= 75) {
            System.out.println("Aluno aprovado! G1: " + aluno1.getG1() + " Frequência: " + aluno1.getFrequencia());
        } else if (aluno1.getG1() >= 4 && aluno1.getFrequencia() >= 75) {
            System.out.println("Necessário G2! Qual foi a nota?");
            double g2 = in.nextDouble();
            aluno1.setG2(g2);
            if (aluno1.getG2() >= 7 && aluno1.getFrequencia() >= 75) {
                System.out.println("Aluno aprovado! G2: " + aluno1.getG2() + " Frequência: " + aluno1.getFrequencia());
            } else {
                System.out.println("Aluno reprovado!");
            }
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
