import java.util.Scanner;

public class Ex38 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double salario, reajuste;
    int anoinicio, anoatual, intervalo = 0;
    
    System.out.println("Digite seu salário inicial: ");
    salario = teclado.nextDouble();
    System.out.println("Digite o ano de início de trabalho: ");
    anoinicio = teclado.nextInt();
    System.out.println("Digite o ano atual: ");
    anoatual = teclado.nextInt();
    teclado.close();

    intervalo = (anoatual - anoinicio);

    for (int i = 1; i <= intervalo; i++) {
        reajuste = salario * (0.015 * i);
        salario = salario + reajuste;
      }
    System.out.println(intervalo);
    System.out.println("O salário atual é: " + salario);

  }
}