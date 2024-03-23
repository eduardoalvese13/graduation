import java.util.Scanner;

public class Ex32 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int fatorial;
    
    System.out.print("Fatorial de: ");
    fatorial = teclado.nextInt();
    teclado.close();

    System.out.print(fatorial+"! = "+fatorial+" . ");
    
    for (int i = fatorial -1; i > 1; i--) {
        fatorial = fatorial * i;
        System.out.print(i + " . ");
    }
    System.out.print("1 = "+fatorial);
  }
}