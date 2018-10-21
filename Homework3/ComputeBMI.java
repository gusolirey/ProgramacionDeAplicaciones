import javax.swing.JOptionPane;

public class ComputeBMI{
  public static void main(String[] args) {

    final double KILOGRAMS_PER_POUNDS = 0.4535923;
    final double METERS_PER_INCH = 0.254;

    Double weight = Double.parseDouble (JOptionPane.showInputDialog(null,"Enter weight in pounds:"));
    Double height = Double.parseDouble (JOptionPane.showInputDialog(null,"Enter height in inches:"));

    double weightInKilograms = weight * KILOGRAMS_PER_POUNDS;
    double heightInMeters = height * METERS_PER_INCH;

    //double bmi = weightInKilograms / (heightInMeters *
    // heightInMeters);
     double bmi = weightInKilograms / Math.pow(heightInMeters , 2);
     JOptionPane.showMessageDialog(null,"\n Your bmi is : "+ bmi );


     if (bmi < 16)
     JOptionPane.showMessageDialog(null,"\n You are seriously underweight");
     else if (bmi < 18)
     JOptionPane.showMessageDialog(null,"You are underweight");
     else if (bmi < 24 )
     JOptionPane.showMessageDialog(null,"\nYou are normal weight");
     else if (bmi < 29 )
     JOptionPane.showMessageDialog(null,"You are overweight");
     else if (bmi < 35 )
     JOptionPane.showMessageDialog(null,"\nYou are seriously overweight");
     else
     JOptionPane.showMessageDialog(null,"\nYou are gravely overweight");
  }
}
