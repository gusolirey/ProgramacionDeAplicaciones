import javax.swing.JOptionPane;

public class AreaCirculo{
  public static  void main(String[] args) {

      double pi=3.1416;
      Double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el radio"));
      double area;
      area=pi*r*r;
      JOptionPane.showMessageDialog(null,"el area del circulo es:" + area);
  }
}
