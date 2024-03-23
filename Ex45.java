import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gabarito = new String[10];

        int totalAlunos = 0, maiorAcerto = 0, menorAcerto = 10, somaNotas = 0;

        System.out.println(">>> Professor <<<");
        for (int i = 0; i < 10; i++) {
            System.out.println("Gabarito da questão " + (i + 1) + ":");
            String respostacerta = scanner.nextLine();
            gabarito[i] = respostacerta.toUpperCase();
        }
      
        boolean outroAluno = true;
        while (outroAluno) {
            totalAlunos++;

            System.out.println("Aluno #" + totalAlunos);
            int acertos = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Resposta da questão " + (i + 1) + ":");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase(gabarito[i])) {
                    acertos++;
                }
            }

            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }
            somaNotas += acertos;

            System.out.println("Outro aluno vai utilizar o sistema? (S/N)");
            String respostaOutroAluno = scanner.nextLine();
            outroAluno = respostaOutroAluno.equalsIgnoreCase("S");
        }

        double mediaNotas = (double) somaNotas / totalAlunos;

        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotas);

        scanner.close();
    }
}
