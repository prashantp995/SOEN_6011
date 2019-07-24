public class Main {

  public static void main(String[] args) {
    printWelcomeMessage();
    SinhFunction sinhFunction = new SinhFunction();
    sinhFunction.InitCalculation();
  }

  private static void printWelcomeMessage() {
    System.out.println(UIMessages.DOTS);
    System.out.println(UIMessages.WELCOME_MESSAGE);
    System.out.println(UIMessages.DOTS);
    System.out.println(UIMessages.INPUT_MESSAGE);
  }
}
