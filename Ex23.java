import java.util.Scanner;

public class Ex23 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int divisoesfeitas = 0, divisoes = 0, meta;
    
    System.out.println("Dige o número a ser consultado: ");
    meta = teclado.nextInt();
    teclado.close();

    System.out.println("Os números primos entre 1 e " + meta + " são: ");
      
    for (int i = meta; i >= 1; i--) {
      divisoes = 0;
      for (int N = i; N >= 1; N--) {
        divisoesfeitas = divisoesfeitas +1;
               
        if (i % N == 0) {
          divisoes = divisoes + 1;
        }
      }

      if (divisoes == 2) {
        System.out.print(i+" ");
      }
    }

    System.out.println("Foram feitas um total de "+divisoesfeitas+" divisões para encontrar os números primos no intervalo mencionado.");

  }
}