import java.util.Scanner;

public class Ex24 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int qtdnotas, nota, soma = 0;
    double media;
    
    System.out.println("Digite a quantidade de notas que deseja verificar: ");
    qtdnotas = teclado.nextInt();

    System.out.println("Digite as notas: ");
    
    for (int i = 0; i < qtdnotas; i++) {
      nota = teclado.nextInt();
      soma = soma + nota;
    }
    teclado.close();

    media = soma/qtdnotas;
    
    System.out.println("A média das notas é: " + media);
  }

}