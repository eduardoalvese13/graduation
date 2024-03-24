import java.util.Scanner;

public class Ex50 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int n;
    double H = 1;

    
    System.out.print("Digite o valor de N: ");
    n = teclado.nextInt();

    System.out.print("H = 1 + ");
    
    for (int i = 1; i <= n-1; i++) {
      System.out.print("1/" + i + " + ");
      H = H + (1.0/i);
    }
    
    System.out.println("1/" + n);
    H = H + (1.0/n);

    System.out.println("H = " + H);
  }
}