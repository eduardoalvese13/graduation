import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int total;
    double numero, menor = Integer.MAX_VALUE, maior = 0, soma = 0;
    
    System.out.println("Digite a quantidade de termos que gostaria de verificar: ");
    total = teclado.nextInt();

    for (int i = 0; i < total; i++) {
      System.out.println("Digite o " + (i + 1) + "º número: ");
      numero = teclado.nextDouble();
      soma = numero + soma;

      if (numero < menor) {
        menor = numero;
      };
      if (numero > maior) {
        maior = numero;
      };
    }
    teclado.close();

    System.out.println("O menor número é: " + menor);
    System.out.println("O maior número é: "+ maior);
    System.out.println("A soma dos números é: " + soma);
    
  }
}