import javax.swing.JOptionPane;

public class MetrosCubicos{
  public static void main(String[] args) {


    double V,Pago;
    Double A= Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el area de la alberca"));
    Double L= Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el largo de la alberca"));
    Double AN= Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el ancho de la alberca"));
    Double CM= Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el costo por metro cubico"));


    V=(A*L*AN);
    Pago=(V*CM);
    JOptionPane.showMessageDialog(null,"el pago por metro cubico es" + Pago);

  }
}
