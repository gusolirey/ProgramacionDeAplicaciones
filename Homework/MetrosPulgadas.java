import java.util.Scanner;

public class MetrosPulgadas{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double CM,PG;

    System.out.println("Ingresa la cantidad de metros:");
    CM=scan.nextDouble();
    PG= CM/0.0254;

    System.out.println("las pulgadas que debe pedir don:"+PG);
  }
}
