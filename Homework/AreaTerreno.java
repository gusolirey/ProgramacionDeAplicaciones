import java.util.Scanner;

public class AreaTerreno{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double alturatrrec, basetrrec,alturarec, areatr, arearec,areatrrec;

    System.out.println("Ingresa el altura del triangulorectangulo");
    alturatrrec=scan.nextDouble();
    System.out.println("ingrese  la base del triangulorectangulo");
    basetrrec=scan.nextDouble();
    System.out.println("ingrese la altura del rectangulo");
    alturarec=scan.nextDouble();

    areatr=basetrrec*alturatrrec-alturarec/2;
    System.out.println("el area del triangulo rectangulo es:" + areatr);
    arearec=basetrrec*alturarec;
    System.out.println("el area del  rectangulo es:" + arearec);
    areatrrec= areatr+arearec;
    System.out.println("el area total del triangulo rectangulo es:" + areatrrec);
  }
}
