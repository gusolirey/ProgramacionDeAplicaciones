import java.util.Scanner;

public class Credito{
public static void main(String[] args) {
Scanner input= new Scanner(System.in);

    double AC;

    System.out.println(" Please Enter type of target");
    int TT = input.nextInt();
    System.out.println(" Please your limit of credit");
    double CL = input.nextDouble();

    if (TT==1)
      CI=1.25;
    else if (TT==2)
        CI=1.35;
    else if (TT==3)
          CI=1.35;
    else
        CI=1.50;

          double NC= CL* CI;
          System.out.println("Your NEW credit is:"+ NC);
  }
}
