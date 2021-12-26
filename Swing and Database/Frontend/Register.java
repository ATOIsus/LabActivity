import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Register extends JFrame implements ActionListener {

    JTextField javaText;
    JTextField javaText1;
    JTextField javaText2;
    JLabel labelHello;
    JLabel labelHello1;
    JLabel labelHello2;
    JLabel labelHello3;
    JLabel labelHello4;
    JCheckBox checkBox;
    JButton javaButton;
    JButton javaButton1;
    JPasswordField passwordField;
    JPasswordField confirmPasswordField;

    Register() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        javaText = new JTextField();
        javaText.setBounds(130, 50, 150, 30);
        add(javaText);

        javaText1 = new JTextField();
        javaText1.setBounds(130, 90, 150, 30);
        add(javaText1);

        javaText2 = new JTextField();
        javaText2.setBounds(130, 130, 150, 30);
        add(javaText2);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 170, 150, 30);
        add(passwordField);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(130, 210, 150, 30);
        add(confirmPasswordField);

        labelHello = new JLabel("Name  ");
        labelHello.setBounds(20, 50, 150, 30);
        add(labelHello);

        labelHello1 = new JLabel("Username  ");
        labelHello1.setBounds(20, 90, 150, 30);
        add(labelHello1);

        labelHello2 = new JLabel("Email ");
        labelHello2.setBounds(20, 130, 150, 30);
        add(labelHello2);

        labelHello3 = new JLabel("Password ");
        labelHello3.setBounds(20, 170, 150, 30);
        add(labelHello3);

        labelHello4 = new JLabel("Confirm Password ");
        labelHello4.setBounds(20, 210, 150, 30);
        add(labelHello4);

        javaButton = new JButton("Register");
        javaButton.setBounds(130, 270, 90, 30);
        add(javaButton);
        javaButton.addActionListener(this);

        
        javaButton1 = new JButton("Log In");
        javaButton1.setBounds(130, 310, 90, 30);
        add(javaButton1);
        javaButton1.addActionListener(this);


        checkBox = new JCheckBox("Show Password", true);
        checkBox.setBounds(250, 265, 120, 50);
        add(checkBox);
        checkBox.addActionListener(this);


        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setResizable(false);

    }

    public static void main(String[] args) {
        new Register().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = javaText.getText();
        String username = javaText1.getText();
        String email = javaText2.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());


        if (e.getSource().equals(checkBox)) {
            if (checkBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
                confirmPasswordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
                confirmPasswordField.setEchoChar('*');
            }
        }

        if (e.getSource().equals(javaButton)) {
            JOptionPane.showMessageDialog(null,
                    "Name: " + name + "\n" +
                            "Username    : " + username + "\n" +
                            "Email       : " + email + "\n" +
                            "Password    : " + password + "\n" +
                            "Confirm Password: " + confirmPassword
            );
        }

        
        if (e.getSource().equals(javaButton1)) {
            new LoginPage().setVisible(true);
            setVisible(false);
        }
    }
}