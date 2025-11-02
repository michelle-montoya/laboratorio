import javax.swing.JOptionPane;

import src.classes.Persona;

public class EmpleadoEventual extends Empleado {
    private double honorariosPorHora;
    private String fechaTerminoContrato;

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        honorariosPorHora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saalario mensual"));
        fechaTerminoContrato=JOptionPane.showInputDialog("Ingrese fecha nacimiento (dd/mm/aaaa)");
    }
}
