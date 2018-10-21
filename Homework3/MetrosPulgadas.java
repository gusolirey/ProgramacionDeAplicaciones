import javax.swing.JOptionPane;

public class MetrosPulgadas{
  public static void main(String[] args) {

    double PG;

    Double CM = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de metros:"));
    PG= CM/0.0254;

    JOptionPane.showMessageDialog(null,"las pulgadas que debe pedir son:"+PG+"\n pulgadas");
  }
}
