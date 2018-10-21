import java.util.Scanner;

public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double KILOGRAMS_PER_POUNDS = 0.4535923;
    final double METERS_PER_INCH = 0.254;

    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    System.out.print("Enter height inches: ");
    double height = input.nextDouble();

    double weightInKilograms = weight * KILOGRAMS_PER_POUNDS;
    double heightInMeters = height * METERS_PER_INCH;

    //double bmi = weightInKilograms / (heightInMeters *
    // heightInMeters);
     double bmi = weightInKilograms / Math.pow(heightInMeters , 2);
     System.out.print("\n Your bmi is : "+ bmi );

     if (bmi < 16)
     System.out.println("\n You are seriously underweight");
     else if (bmi < 18)
     System.out.println("You are underweight");
     else if (bmi < 24 )
     System.out.println("\nYou are normal weight");
     else if (bmi < 29 )
     System.out.println("You are overweight");
     else if (bmi < 35 )
     System.out.println("\nYou are seriously overweight");
     else
     System.out.println("\nYou are gravely overweight");
  }
}
