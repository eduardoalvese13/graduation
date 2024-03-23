import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int primo, divisores = 0;
    
    System.out.println("Digite o número a ser consultado: ");
    primo = teclado.nextInt();
    teclado.close();

    for (int i = primo; i >= 1; i--) {
      if (primo % i == 0) {
        divisores = divisores + 1;
      }
    }
    if (divisores == 2) {
      System.out.println("O número " + primo + " é primo.");
    } else {
      System.out.println("O número " + primo + " não é primo. Ele possui "+divisores+" divisores.");
    ;}
    
  }

}