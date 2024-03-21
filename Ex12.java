import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {

    int numero;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número: ");
    numero = teclado.nextInt();
    teclado.close();

    System.out.println("Tabuada de "+numero);

    for (int i =  0; i <= 10; i++) {
      System.out.println(numero+" x "+i+" = "+(numero*i));
    }
  }
}