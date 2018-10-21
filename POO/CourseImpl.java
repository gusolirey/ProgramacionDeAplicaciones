
import javax.swing.*;
  public class CourseImpl{
    public static void main(String[] args) {
      Course curso1 = new Course();
      //curso1.CourseName = "Ingles";
      /*curso1.setCourseName("Ingles");
      curso1.addStudent("Luis");
      curso1.addStudent("Alndra");
      curso1.addStudent("Manuela")
      String[] studentsDeIngles = curso1.getStudents();
      String students = "";
      for (int i = 0; i < curso1.getNumberOfStudents(); i++){
        students += studentsDeIngles[i] + "\n";
      }
      JOptionPane.showMessageDialog(null, students);

      Course curso2 = new Course();
      curso2.setCourseName ("Mate");

      curso2.addStudent("Israel");
      curso2.addStudent("Angel");
      curso2.addStudent("Yo");

      JOptionPane.showMessageDialog(null, curso1.getCourseName());
      //JOptionPane.showMessageDialog(null, curso1.getStudents());
      JOptionPane.showMessageDialog(null, curso2.getCourseName());

      Course curse3 = new Course("Programacion");
      curse3.addStudent("Agustin");
      curse3.addStudent("Juan Carlos");
      */



      int opc=0;

      do {
          opc= Integer.parseInt(JOptionPane.showInputDialog(null,"1. Nuevo Curso"+" \n"+"2.Ingresar alumno"+
          "\n" +"3.Eliminar alumno"+ "\n"+ "4.Mostrar alumno" ));
          switch(opc){
            case 1:
            String cn = JOptionPane.showInputDialog(null,"¿Nombre del Curso?");
            curso1.setCourseName(cn);
              JOptionPane.showMessageDialog(null,curso1.getCourseName());
              break;
            case 2:
            String as= JOptionPane.showInputDialog(null,"Ingrese un alumno");
            curso1.addStudent(as);

            break;

            case 3:
            String Alum=JOptionPane.showInputDialog(null, "\nIngrese el alumno que desea eliminar");
            curso1.dropStudent(Alum);


            break;
            case 4:
              JOptionPane.showMessageDialog(null,curso1.getStudents());
            break;

          }
      }while(true);

  }
}
