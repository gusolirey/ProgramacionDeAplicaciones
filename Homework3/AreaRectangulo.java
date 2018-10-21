import javax.swing.JOptionPane;

public class AreaRectangulo{
  public static void main(String[] args) {

  double  b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la base"));
  double  h = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la altura "));
  double area;
  area=b*h;
 JOptionPane.showMessageDialog(null,"el area del rectangulo es:" + area);
}
}
