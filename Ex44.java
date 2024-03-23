import java.util.Scanner;

public class Ex44 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int votosA = 0, votosB = 0, votosC = 0, votosD = 0, votosnulos = 0, votosbrancos = 0, votostotais = 0, voto;
    double porcentagemnula = 0, porcentagembranca = 0;

    do {
      System.out.println("Digite código do candidato: ");
      System.out.print("1 - Candidato A / 2 - Candidato B / 3 - Candidato C / 4 - Candidato D / 5 - Nulo / 6 - Branco / 0 - Encerrar: ");
      voto = teclado.nextInt();
      votostotais++;
      
      if (voto == 0) {
        break;
      } else {
        if (voto == 1) {
          votosA++;
        } else if (voto == 2) {
          votosB++;
        } else if (voto == 3) {
          votosC++;
        } else if (voto == 4) {
          votosD++;
        } else if (voto == 5) {
          votosnulos++;
        } else if (voto == 6) {
          votosbrancos++;
        }
      }
    } while (voto != 0);
    teclado.close();

    porcentagemnula = (votosnulos * 100) / votostotais;
    porcentagembranca = (votosbrancos * 100) / votostotais;
    
    System.out.println(">>>>>>>>>>>>");
    System.out.println("Candidato A: " + votosA + " votos");
    System.out.println("Candidato B: " + votosB + " votos");
    System.out.println("Candidato C: " + votosC + " votos");
    System.out.println("Candidato D: " + votosD + " votos");
    System.out.println("Votos nulos: " + votosnulos + " votos ("+porcentagemnula+"%)");
    System.out.println("Votos brancos: " + votosbrancos + " votos ("+porcentagembranca+"%)");
    
    
  }
}