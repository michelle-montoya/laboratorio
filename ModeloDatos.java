package src.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ModeloDatos {

    private Map<String, Paciente> listaPacientes;
    private Map<String, EmpleadoEventual> listaEmpleadosEventuales;
    private Map<String, EmpleadoPlanilla> listaEmpleadosPlanilla;
    private Map<String, Medico> listaMedicos;
    private ArrayList<CitaMedica> listaCitas;

    public ModeloDatos() {
        listaPacientes = new HashMap<>();
        listaEmpleadosEventuales = new HashMap<>();
        listaEmpleadosPlanilla = new HashMap<>();
        listaMedicos = new HashMap<>();
        listaCitas = new ArrayList<>();
    }

    // Sobrecarga de métodos registrarPersona
    public void registrarPersona(Paciente paciente) {
        listaPacientes.put(paciente.getNumeroDni(), paciente);
    }

    public void registrarPersona(EmpleadoEventual empEventual) {
        listaEmpleadosEventuales.put(empEventual.getNumeroDni(), empEventual);
    }

    public void registrarPersona(EmpleadoPlanilla empPlanilla) {
        listaEmpleadosPlanilla.put(empPlanilla.getNumeroDni(), empPlanilla);
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
