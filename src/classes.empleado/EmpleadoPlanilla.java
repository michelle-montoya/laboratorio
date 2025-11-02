import javax.swing.JOptionPane;

import src.classes.Persona;

public class EmpleadoPlanilla extends Empleado{
    
    private double salarioMensual;
    private double porcentajeAdicionalPorHoraExtra;

    @Override
    public void registrarDatos(){
        super.registrarDatos();

        salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensual"));
        porcentajeAdicionalPorHoraExtra=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje adicional por hora extra"));
    }

    public double getSalarioMensual(){
        return salarioMensual;
    }
}
