import java.util.Scanner;

public class ViajeStud{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int p;
    double tot;

    System.out.println("Enter number of students:");
    int ns= input.nextInt();

    if(ns>=100)
    p=65;
    else if(ns>=50)
    p=70;
    else if(ns>=30)
    p=95;
    else
    p= 4000/ns;

    tot= p*ns;
    System.out.println("the total pay is:"+tot);

  }
}
