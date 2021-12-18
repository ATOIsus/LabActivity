import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {

    JTextField jt1;
    JButton javaButton;
    JLabel labelHello;
    JLabel labelHello1;
    JCheckBox checkBox;
    JPasswordField passwordField;

    LoginPage() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        passwordField = new JPasswordField();
        passwordField.setBounds(90, 80, 150, 30);
        add(passwordField);

        labelHello = new JLabel("Username  ");
        labelHello.setBounds(20, 50, 150, 30);
        add(labelHello);

        labelHello1 = new JLabel("Password ");
        labelHello1.setBounds(20, 80, 150, 30);
        add(labelHello1);


        javaButton = new JButton("Log In");
        javaButton.setBounds(90, 130, 90, 30);
        add(javaButton);

        javaButton.addActionListener(this);


        checkBox = new JCheckBox("Show Password", true);
        checkBox.setBounds(200, 120, 140, 50);
        add(checkBox);

        checkBox.addActionListener(this);

        setLayout(null);
        setSize(350, 300);
        setVisible(true);
        setResizable(false);

    }

    public static void main(String[] args) {
        LoginPage logIn = new LoginPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = jt1.getText();
        String password = new String(passwordField.getPassword());

        if (e.getSource().equals(checkBox)) {
            if (checkBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
        if (e.getSource().equals(javaButton)) {
            JOptionPane.showMessageDialog(null,
                    "Username    : " + username + "\n" +
                            "Password    : " + password + "\n"
            );
        }
    }
}
