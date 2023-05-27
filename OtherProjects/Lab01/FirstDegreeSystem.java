import javax.swing.JOptionPane;
//a1x1+a2x2=a0;
//b1x1+b2x2=b0
public class FirstDegreeSystem {
    public static void main(String[] args){
        String a1_str,a2_str,a0_str,b1_str,b2_str,b0_str;
        a1_str=JOptionPane.showInputDialog(null, "Nhap he so a1","Nhap he so a1",JOptionPane.INFORMATION_MESSAGE);
        a2_str=JOptionPane.showInputDialog(null, "Nhap he so a2","Nhap he so a2",JOptionPane.INFORMATION_MESSAGE);
        a0_str=JOptionPane.showInputDialog(null, "Nhap gia tri a0","Nhap gia tri a0",JOptionPane.INFORMATION_MESSAGE);
        
        b1_str=JOptionPane.showInputDialog(null, "Nhap he so b1","Nhap he so b1",JOptionPane.INFORMATION_MESSAGE);
        b2_str=JOptionPane.showInputDialog(null, "Nhap he so b2","Nhap he so b2",JOptionPane.INFORMATION_MESSAGE);
        b0_str=JOptionPane.showInputDialog(null, "Nhap gia tri b0","Nhap gia tri b0",JOptionPane.INFORMATION_MESSAGE);
        
        double a1=Double.parseDouble(a1_str);
        double a2=Double.parseDouble(a2_str);
        double a0=Double.parseDouble(a0_str);
        double b1=Double.parseDouble(b1_str);
        double b2=Double.parseDouble(b2_str);
        double b0=Double.parseDouble(b0_str);

        double D=(a1*b2-a2*b1);
        double D1x=-(a2*b0-a0*b2);
        double D2x=(a1*b0-a0*b1);
        if (D!=0){
            JOptionPane.showMessageDialog(null, "x="+D1x/D +"\n" +"y="+D2x/D,"Solution",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            double M=b1/a1;
            double N=b0/a0;
            if (M==N){
                JOptionPane.showMessageDialog(null, "Infinite solutions", "Result",JOptionPane.INFORMATION_MESSAGE);
            }
            if (M!=N){
                JOptionPane.showMessageDialog(null, "No solution", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }
    
    
}
