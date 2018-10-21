import java.util.Scanner;

public class AreaCirculo{
  public static  void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double r;
      double pi=3.1416;
      System.out.println("Ingresa el radio");
      r=scan.nextDouble();
      double area;
    area=pi*r*r;
    System.out.println("el area del circulo es:" + area);


  }
}
