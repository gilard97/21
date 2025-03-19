import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    String input = scanner.nextLine();
    String wynik = input.toLowerCase();

    System.out.println(wynik);
      scanner.close();
  }
}