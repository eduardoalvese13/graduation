public class Ex16{
  public static void main(String[] args) {
    
    int quantidade = 0, num1 = 0, num2 = 1, soma = 0;

    System.out.println("A sequência Fibonnaci até o valor 500 é: ");
    
    while (soma <= 500) {
        System.out.print(soma + " ");
        soma = num1 + num2;
        num1 = num2;
        num2 = soma;
    }
  }
}