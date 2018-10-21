import java.util.Scanner;

public class PosNeg{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num = input.nextInt();

    if(num >= 0 )
    System.out.println("Your number is positive:"+num);
    else
    System.out.println("Your number is negative:"+num);

  }
}
