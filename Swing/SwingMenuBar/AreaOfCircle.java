package SwingMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AreaOfCircle extends JFrame implements ActionListener {

    JButton jb1;
    JButton javaButtonBack;
    JTextField jt1;
    JLabel lbl;
    JLabel labelHello;
    JLabel labelHello2;


    AreaOfCircle() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        labelHello = new JLabel("Radius");
        labelHello.setBounds(20, 50, 150, 30);
        add(labelHello);

        labelHello2 = new JLabel(" ");
        labelHello2.setBounds(140, 170, 150, 30);
        add(labelHello2);

        lbl = new JLabel("Area of Circle");
        lbl.setBounds(10, 170, 150, 30);
        add(lbl);

        jb1 = new JButton("=");
        jb1.setBounds(90, 240, 50, 30);
        add(jb1);
        jb1.addActionListener(this);


        javaButtonBack = new JButton("Back");
        javaButtonBack.setBounds(130, 300, 70, 20);
        add(javaButtonBack);
        javaButtonBack.addActionListener(this);


        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        float a = Float.parseFloat(jt1.getText());
        double c;

        if (e.getSource().equals(jb1)) {
            c = 3.14 * (a * a);
            labelHello2.setText(String.valueOf(c));
        }


        if (e.getSource().equals(javaButtonBack)) {
            MenuDriven obj = new MenuDriven();
            obj.setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        AreaOfCircle addTwoNumbers = new AreaOfCircle();
    }
}