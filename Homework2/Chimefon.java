import java.util.Scanner;

public class Chimefon{
  public static void main(String[] args) {

    Scanner input =  new Scanner(System.in);

    System.out.println("Enter the time :"+ti);
    double ti = input.nextInt();

    System.out.println("Enter the day :"+da);
    String da = input.nextInt();

    System.out.println("Enter the turn :"+tu);
    String tu = input.nextDouble();

    double pay,tax,tot;

    if(ti<=5)
    pay= ti*1;
    else if (ti<=8)
    pay=(ti-5)*0.8+5.0;
    else if (ti<=10)
    pag=(ti-8)*0.7+7.4;
    else
    pay=(ti-10)*0.5+8.8;

    if da = ("sunday")
    tax=pay*0.5;
    else if (tu=morning)
    tax= pay*0.15;
    else
    tax=pay*0.10;

    tot= pay*tax;
    System.out.println("The pay is :"+pay);
    System.out.println("The tax is :"+imp);
    System.out.println("The total pay is :"+pay);
  }
}
