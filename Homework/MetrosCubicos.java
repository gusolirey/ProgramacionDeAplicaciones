import java.util.Scanner;

public class MetrosCubicos{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double A,L,N,CM,V,Pago;
    System.out.println("ingrese la altura de la alberca");
    A=scan.nextDouble();
    System.out.println("ingrese el largo de la alberca");
    L=scan.nextDouble();
    System.out.println("ingrese elancho de la alberca");
    N=scan.nextDouble();
    System.out.println("ingrese el costo por metro cubico");
    CM=scan.nextDouble();

    V=(A*L*N);
    Pago=(V*CM);
    System.out.println("el pago por metro cubico es" + Pago);

  }
}
