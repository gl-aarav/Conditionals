import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    String password;
    System.out.print("Hello\nPlease enter your password: ");
    password = in.nextLine();
    if (password.equals("hello1234!"))
      System.out.println("You're in!");
    else
      System.out.println("Wrong password");
  }
}