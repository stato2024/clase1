package view;
import  javax.swing.JOptionPane;

public class EmployeeView {

    public String getInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
