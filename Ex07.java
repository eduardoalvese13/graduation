import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maior = 0, numero;

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            numero = teclado.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maior);

        teclado.close();
    }
}