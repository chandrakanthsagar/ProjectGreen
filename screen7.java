import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class screen7 {

    JFrame jj = new JFrame("CERTIFICATE");
    JLabel j = new JLabel("CERTIFICATE");

    screen7() {
        j.setBounds(150, 85, 100, 50);
        jj.add(j);
        jj.setSize(450, 450);
        jj.setVisible(true);
        jj.setLayout(null);
    }

    public static void main(String args[]) {
        screen7 dd = new screen7();
    }

}
