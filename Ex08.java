import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero, media = 0, soma = 0;

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            numero = teclado.nextInt();

            soma = soma + numero;
            media = soma/5;
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        teclado.close();
    }
}