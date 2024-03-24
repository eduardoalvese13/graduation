import java.util.Scanner;

public class Ex47 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String nome, resposta = "S";
    double nota, maiornota = 0, menornota = Integer.MAX_VALUE, media, soma = 0;

    do {
      System.out.print("Atleta: ");
      nome = teclado.nextLine();

      for (int i = 0; i < 7; i++) {
        System.out.print("Nota: ");
        nota = teclado.nextDouble();

        soma = soma + nota;

        if (nota < menornota) {
          menornota = nota;
        }
        if (nota > maiornota) {
          maiornota = nota;
        }
      }

      media = (soma - menornota - maiornota) /5;

      System.out.println("Resultado final: ");
      System.out.println("Atleta: " + nome);
      System.out.println("Melhor nota: " + maiornota);
      System.out.println("Pior nota: " + menornota);
      System.out.println("Média: "+media);

      System.out.println("Deseja continuar? (S/N)");
     resposta = teclado.next();

    } while (resposta.equals("S"));
    teclado.close();

    System.out.println("Programa finalizado");


  }

}