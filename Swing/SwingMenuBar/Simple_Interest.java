package SwingMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_Interest extends JFrame implements ActionListener {

    JButton javaButtonCalculate;
    JButton javaButtonBack;
    JTextField javaText1, javaText2, javaText3;
    JLabel javaLabel;
    JLabel javaLabel1;
    JLabel javaLabel2;
    JLabel javaLabel3;
    JLabel javaLabel4;


    Simple_Interest() {

        setTitle("Simple Interest");                    // The title of the window.
        setLayout(null);                            //
        setSize(600, 400);              // Size of the window.
        setVisible(true);                           // Display the window,
        setResizable(false);                        // Cannot Maximize/Minimize window.
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // Window exits when close button is closed.
        getContentPane().setBackground(Color.YELLOW);  // Background Color.


        // Adding Labels.

        javaLabel = new JLabel("Principle");
        javaLabel.setBounds(20, 10, 70, 20);
        add(javaLabel);

        javaLabel1 = new JLabel("Time");
        javaLabel1.setBounds(20, 40, 70, 20);
        add(javaLabel1);

        javaLabel2 = new JLabel("Rate");
        javaLabel2.setBounds(20, 70, 70, 20);
        add(javaLabel2);

        javaLabel3 = new JLabel("Simple Interest: ");
        javaLabel3.setBounds(20, 100, 150, 20);
        add(javaLabel3);

        javaLabel4 = new JLabel();
        javaLabel4.setBounds(130, 100, 60, 20);
        add(javaLabel4);


        // Adding Text Fields.

        javaText1 = new JTextField();
        javaText1.setBounds(90, 10, 50, 20);
        add(javaText1);

        javaText2 = new JTextField();
        javaText2.setBounds(90, 40, 50, 20);
        add(javaText2);

        javaText3 = new JTextField();
        javaText3.setBounds(90, 70, 50, 20);
        add(javaText3);


        // Adding Button.

        javaButtonCalculate = new JButton("Calculate");
        javaButtonCalculate.setBounds(60, 140, 90, 20);
        add(javaButtonCalculate);
        javaButtonCalculate.addActionListener(this);

        javaButtonBack = new JButton("Back");
        javaButtonBack.setBounds(170, 140, 70, 20);
        add(javaButtonBack);
        javaButtonBack.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        float principle = Float.parseFloat(javaText1.getText());
        float time = Float.parseFloat(javaText2.getText());
        float rate = Float.parseFloat(javaText3.getText());

        float simpleInterest;


        if (e.getSource().equals(javaButtonBack)) {
            MenuDriven obj = new MenuDriven();
            obj.setVisible(true);
            setVisible(false);
        }

        if (e.getSource().equals(javaButtonCalculate)) {
            simpleInterest = (principle * time * rate) / 100;
            javaLabel4.setText(String.valueOf(simpleInterest));
        }



    }
}