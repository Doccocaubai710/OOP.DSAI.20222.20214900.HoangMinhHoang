import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        String age;
        String gender;
        result = JOptionPane.showInputDialog("Hay nhap ten ban: ");
        age = JOptionPane.showInputDialog("Hay nhap tuoi cua ban: ");   
        gender = JOptionPane.showInputDialog("Hay nhap gioi tinh: ");
        if (gender.equalsIgnoreCase("nam")) {
            JOptionPane.showMessageDialog(null, "Hello Mr " + result);
        } else if (gender.equalsIgnoreCase("nu") && Integer.parseInt(age) > 30) {
            JOptionPane.showMessageDialog(null, "Hello Mrs " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Hello Ms " + result);
        }
    
        System.exit(0);
    }
}