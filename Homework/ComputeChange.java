import java.util.Scanner;

public class ComputeChange{
public static void main(String[] args) {
    // para leer de la consola System.in
    Scanner input= new Scanner(System.in);
    //le digo que va a teclear el ususario
    System.out.println("Enter an amount in double:");
    double amount = input.nextDouble();
    // lo que guarda el ususario lo guardo la variable amount
  int cents = (int)(amount * 100); // hacemos un casting convirtiendo el amount en int
//find the number of dollars
int numberOfDollars = cents / 100;
cents = cents % 100;

//find the quarters
int numberOfQuarters = cents /25;
cents = cents % 25;

// number of dimes
int numberOfDimes = cents / 10;
cents = cents % 10;

// number of nickels
int numberOfNickels = cents / 5;
cents = cents % 5;

// number of pennies
int numberOfPennies = cents;

System.out.println("You amount"+ amount +
"consist of \n" +
"\t" + numberOfDollars +"dollars" +
"\t" + numberOfQuarters + "quarters" +
"\t" +numberOfDimes + "dimes" +
"\t"  + numberOfNickels + "nickels" +
"\t" + numberOfPennies + "pennies" );
  }
}
