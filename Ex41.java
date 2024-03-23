import java.util.Scanner;

public class Ex41 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double divida, juros;
    System.out.print("Digite o valor da dívida: ");
    divida = teclado.nextDouble();
    teclado.close();


    System.out.println("Valor da Dívida - Valor dos Juros - Quantidade de Parcelas - Valor da Parcela");
    System.out.print(String.format("%-18s", divida));
    System.out.print(String.format("%-18s", "0"));
    System.out.print(String.format("%-25s", "1"));
    System.out.println(String.format("%-18s", "R$ "+divida));
    
    for (int i = 1; i <= 5; i++) {
      juros = 5 + (5*i);
      int parcelas = i *3;
      double valorfinal = divida + (divida * (juros/100)), valorparcela = valorfinal / parcelas;     
      
      System.out.print(String.format("%-18s", String.format("%.2f", valorfinal)));
      System.out.print(String.format("%-18s", juros));
      System.out.print(String.format("%-25s", parcelas));
      System.out.println(String.format("%-18s", "R$ "+String.format("%.2f", valorparcela)));
    }
  }
}