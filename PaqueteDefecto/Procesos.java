

import javax.swing.JOptionPane;

import src.classes.ModeloDatos;
import src.classes.Paciente;

public class Procesos {

    private ModeloDatos miModeloDatos;

    public Procesos() {
        miModeloDatos = new ModeloDatos();
        presentarMenuOpciones();
    }

    private void presentarMenuOpciones() {
        String menu = "MENU HOSPITAL\n\n";
        menu += "1. Registrar Paciente\n";
        menu += "2. Registrar Empleado\n";
        menu += "3. Registrar Cita Médica\n";
        menu += "4. Imprimir Información\n";
        menu += "5. Salir\n";
        menu += "Ingrese una opción:";

        System.out.println("******");

        int opcion = 0;

                switch (opcion) {
                    case 1:
                        registrarPaciente();
                        break;
                    case 2:
                        registrarEmpleado();
                        break;
                    case 3:
                        registrarCitaMedica();
                        break;
                    case 4:
                        imprimirInformacion();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El sistema ha terminado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No existe el código, verifique nuevamente");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
            }

        } while (opcion != 5);

    private void registrarPaciente() {
        Paciente miPaciente=new Paciente();
        miPaciente.registrarDatos();

        miModeloDatos.registrarPersona(miPaciente);
        
    }

    private void registrarEmpleado() {
        String menuTipoEmpleado="Registro de empleaado/n";
        menuTipoEmpleado+="1.Empleado eventual/n";
        menuTipoEmpleado+="2. Empleado por plantilla/n";
        menuTipoEmpleado+="Seleccione el tipo de empleado a registrar/n";

        int menuTipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));

        switch (tipoEmpleado) {
            case 1:
                EmpleadoEventual miEmpleadoEventual=new EmpleadoEventual();
                miEmpleadoEventual.registrarDatos(miEmpleadoEventual);
                break;
            case 2:
                String resp=JOptionPane.showInputDialog("Ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
                if(resp.equalsIgnoreCase("si")){
                    Medico miMedico=new Medico();
                    miMedico.registrarDatos();
                    miModeloDatos.registrarPersona(miMedico);
                }else {
                    EmpleadoPlanilla miEmpleadoPlanilla=new EmpleadoPlanilla();
                    miEmpleadoPlanilla.registrarDatos();
                    miModeloDatos.registrarPersona(miEmpleadoPlanilla);
                }

                break;

            default:System.out.println("El tipo de empleado no es valido, intentalo nuevamente");
                break;
            }
}

