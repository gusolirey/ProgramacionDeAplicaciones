import javax.swing.JOptionPane;
public class FactorialWhileLoop{
  public static void main(String[] args) {
//numero para el numero del factorial
    int value =
    Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a int value"));
    //numero del Factoria
    int fact= 1;
    //Sentinela
    int i=1;
    while(i<=value){
      fact = fact * i;
      i++;
      }
      JOptionPane.showMessageDialog(null,"el factorial de"+value
      + "es"+ fact, "Calcula Factorial", JOptionPane.WARNING_MESSAGE);
  }
}
