import javax.swing.JOptionPane;

public class GalL{
public static void main(String[] args) {

  double totagal,ganancia;
  int l = Integer.parseInt(JOptionPane.showInputDialog(null,"introdusca litros producidos"));
  double pgal= Double.parseDouble(JOptionPane.showInputDialog("introdusca precio del galon"));

  totagal=(l/3.758);
  ganancia=pgal*totagal;

  JOptionPane.showMessageDialog(null,"la ganancia por la leche es:"+ ganancia);
}
}
