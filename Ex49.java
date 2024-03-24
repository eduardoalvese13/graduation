import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

      int n, numerador = 1, denominador = 1;
      double soma = 0;
      
        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();
        scanner.close();

      
        System.out.print("S = ");
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" + ");
            }
            System.out.print(numerador + "/" + denominador);
            soma += (double) numerador / denominador;
            numerador++;
            denominador += 2;
        }

        System.out.println();
        System.out.println("A soma da série é: " + soma);
    }
}
