import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String nome, sexo, estadocivil;
    int idade;
    double salario;
    
    System.out.println("Digite seu nome: ");
    nome = teclado.nextLine();
    do {
      if (nome.length() < 3) {
          System.out.println("ERRO: Nome inválido! Deve ter mais de 3 caracteres!");
          System.out.println("Digite um nome válido: ");
          nome = teclado.nextLine();
      }
    } while (nome.length() < 3);

    System.out.println("Digite sua idade: ");
    idade = teclado.nextInt();

    do {
      if (idade < 0 || idade > 150) {
          System.out.println("ERRO: Idade inválida! Deve ser maior que 0 e menor que 150!");
          System.out.println("Digite uma idade válida: ");
          idade = teclado.nextInt();
      }
    } while (idade < 0 || idade > 150);

    System.out.println("Digite seu salário:  ");
    salario = teclado.nextDouble();

    do {
      if (salario <= 0) {
        System.out.println("ERRO: Salário inválido! Deve ser maior que 0!");
        System.out.println("Digite um salário válido: ");
        salario = teclado.nextDouble();
      }
    } while (salario <= 0);

    teclado.nextLine(); 

    
    System.out.println("Digite seu sexo: ");
    sexo = teclado.nextLine();

    do {
      if (!sexo.equals("f") && !sexo.equals("m")) {
        System.out.println("ERRO: Sexo inválido! Deve ser 'f' ou 'm'!");
        System.out.println("Digite um sexo válido: ");
        sexo = teclado.nextLine();
      }
    } while (!sexo.equals("f") && !sexo.equals("m"));

    System.out.println("Digite seu estado civil: ");
    estadocivil = teclado.nextLine();

    do {
      if (!estadocivil.equals("s") && !estadocivil.equals("c") && !estadocivil.equals("v") && !estadocivil.equals("d")) {
        System.out.println("ERRO: Estado civil inválido! Deve ser 's', 'c', 'v' ou 'd'!");
        System.out.println("Digite um estado civil válido: ");
        estadocivil = teclado.nextLine();
      }
    } while (!estadocivil.equals("s") && !estadocivil.equals("c") && !estadocivil.equals("v") && !estadocivil.equals("d"));

    teclado.close();
    
    System.out.println(nome+", seus dados foram salvos com sucesso!");

  // Exibe a mensagem de sucesso  }
}
}
