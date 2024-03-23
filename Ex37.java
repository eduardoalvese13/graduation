import java.util.Scanner;

public class Ex37 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int codigo, count = 0, codmaisalto = 0, codmaisbaixo = 0, codmaisgordo = 0, codmaismagro = 0;
    double altura, peso, mediaaltura = 0, mediapeso = 0, somaaltura = 0, somapeso = 0, maisalto = 0, maisbaixo = Integer.MAX_VALUE, maisgordo = 0, maismagro = Integer.MAX_VALUE;

      
    do { 
      System.out.print("Digite seu código: ");
      codigo = teclado.nextInt();

      if (codigo != 0) {
        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();

        if (altura > maisalto) {
          maisalto = altura;
          codmaisalto = codigo;
        }

        if (altura < maisbaixo) {
          maisbaixo = altura;
          codmaisbaixo = codigo;
        }

        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();

        if (peso > maisgordo) {
          maisgordo = peso;
          codmaisgordo = codigo;
        }

        if (peso < maismagro) {
          maismagro = peso;
          codmaismagro = codigo;
        }

        count++;
        somaaltura = somaaltura + altura;
        somapeso = somapeso + peso;
        mediaaltura = somaaltura / count;
        mediapeso = somapeso / count;
      } else {
        break;
      }
    } while (codigo != 0);
    teclado.close();

    System.out.println("A maior altura é " + maisalto + " do código " + codmaisalto);
    System.out.println("A menor altura é " + maisbaixo + " do código " +codmaisbaixo);
    System.out.println("O maior peso é " + maisgordo + " do código " + codmaisgordo);
    System.out.println("O menor peso é " + maismagro + " do código " + codmaismagro);
    System.out.println("A média das alturas é " + mediaaltura);
    System.out.println("A média dos pesos é " + mediapeso);
       
  }
}