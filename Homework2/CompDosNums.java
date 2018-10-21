import java.util.Scanner;

public class CompDosNums{
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println("Enter the 1st number:");
  int a = input.nextInt();

  System.out.println("Enter the 2nd number:");
  int b = input.nextInt();

  if(a>b)
  System.out.println("the largest number is: "+a);
  else
  System.out.println("the largest number is:"+b);
  }
}
