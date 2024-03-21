import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    
    int anos = 0;
    double popA, popB, rateA, rateB;
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a população A: ");
    popA = teclado.nextDouble();
    System.out.println("Digite o crescimento anual da população A: ");
    rateA = teclado.nextDouble();

    System.out.println("Digite a população B: ");
    popB = teclado.nextDouble();
    System.out.println("Digite o crescimento anual da população B: ");
    rateB = teclado.nextDouble();

    teclado.close();

    if (popA < popB) {
      
      do {
        popA = popA + (popA * rateA);
        popB = popB + (popB * rateB);
        anos++;
      } while (popA < popB);

      System.out.println("Serão necessários " + anos + " anos para a população A ultrapassar a população B");

    } else {
      if (popA == popB && rateA == rateB) {
        System.out.println("A população A e a população B terão a mesma população após " + anos + " anos");
      } else {

        do {
          popB = popB + (popB * rateB);
          popA = popA + (popA * rateA);
          anos++;
        } while (popB < popA);

        System.out.println("Serão necessários " + anos + " anos para a população B ultrapassar a população A");

      }
    }
   

  }

}