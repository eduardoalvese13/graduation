import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int numero, multiplicacao = 1;
    
    System.out.println("Digite um número inteiro: ");
    numero = teclado.nextInt();
    teclado.close();
    
    for (int i = numero; i > 0; i--) {
      multiplicacao = multiplicacao*i;
    }
    
    System.out.print(numero+"!: "+multiplicacao);
  }
}