import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String senha, nome;

    System.out.println("Digite seu nome: ");
    nome = teclado.nextLine();
    System.out.println("Ótimo, "+nome+"! Agora, digite sua senha: ");
    senha = teclado.nextLine();

    do {
      System.out.println("ERRO: Nome de usuário e senha iguais!");
      System.out.println("Digite uma nova senha: ");
      senha = teclado.nextLine();
    } while (senha.equals(nome));

    teclado.close();

    System.out.println("Usuário e senha criados com sucesso!");
  // Exibe a mensagem de sucesso  }
}
}
