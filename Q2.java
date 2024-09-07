import java.util.Scanner;
public class Q2 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
 String name;
 int age;
    System.out.println("What is your name?");
    name=in.nextLine();
    System.out.println("What is your age?");
    age=in.nextInt();
    if (age>17)
      System.out.println("Welcome to the Movie, " + name);
    else
      System.out.println("Sorry, this movie is rated \"R\", Admission denied.");
  }
}