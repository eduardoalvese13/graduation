import java.util.Scanner;
// importando a biblioteca de Scanner para ler o teclado do usuário

public class Ex01 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    double nota;
      
    do {
      System.out.print("Digite a nota: ");
      nota = teclado.nextDouble();
      // Coleta a nota inserida do usuário apenas se for um Double
      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida!");
      }
      // Exibe a mensagem de erro toda vez que a nota for inválida.
    } while (0 > nota || nota > 10);
    // Enquanto a nota for inválida, ou seja, enquanto for maior que 10 e menor que 0, o programa permanece dentro do "while" pedindo a nota válida.
    teclado.close();
    // Finaliza a função teclado para evitar uso de memória desnecessário
    System.out.println("Nota válida");
    // Exibe a mensagem de sucesso
  }
}