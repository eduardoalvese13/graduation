import java.util.Scanner;

public class Ex28 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int CDs, preco, soma = 0;
    double media = 0;

    System.out.println("Digite a quantidade de CDs que possui: ");
    CDs = teclado.nextInt();

    for (int i = 1; i <= CDs; i++) {
      System.out.println("Digite o valor pago no CD "+i+":");
      preco = teclado.nextInt();

      soma = soma + preco;
    }
    teclado.close();

    media = soma/CDs;

    System.out.println("Você investiu um total de R$ "+soma+" em sua coleção, gastando cerca de R$ "+media+" por CD comprado.");

  }
}