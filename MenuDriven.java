import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDriven extends JFrame implements ActionListener {

    JButton javaButton1;
    JButton javaButton2;
    JButton javaButton3;


    MenuDriven() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        javaButton1 = new JButton("Register");
        javaButton1.setBounds(40, 40, 120, 25);
        add(javaButton1);

        javaButton1.addActionListener(this);

        javaButton2 = new JButton("Log In");
        javaButton2.setBounds(40, 80, 120, 25);
        add(javaButton2);

        javaButton2.addActionListener(this);

        javaButton3 = new JButton("Simple Interest");
        javaButton3.setBounds(40, 120, 120, 25);
        add(javaButton3);

        javaButton3.addActionListener(this);


        setLayout(null);
        setSize(200, 200);
        setVisible(true);
        setResizable(false);

    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(javaButton1)) {
            Register obj = new Register();
            obj.setVisible(true);
            setVisible(false);
        } 
        
        if (e.getSource().equals(javaButton2)) {
            LoginPage obj1 = new LoginPage();
            obj1.setVisible(true);
            setVisible(false);
        } 
        
        if (e.getSource().equals(javaButton3)) {
            SimpleInterest obj2 = new SimpleInterest();
            obj2.setVisible(true);
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        MenuDriven driveMenu = new MenuDriven();
    }
}
