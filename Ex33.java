import java.util.Scanner;

public class Ex33 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double soma = 0, media, temperatura, menor = Integer.MAX_VALUE, maior = 0;
    int count = 1;
    String resposta;

    do {
      System.out.println("Digite o valor da "+count+"ª temperatura: ");
      temperatura = teclado.nextDouble();

      if (temperatura < menor) {
        menor = temperatura;
      }

      if (temperatura > maior) {
        maior = temperatura;
      }

      soma = soma + temperatura;
      count++;
      System.out.println("Digite 'S' se deseja continuar.");
      resposta = teclado.next();

    } while (resposta.equals("S"));
      
    media = soma/(count-1);
    System.out.println("A média das temperaturas é: "+media);
    System.out.println("A menor temperatura é: "+menor);
    System.out.println("A maior temperatura é: "+maior);
  }
}