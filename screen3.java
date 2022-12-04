import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class screen3 extends JFrame {
    JLabel l1,l2;
    JTextField t1,t2;

    screen3() {

        JLabel l1= new JLabel("ENTER REFERENCE ID");
        JLabel l2=new JLabel("USERNAME");
    

        t1.setBounds(150, 145, 100, 20);
        l1.setBounds(40, 45, 100, 20);
        add(t1);
        add(l1);
        setSize(350, 350);
        setVisible(true);
        setLayout(null);
    }

    public static void main(String args[]) {
        screen3 e1 = new screen3();
    }
}
