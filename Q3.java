import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int channel;
 System.out.println("In this town, there are 5 non-cable TV channels.\nWhich non-cable channel is your favorite (2, 4, 6, 8, 11)?");
    channel=in.nextInt();
    if (channel==2)
      System.out.println("Channel 2 got top ratings last week!");
    else if (channel==4)
      System.out.println("Channel 4 show primarily news!");
    else if (channel==6)
      System.out.println("Channel 6 shows old movies!");
    else if (channel==8)
      System.out.println("Channel 8 covers local events!");
    else if (channel==11)
      System.out.println("Channel 11 is public broadcasting!");
    else 
      System.out.println("That channel does not exist. It must be a cable channel.");
  }
}