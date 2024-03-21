import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int numero, pares = 0, impar = 0;
    System.out.println("Digite 10 números inteiros: ");
    for (int i = 0; i < 10; i++) {
      numero = teclado.nextInt();
      if (numero % 2 == 0) {
        pares++;
      } else {
        impar++;
      }
    }
    teclado.close();
    System.out.println("Quantidade de números pares: " + pares);
    System.out.println("Quantidade de números ímpares: " + impar);
  }
}