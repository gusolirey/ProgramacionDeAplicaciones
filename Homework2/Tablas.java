import javax.swing.JOptionPane;

public class Tablas{
  public static void main(String[] args) {

    do{

    int tabla= Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
    String salida="";
    for(int i = 0; i<=9; i++){
    salida += tabla + "x"+ (i+1)+"="+(i+1)*tabla+"\n");
  }
  while{tabla!=0}


  }
}
