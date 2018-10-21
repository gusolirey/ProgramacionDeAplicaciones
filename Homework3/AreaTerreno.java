import javax.swing.JOptionPane;

public class AreaTerreno{
  public static void main(String[] args) {

    double  areatr, arearec, areatrrec;

    double alturatrrec= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el altura del triangulorectangulo"));
    double basetrrec = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese  la base del triangulorectangulo"));
    double alturarec = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la altura del rectangulo"));

    areatr=basetrrec*alturatrrec-alturarec/2;
    JOptionPane.showMessageDialog(null,"el area del triangulo rectangulo es:" + areatr);

    arearec=basetrrec*alturarec;
    JOptionPane.showMessageDialog(null,"el area del rectangulo es:" + arearec);

    areatrrec= areatr+arearec;
    JOptionPane.showMessageDialog(null,"el area total del triangulo rectangulo es:" + areatrrec);

  }
}
