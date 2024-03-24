import java.util.Scanner;

public class Ex46 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String nome, resposta = "S";
    double salto, maiorsalto = 0, menorsalto = Integer.MAX_VALUE, media, soma = 0;
    
    do {
      System.out.print("Atleta: ");
      nome = teclado.nextLine();

      for (int i = 0; i < 5; i++) {
        System.out.print(i + 1 + "º salto: ");
        salto = teclado.nextDouble();

        soma = soma + salto;

        if (salto < menorsalto) {
          menorsalto = salto;
        }
        if (salto > maiorsalto) {
          maiorsalto = salto;
        }
      }

      media = (soma - menorsalto - maiorsalto) /3;

      System.out.println("Melhor salto: " + maiorsalto+ "m");
      System.out.println("Pior salto: " + menorsalto+ "m");
      System.out.println("Média dos demais saltos: " + media+ "m");
      System.out.println("");
      System.out.println("Resultado final:");
      System.out.println(nome+": "+media+ "m");
      
      System.out.println("Deseja continuar? (S/N)");
     resposta = teclado.next();
      
    } while (resposta.equals("S"));
    teclado.close();
    
    System.out.println("Programa finalizado");
    

  }

}