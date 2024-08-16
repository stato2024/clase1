//TIP Para <b>ejecutar</b> el código, presione <shortcut actionId="Run"/> o
// Haga clic en el icono <icon src="AllIcons.Actions.Execute"/> en el margen del editor.

import model.TestClass;

public class Main {
    public static void main(String[] args) {
        TestClass t1 = new TestClass(1,"Marcos");
        t1.getName();
        System.out.println("Nombre : " + t1.getName());
        }
    }
