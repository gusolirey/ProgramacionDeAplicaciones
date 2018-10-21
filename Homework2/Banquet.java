import java.util.Scanner;

public class Banquet{
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

    System.out.println("Enter the number of people:");
    int np= input.nextInt();
    double tot;

    if(np>300)
    tot= np*0.75;
    else if (np>200) {
      tot=np*0.85;
    }
    else
    tot=np*0.95;

  System.out.println("The total to pay is"+tot);

  }
}
