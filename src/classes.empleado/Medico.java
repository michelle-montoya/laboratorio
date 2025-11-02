import javax.swing.JOptionPane;

import src.classes.Persona;

public class Medico extends EmpleadoPlanilla{
    private String especialidad;
    private int numeroDeConsultorio;

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        especialidad=JOptionPane.showInputDialog("Ingrese su especialidad");
        numeroDeConsultorio=Integer.parseInt(JOptionPane.showInputDialog("Num consultorio"));
    }
}
