import java.util.Scanner;

public class GananciaUva{
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

    System.out.println("Enter the kilograms of grapes produced");
    int k= input.nextInt();
    System.out.println("Enter the price per kilogram of grapes produced");
    double p= input.nextDouble();
    System.out.println("Enter the price type of grapes produced");
    double type= input.nextSring();
    System.out.println("Enter the size of the grape");
    double size= input.nextInt();

    if(type="a")
    size=1;
    p=p+0.20;
    else if()
    p=(p+0.30)
    else if (size=1)
    p=(p-0.30)
    else
    p=(p-0.50);

    double ga=p*k;
    System.out.println(" the  gain of grapes produced are:"+ga);

  }
}
