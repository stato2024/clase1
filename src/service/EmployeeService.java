package service;

import model.Employee;
import javax.swing.JOptionPane;

public class EmployeeService {
    public Employee CreateEmployee(Integer dni, String name,String surname ,double salary){
        return new Employee(dni,name,surname,salary);
    }



}
