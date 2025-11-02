package src.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ModeloDatos {

    HashMap<String, Paciente> pacientesMap;
    HashMap<String, EmpleadoEventual> empleadosEventualesMap;
    HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
    HashMap<String, Medico> medicoMap;

    public ModeloDatos() {
        pacientesMap = new HashMap<String, Paciente>();
        empleadosPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
        medicoMap = new HashMap<String, Medico>();
        empleadosEventualesMap = new HashMap<String, EmpleadoEventual>();
    }

    public void registrarPersona(EmpleadoPlanilla miEmpPlanilla) {
        empleadosPlanillaMap.put(miEmpPlanilla.getNumeroDeDNI(), miEmpPlanilla);
        system.out.println("Se he registrado el empleado por planilla "+miEmpPlanilla.getNombre()+"satisfactoriamente");
    }

    public void registrarPersona(EmpleadoEventual miEmpEventual) {
        empleadosEventualesMap.put(miEmpEventual.getNumeroDeDNI(), miEmpEventual);
        System.out.println("Se ha registradoel empleado eventual "+miEmpEventual.getNombre()+" Satisfactoriamente");
    }

    public void registrarPersona(Medico miMedico) {
        medicosMap.put(miMedico.getNumeroDeDNI(), miMedico);
        System.out.println("Se ha registrado el medio "+miMedico.getNombre()+"Satisfactoriamente");
    }

    public void registrarPersona(Medico medico) {
        listaMedicos.put(medico.getNumeroDni(), medico);
    }

    // Métodos getter para acceder a los mapas
    public Map<String, Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public Map<String, EmpleadoEventual> getListaEmpleadosEventuales() {
        return listaEmpleadosEventuales;
    }

    public Map<String, EmpleadoPlanilla> getListaEmpleadosPlanilla() {
        return listaEmpleadosPlanilla;
    }

    public Map<String, Medico> getListaMedicos() {
        return listaMedicos;
    }

    public ArrayList<CitaMedica> getListaCitas() {
        return listaCitas;
    }
}
