public class Ex04 {
  public static void main(String[] args) {

    int anos = 0;;
    double popA = 80000, popB = 200000, rateA = 0.03, rateB = 0.015;

    do {
      popA = popA + (popA*rateA);
      popB = popB + (popB*rateB);
      anos = anos + 1;
    } while (popA < popB);
    System.out.println("A população A passará a população B em "+anos+ " anos");
  }

}