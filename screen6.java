import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class screen6 extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1;
    JButton b = new JButton("Download Certificate");

    screen6() {

        b.addActionListener(this);
        b.setBounds(150, 250, 155, 30);
        t1 = new JTextField();
        l1 = new JLabel("enter reference ID");
        l2=new JLabel("");
        l1.setBounds(60, 20, 100, 20);
        l2.setBounds(180, 80, 100, 52);
        t1.setBounds(130, 192, 200, 30);
        add(b);
        add(t1);
        add(l1);
        setSize(450, 450);
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        String x="project21233434";
        String y=t1.getText();
       if(e.getSource()==b){
           if(x.equals(y)){
           screen7 tt=new screen7();}
           
   

        }

    }

    public static void main(String args[]) {
        screen6 e1 = new screen6();
    }
}