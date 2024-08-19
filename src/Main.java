//TIP Para <b>ejecutar</b> el código, presione <shortcut actionId="Run"/> o
// Haga clic en el icono <icon src="AllIcons.Actions.Execute"/> en el margen del editor.


import controller.EmployeeController;
import service.EmployeeService;
import view.EmployeeView;


public class Main {
    public static void main(String[] args) {
        EmployeeService empService = new EmployeeService();
        EmployeeView empView = new EmployeeView();
        EmployeeController empController = new EmployeeController(empService,empView);

        empController.createEmployee();
        }
    }
