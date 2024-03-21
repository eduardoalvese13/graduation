import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {

    int num1, num2, soma = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o primeiro número inteiro: ");
    num1 = teclado.nextInt();
    System.out.println("Digite o segundo número inteiro: ");
    num2 = teclado.nextInt();
    teclado.close();
    soma = num1 + num2;
    
    if (num1 > num2) {
      System.out.println("Todos os números entre " + num2 + " e " + num1 + " são:");
      for (int i = num2+1; i <= num1-1; i++) {
        soma = i + soma;
        System.out.println(i+" ");
      }

    } else {

      System.out.println("Todos os números entre " + num1 + " e " + num2 + " são:");
      for (int i = num1+1; i <= num2-1; i++) {
        soma = i + soma;
        System.out.print(i+" ");
      }

    }
    System.out.println(" ");
    System.out.println("A soma de todos esses números é: " + soma);

  }
}