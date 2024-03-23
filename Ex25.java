import java.util.Scanner;

public class Ex25 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int qtdpeoples, idade, soma = 0;
    double media;

    System.out.println("Digite a quantidade de pessoas que deseja verificar: ");
    qtdpeoples = teclado.nextInt();

    System.out.println("Digite as idades das "+qtdpeoples+" pessoas: ");

    for (int i = 0; i < qtdpeoples; i++) {
      idade = teclado.nextInt();
      soma = soma + idade;
    }
    teclado.close();

    media = soma/qtdpeoples;

    if (media >= 0 && media <= 25) {
      System.out.println("A turma é jovem");
    } else {
      
      if (media >= 26 && media <= 60) {
        System.out.println("A turma é adulta");
      } else {
        
          System.out.println("A turma é idosa");
      }
    }
    System.out.println("A média das idades é: " + media);
  }

}