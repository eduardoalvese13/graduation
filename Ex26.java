import java.util.Scanner;

public class Ex26 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int eleitores, votoA = 0, votoB = 0, votoC = 0;
    String voto;
    
    System.out.println("Digite o número total de eleitores: ");
    eleitores = teclado.nextInt();

    for (int i = 1; i <= eleitores; i++) {
      System.out.println("Digite o voto do eleitor "+i+": ");
      voto = teclado.next();

      if (voto.equals("A")) {
        votoA++;
      } else if (voto.equals("B")) {
        votoB++;
      } else if (voto.equals("C")) {
        votoC++;
      }
    }
    teclado.close();

    System.out.println("Resultados: ");
    System.out.println("Candidato A: " + votoA + " votos");
    System.out.println("Candidato B: " + votoB + " votos");
    System.out.println("Candidato C: " + votoC + " votos");
  }
}