import java.util.Scanner;

public class Ex42 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int numero, count1 = 0, count2 = 0, count3 = 0, count4 = 0;

    do {
      System.out.println("Digite um número inteiro qualquer");
      numero = teclado.nextInt();

      if (numero >= 0 && numero <= 25) {
        count1++;
      } else {
        if (numero >= 26 && numero <= 50) {
          count2++;
        } else {
          if (numero >= 51 && numero <= 75) {
            count3++;
          } else {
            if (numero >= 76 && numero <= 100) {
              count4++;
            }
          }
        }
      }
    } while (numero >= 0);

    System.out.println("A quantidade de números entre 0 e 25 é: " + count1);
    System.out.println("A quantidade de números entre 25 e 50 é: " + count2);
    System.out.println("A quantidade de números entre 50 e 75 é: " + count3);
    System.out.println("A quantidade de números entre 75 e 100 é: " + count4);
    
  }
}