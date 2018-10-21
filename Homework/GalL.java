import java.util.Scanner;

public class GalL{
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int l;
  double pgal,totagal,ganancia;
  System.out.println("introdusca litros producidos");
  l=scan.nextInt();
  System.out.println("introdusca precio del galon");
  pgal=scan.nextDouble();

  totagal=(l/3.758);
  ganancia=pgal*totagal;

  System.out.println("la ganancia por la leche es:"+ ganancia);
}


}
