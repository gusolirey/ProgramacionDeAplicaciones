import java.util.Scanner;

public class AreaRectangulo{
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  double b,h;
  System.out.println("Ingresa base");
  b=scan.nextDouble();
  System.out.println("Ingresa altura");
  h=scan.nextDouble();
  double area;
  area=b*h;
 System.out.println("el area del rectangulo es:" + area);
}
}
