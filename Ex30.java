import java.util.Scanner;

public class Ex30 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double valor;

    System.out.println("Digite o valor da unidade do pão: ");
    valor = teclado.nextDouble();
    teclado.close();
    
    System.out.println("Panificadora Pão de Ontem - Tabela de preços");

    for (int i = 1; i <= 50; i++) {
      System.out.printf("%d - R$ %.2f\n", i, i * valor);
    }
  }
}