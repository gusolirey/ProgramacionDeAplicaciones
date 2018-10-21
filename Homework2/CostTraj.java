import java.util.Scanner;

public class CostTraj{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double CS,DO,FP;


    System.out.println("enter the price of the suit:");
    CS= input.nextDouble();
    if(CS>2500)
    DO=CS*.15;
    else
    DO=CS*.08;

    FP= CS-DO;
    System.out.println("the final price of the suit is:"+FP);
  }
}
