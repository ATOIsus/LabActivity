import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VolumeOfCuboid extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1, jt2, jt3;
    JLabel lbl;
    JLabel labelHello;
    JLabel labelHello1;
    JLabel labelHello2;
    JLabel labelHello3;


    VolumeOfCuboid() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        jt3 = new JTextField();
        jt3.setBounds(90, 120, 150, 30);
        add(jt3);

        labelHello = new JLabel("Height");
        labelHello.setBounds(20, 50, 150, 30);
        add(labelHello);

        labelHello1 = new JLabel("Length");
        labelHello1.setBounds(20, 80, 150, 30);
        add(labelHello1);

        labelHello2 = new JLabel(" ");
        labelHello2.setBounds(140, 170, 150, 30);
        add(labelHello2);

        labelHello3 = new JLabel("Width");
        labelHello3.setBounds(20, 120, 150, 30);
        add(labelHello3);

        lbl = new JLabel("Volume of Cuboid ");
        lbl.setBounds(20, 170, 150, 30);
        add(lbl);

        jb1 = new JButton("=");
        jb1.setBounds(90, 240, 50, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        float a = Float.parseFloat(jt1.getText());
        float b = Float.parseFloat(jt2.getText());
        float d = Float.parseFloat(jt3.getText());
        float c;

        if (e.getSource().equals(jb1)) {
            c = (a * b * d);
            labelHello2.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        VolumeOfCuboid addTwoNumbers = new VolumeOfCuboid();
    }
}