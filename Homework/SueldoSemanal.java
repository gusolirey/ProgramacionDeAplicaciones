import java.util.Scanner;

public class SueldoSemanal{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double HT,PH,SS;
    System.out.println("Ingresa las horas trabajadas:");
    HT=scan.nextDouble();
    System.out.println("Ingresa el pago por hora:");
    PH=scan.nextDouble();
    SS= HT*PH;
    System.out.println("su sueldo semanal es de:"+ SS);
  }
}
