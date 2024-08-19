//TIP Para <b>ejecutar</b> el código, presione <shortcut actionId="Run"/> o
// Haga clic en el icono <icon src="AllIcons.Actions.Execute"/> en el margen del editor.

import model.Employee;
import service.EmployeeService;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Employee a;
        EmployeeService emp = new EmployeeService();
        //Solicitar al usuario que ingrese los datos del empleado
        String dniStr = JOptionPane.showInputDialog(null, "Ingrese el DNI del empleado:");
        Integer dni = Integer.parseInt(dniStr);

        String name = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
        String surname = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:");

        String salaryStr = JOptionPane.showInputDialog(null, "Ingrese el salario del empleado:");
        double salary = Double.parseDouble(salaryStr);

        a = emp.CreateEmployee(dni,name,surname,salary);
        JOptionPane.showMessageDialog(null,"Empleado : "+ a.getEmployee());
        System.out.println(a.getEmployee());
        }
    }
