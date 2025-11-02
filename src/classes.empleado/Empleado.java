
import javax.swing.JOptionPane;

import src.classes.Persona;

public class Empleado extends Persona{
    
    private String codigoDeEmpleado;
    private int numeroDeHorasExtras;
    private String fechaDeIngreso;
    private String area;
    private String cargo;

    @Override
    public void registrarDatos(){
        super.registrarDatos();

        codigoDeEmpleado=JOptionPane.showInputDialog("Ingrese el codigo del empleado");
        numeroDeHorasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas extras"));
        fechaDeIngreso=JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/aaaa)");
        area=JOptionPane.showInputDialog("Ingrese el area");
        cargo=JOptionPane.showInputDialog("Ingreseel cargo");
    }
}
