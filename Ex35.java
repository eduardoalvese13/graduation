import java.util.Scanner;

public class Ex35 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int divisoes = 0, meta;

    System.out.println("Dige o número a ser consultado: ");
    meta = teclado.nextInt();
    teclado.close();

    System.out.println("Os números primos entre 1 e " + meta + " são: ");

    for (int i = meta; i >= 1; i--) {
      divisoes = 0;
      for (int N = i; N >= 1; N--) {

        if (i % N == 0) {
          divisoes = divisoes + 1;
        }
      }

      if (divisoes == 2) {
        System.out.print(i+" ");
      }
    }
  }
}