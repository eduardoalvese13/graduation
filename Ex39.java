import java.util.Scanner;

public class Ex39 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int aluno, altura, alunoalto = 0, alunobaixo = 0, maisalto = 0, maisbaixo = Integer.MAX_VALUE;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o número do aluno: ");
      aluno = teclado.nextInt();
      System.out.print("Digite a altura do aluno "+aluno+": ");
      altura = teclado.nextInt();

      if (altura > maisalto) {
        maisalto = altura;
        alunoalto = aluno;
      }

      if (altura < maisbaixo) {
        maisbaixo = altura;
        alunobaixo = aluno;
      }
    }
    teclado.close();
    System.out.println("Resultados: ");
    System.out.println("Aluno mais alto: "+alunoalto+" com "+maisalto+" cm");
    System.out.println("Aluno mais baixo: "+alunobaixo+" com "+maisbaixo+" cm");
    
  }
}