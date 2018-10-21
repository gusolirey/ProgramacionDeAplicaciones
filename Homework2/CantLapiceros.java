import java.util.Scanner;

public class CantLapiceros{
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

    System.out.println("Enter a number pencils");
    int cantl = input.nextInt();
    double pag;

    if(cantl>=1000)
    pag= cantl*.85;
    else
    pag= cantl*.90;

    System.out.println("The pay for the pencils are:"+pag);
  }
}
