import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    printWelcomeMessage();
    SinhFunction sinhFunction = new SinhFunction();
    sinhFunction.InitCalculation();
    continueApplication(sinhFunction);
  }

  private static void continueApplication(SinhFunction sinhFunction) {
    while (true) {
      System.out.println("\n" + UIMessages.DOTS + "\n" + UIMessages.OPTIONS_MESSAGE);
      Scanner sc = new Scanner(System.in);
      if (sc.hasNextInt()) {
        int choice = sc.nextInt();
        if (choice == 1) {
          System.out.println(UIMessages.INPUT_MESSAGE);
          sinhFunction.InitCalculation();
        } else if (choice == 0) {
          System.exit(0);
        } else {
          System.out.println(UIMessages.ERROR_INVALID_CHOICE);
        }
      } else {
        System.out.println(UIMessages.ERROR_INVALID_CHOICE);
      }
    }
  }

  private static void printWelcomeMessage() {
    System.out.println(UIMessages.DOTS);
    System.out.println(UIMessages.WELCOME_MESSAGE);
    System.out.println(UIMessages.DOTS);
    System.out.println(UIMessages.INPUT_MESSAGE);
  }
}
