import javax.swing.JOptionPane;

public class SueldoSemanal{
  public static void main(String[] args) {


    double SS;
    Double HT= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa las horas trabajadas:"));
    Double PH= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el pago por hora:"));
    SS= HT*PH;
    JOptionPane.showMessageDialog(null,"su sueldo semanal es de:"+ SS);
  }
}
