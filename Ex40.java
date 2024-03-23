import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidade, veiculosPasseio, acidentesTransito, somaVeiculos = 0, somaAcidentes = 0, menorIndiceAcidentes = Integer.MAX_VALUE, maiorIndiceAcidentes = Integer.MIN_VALUE, codigoMenorIndice = 0,codigoMaiorIndice = 0, cidadesMenos2000 = 0, somaAcidentesMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o código da cidade " + i + ":");
            codigoCidade = scanner.nextInt();

            System.out.println("Digite o número de veículos de passeio em 1999 na cidade " + i + ":");
            veiculosPasseio = scanner.nextInt();
            somaVeiculos += veiculosPasseio;

            System.out.println("Digite o número de acidentes de trânsito com vítimas em 1999 na cidade " + i + ":");
            acidentesTransito = scanner.nextInt();
            somaAcidentes += acidentesTransito;

            if (acidentesTransito < menorIndiceAcidentes) {
                menorIndiceAcidentes = acidentesTransito;
                codigoMenorIndice = codigoCidade;
            }

            if (acidentesTransito > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = acidentesTransito;
                codigoMaiorIndice = codigoCidade;
            }

            if (veiculosPasseio < 2000) {
                cidadesMenos2000++;
                somaAcidentesMenos2000 += acidentesTransito;
            }
        }

        System.out.println("O menor índice de acidentes de trânsito é " + menorIndiceAcidentes + " na cidade " + codigoMenorIndice);
        System.out.println("O maior índice de acidentes de trânsito é " + maiorIndiceAcidentes + " na cidade " + codigoMaiorIndice);
        System.out.println("A média de veículos nas cinco cidades é " + (somaVeiculos / 5.0));

        if (cidadesMenos2000 > 0) {
            System.out.println("A média de acidentes de trânsito nas cidades com menos de 2000 veículos de passeio é " + (somaAcidentesMenos2000 / (double) cidadesMenos2000));
        } else {
            System.out.println("Não há cidades com menos de 2000 veículos de passeio.");
        }

        scanner.close();
    }
}