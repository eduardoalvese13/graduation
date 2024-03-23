import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int turmas, alunos, soma = 0;
    double media = 0;
    
    System.out.println("Digite a quantidade de turmas: ");
    turmas = teclado.nextInt();

    for (int i = 1; i <= turmas; i++) {
      System.out.println("Digite a quantidade de alunos na turma "+i+":");
      alunos = teclado.nextInt();
      
      if (alunos > 40 || alunos < 0) {
        System.out.println("Número de alunos inválidos (>40!)");
        i--;
        alunos = 0;
      } else{
        soma = soma + alunos;
      }
    }
    teclado.close();

    media = soma/turmas;
    System.out.println("A média de alunos por turma é: "+media);
      
  }
}