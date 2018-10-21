import java.util.Scanner;

public class Consultory{

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println("Enter the appoiments number");
  int AN= input.nextInt();
  int AC,TOT;

  if(AN<4){
    AC=200;
    System.out.println("the Appointment cost is 200");
  }
  else if(AN<6){
    AC=150;
    System.out.println("the Appointment cost is 150");
}
  else if(AN<10){
    AC=100;
    System.out.println("the Appointment cost is 100");
  }
  else {
    AC=50;
    System.out.println("the Appointment cost is 50");
  }
  TOT= AC * AN;
  System.out.println("The treatment cost is:"+TOT);

}
}
