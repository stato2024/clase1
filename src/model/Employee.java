package model;

public class Employee {

    private Integer dni;
    private String name;
    private String surname;
    private double salary;

    public Employee(Integer dni, String name, String surname, double salary) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getEmployee(){
        return "Empleado[dni = " + this.dni + " Nombre = " + this.name + " Apellido = "+ this.surname + " Salrio = " + this.salary + "]";
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
