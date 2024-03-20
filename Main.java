import java.util.Scanner;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double nota;
      
    do {
      System.out.print("Digite a nota: ");
      nota = teclado.nextDouble();

      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida!");
      }
    } while (0 > nota || nota > 10);
    
    System.out.println("Nota válida");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}