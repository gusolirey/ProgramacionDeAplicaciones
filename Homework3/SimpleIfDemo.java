import javax.swing.JOptionPane;

public class SimpleIfDemo{
public static void main(String[] args) {

int number = Integer.parseInt(JOptionPane.showInputDialog(null,"enter an Integer: "));

  if (number % 2 ==0){
    JOptionPane.showMessageDialog(null,"It's an even number");
  }else{
    JOptionPane.showMessageDialog(null,"It's an odd number");
  }

}
}
