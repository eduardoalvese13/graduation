import java.util.Scanner;

public class Ex36 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int numero, inicio, fim;
    
    System.out.print("Montar a tabuada de: ");
    numero = teclado.nextInt();
    System.out.print("Começar de: ");
    inicio = teclado.nextInt();
    System.out.print("Terminar em: ");
    fim = teclado.nextInt();
    teclado.close();
    System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em "+fim+":");

    for (int i = inicio; i <= fim; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);
    }
    
  }
}