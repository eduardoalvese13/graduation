import java.util.Scanner;

public class Ex31 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double valor, soma = 0, dinheiro, troco;
    int count = 1;
    
    System.out.println("Lojas Tabajara");

    do {
      System.out.print("Produto "+count+": R$ ");
      valor = teclado.nextDouble();
      soma += valor;
      count ++;
    } while (valor != 0);
    System.out.println("Total: R$ "+soma);
    System.out.print("Dinheiro: R$ ");
    dinheiro = teclado.nextDouble();
    teclado.close();
    
    troco = soma - dinheiro;
    System.out.println("Troco: "+troco);

    
  }
}