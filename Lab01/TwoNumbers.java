import javax.swing.JOptionPane;
public class TwoNumbers{
    public static void main(String args[]) {
        String snum1, snum2;
        snum1=JOptionPane.showInputDialog(null,"Input first number:","Input",1);
        snum2=JOptionPane.showInputDialog(null,"Input second number:","Input",1);
        double num1= Double.parseDouble(snum1);
        double num2= Double.parseDouble(snum2);
        double sum=num1+num2;
        double dif=num1-num2;
        double pro=num1*num2;
        double quo=1;
        if (num2 !=0){
            quo=num1/num2;
        }
        if (num2!=0){
            JOptionPane.showMessageDialog(null, "Sum: "+sum+"\n"+"Difference: "+dif+"\n"+"Product: "+pro+"\n"+"Quotient: "+quo,
             "Result", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sum: "+sum+"\n"+"Difference: "+dif+"\n"+"Product: "+pro+"\n"+"Quotient: Divisor=0",
             "Result", 1);
        }
        

    }
}