import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int base, exp, resultado = 1;
      
    System.out.println("Digite a base: ");
    base = teclado.nextInt();
    System.out.println("Digite o expoente: ");
    exp = teclado.nextInt();
    teclado.close();

    for (int i = 0; i < exp; i++) {
      resultado = resultado * base;
    }
    System.out.println("O resultado de "+base+" elevado a "+exp+" é: "+resultado);
  }
}