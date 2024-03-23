import java.util.Scanner;

public class Ex43 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double cod100 = 1.20, cod101 = 1.30, cod102 = 1.50, cod103 = 1.20, cod104 = 1.30, cod105 = 1.00;
    double qtd, total = 0;
    double total0 = 0, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
    int codigo, resposta = 1;

    do {
      System.out.print("Digite o código do produto: ");
      codigo = teclado.nextInt();
      System.out.print("Digite a quantidade: ");
      qtd = teclado.nextInt();

      switch(codigo) {
        case 100:
          total = total + (qtd * cod100);
          total0 = qtd * cod100;
          break;
        case 101:
          total = total + (qtd * cod101);
          total1 = qtd * cod101;
          break;
        case 102:
          total = total + (qtd * cod102);
          total2 = qtd * cod102;
          break;
        case 103:
          total = total + (qtd * cod103);
          total3 = qtd * cod103;
          break;
        case 104:
          total = total + (qtd * cod104);
          total4 = qtd * cod104;
          break;
        case 105:
          total = total + (qtd * cod105);
          total5 = qtd * cod105;
          break;
        }

      System.out.println("Digite 0 para sair ou 1 para continuar: ");
      resposta = teclado.nextInt();
    } while (resposta != 0);
    
    System.out.println(">>>>>>>>>>>>>>>>>");
    System.out.println("Cachorro-Quente: R$ " + total0);
    System.out.println("Bauru Simples: R$ " + total1);
    System.out.println("Bauru com Ovo: R$ " + total2);
    System.out.println("Hambúrguer: R$ " + total3);
    System.out.println("Cheeseburguer: R$ " + total4);
    System.out.println("Refrigerante: R$ " + total5);
    System.out.println("Total: R$ " + total);

  }
}