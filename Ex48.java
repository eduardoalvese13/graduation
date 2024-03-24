import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int numero, numeroInvertido = 0, digito = 0;
      
        System.out.print("Digite um número inteiro positivo: ");
        numero = scanner.nextInt();
        scanner.close();

        while (numero != 0) {
            digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("Número invertido: " + numeroInvertido);
    }
}