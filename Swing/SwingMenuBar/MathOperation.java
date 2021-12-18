package SwingMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MathOperation extends JFrame implements ActionListener {

    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton javaButtonBack;
    JTextField jt1, jt2;
    JLabel lbl;
    JLabel labelHello;
    JLabel labelHello1;
    JLabel labelHello2;


    MathOperation() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        labelHello = new JLabel("1 Number   :");
        labelHello.setBounds(20, 50, 150, 30);
        add(labelHello);

        labelHello1 = new JLabel("2 Number  :");
        labelHello1.setBounds(20, 80, 150, 30);
        add(labelHello1);

        labelHello2 = new JLabel(" ");
        labelHello2.setBounds(140, 170, 150, 30);
        add(labelHello2);

        lbl = new JLabel("Result :");
        lbl.setBounds(90, 170, 150, 30);
        add(lbl);

        jb1 = new JButton("+");
        jb1.setBounds(90, 240, 50, 30);
        add(jb1);
        jb1.addActionListener(this);

        jb2 = new JButton("-");
        jb2.setBounds(130, 240, 50, 30);
        add(jb2);
        jb2.addActionListener(this);

        jb3 = new JButton("*");
        jb3.setBounds(180, 240, 50, 30);
        add(jb3);
        jb3.addActionListener(this);

        jb4 = new JButton("/");
        jb4.setBounds(210, 240, 50, 30);
        add(jb4);
        jb4.addActionListener(this);

        javaButtonBack = new JButton("Back");
        javaButtonBack.setBounds(230, 300, 70, 20);
        add(javaButtonBack);
        javaButtonBack.addActionListener(this);


        setLayout(null);
        setSize(600, 400);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int c;

        if (e.getSource().equals(jb1)) {
            c = a + b;
            labelHello2.setText(String.valueOf(c));
        }
        if (e.getSource().equals(jb2)) {
            c = a - b;
            labelHello2.setText(String.valueOf(c));
        }
        if (e.getSource().equals(jb3)) {
            c = a * b;
            labelHello2.setText(String.valueOf(c));
        }
        if (e.getSource().equals(jb4)) {
            c = a / b;
            labelHello2.setText(String.valueOf(c));
        }

        if (e.getSource().equals(javaButtonBack)) {
            MenuDriven obj = new MenuDriven();
            obj.setVisible(true);
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        MathOperation addTwoNumbers = new MathOperation();
    }
}