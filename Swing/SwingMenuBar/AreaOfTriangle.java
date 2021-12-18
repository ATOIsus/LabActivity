package SwingMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AreaOfTriangle extends JFrame implements ActionListener {

    JButton jb1;
    JButton javaButtonBack;
    JTextField jt1, jt2;
    JLabel lbl;
    JLabel labelHello;
    JLabel labelHello1;
    JLabel labelHello2;


    AreaOfTriangle() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        labelHello = new JLabel("Base");
        labelHello.setBounds(20, 50, 150, 30);
        add(labelHello);

        labelHello1 = new JLabel("Height");
        labelHello1.setBounds(20, 80, 150, 30);
        add(labelHello1);

        labelHello2 = new JLabel(" ");
        labelHello2.setBounds(140, 170, 150, 30);
        add(labelHello2);

        lbl = new JLabel("Area of Triangle");
        lbl.setBounds(10, 170, 150, 30);
        add(lbl);

        jb1 = new JButton("=");
        jb1.setBounds(90, 240, 50, 30);
        add(jb1);
        jb1.addActionListener(this);


        javaButtonBack = new JButton("Back");
        javaButtonBack.setBounds(170, 300, 70, 20);
        add(javaButtonBack);
        javaButtonBack.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        float a = Float.parseFloat(jt1.getText());
        float b = Float.parseFloat(jt2.getText());
        float c;

        if (e.getSource().equals(jb1)) {
            c = (a * b) / 2;
            labelHello2.setText(String.valueOf(c));
        }


        if (e.getSource().equals(javaButtonBack)) {
            MenuDriven obj = new MenuDriven();
            obj.setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        AreaOfTriangle addTwoNumbers = new AreaOfTriangle();
    }
}