package src.classes;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona{

    private int numeroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private ArrayList<String> listaMedicamentosAlergicos;

    @Override
    public void registrarDatos(){
        super.registrarDatos();

        listaMedicamentosAlergicos=new ArrayList<String>();
        numeroHistoriaClinica=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la historia clinica"));
        sexo=JOptionPane.showInputDialog("Ingrese el sexo");
        grupoSanguineo=JOptionPane.showInputDialog("Ingrese el grupo sanguineo");

        String pregunta=JOptionPane.showInputDialog("¿Es alergico a algun medicamento? ingrese si o no");

        if (pregunta.equalsIgnoreCase("si")){
            String medicamento="";
            String continuar="";
            do{
                medicamento=JOptionPane.showInputDialog("Ingrese el nombre del medicamento al que es alergico");
                listaMedicamentosAlergicos.add(medicamento);

                continuar=JOptionPane.showInputDialog("Ingrese si, si desea continuar");
            }while (continuar.equalsIgnoreCase("si"));
        }
    }
}

