package controller;

import model.Employee;
import service.EmployeeService;
import view.EmployeeView;

public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeService employeeService, EmployeeView employeeView) {
        this.employeeService = employeeService;
        this.employeeView = employeeView;
    }

    public void createEmployee() {
        // Recoger datos del usuario a través de la vista
        Integer dni = Integer.parseInt(employeeView.getInput("Ingrese el DNI del empleado:"));
        String name = employeeView.getInput("Ingrese el nombre del empleado:");
        String surname = employeeView.getInput("Ingrese el apellido del empleado:");
        double salary = Double.parseDouble(employeeView.getInput("Ingrese el salario del empleado:"));

        // Crear el empleado utilizando el servicio
        Employee employee = employeeService.CreateEmployee(dni, name, surname, salary);

        // Mostrar la información del empleado
        employeeView.showMessage(employee.getEmployee());
    }
}
