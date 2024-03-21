import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int numero, multiplicacao = 1;
    String escolha = "S";

    do {
      multiplicacao = 1;
      System.out.println("Digite um número inteiro (menor que 16): ");
      numero = teclado.nextInt();
      teclado.nextLine();
      
      if (numero <16 && numero >= 0) {
        for (int i = numero; i > 0; i--) {
          multiplicacao = multiplicacao*i;
        }

        System.out.println(numero+"!: "+multiplicacao);
      } else {
        System.out.println("Número inválido.");
      };
      
      System.out.println("Deseja continuar? (S para sim, N para não)");
      escolha = teclado.next();      
    } while (escolha.equals("S"));

    teclado.close();    
  }
}