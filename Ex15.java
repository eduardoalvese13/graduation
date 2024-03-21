import java.util.Scanner;

public class Ex15{
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int quantidade = 0, num1 = 0, num2 = 1, posicao, soma = 0;

    System.out.println("Digite a posição desejada no Fibonacci: ");
    posicao = teclado.nextInt();
    teclado.close();

    while (quantidade < posicao) {
        System.out.print(num1 + " ");
        soma = num1 + num2;
        num1 = num2;
        num2 = soma;
        quantidade++;
    }
  }
}