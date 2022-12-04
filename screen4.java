import java.util.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class screen4 extends JFrame implements ActionListener {
    JFrame j;

    JLabel k = new JLabel("ENTER REFERENCE ID");
    JTextField k1 = new JTextField();
    JButton b = new JButton("ENTER");

    screen4() {
        k.setBounds(20, 145, 200, 50);
        k1.setBounds(170, 150, 200, 40);
        b.setBounds(190, 210, 150, 30);
        add(k);
        add(k1);
        add(b);
        b.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            screen5 k = new screen5();
        }
    }

    public static void main(String args[]) {
        screen4 j = new screen4();
    }

}
