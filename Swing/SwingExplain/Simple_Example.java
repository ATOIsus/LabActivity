package SwingExplain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_Example extends JFrame implements ActionListener {

    JMenuBar menuJ;

    JMenu arithmeticOperation;

    JMenuItem arithmetic_add;

    Simple_Example() {


        setTitle("Menu Driven");                      // The title of the window.
        setLayout(null);                              //
        setSize(600, 400);                // Size of the window.
        setVisible(true);                             // Display the window,
        setResizable(false);                          // Cannot Maximize/Minimize window.
        setDefaultCloseOperation(EXIT_ON_CLOSE);      // Window exits when close button is closed.
        getContentPane().setBackground(Color.BLACK);  // Background Color.

        // Insert a Menu Bar.

        menuJ = new JMenuBar();                              // Initializing the JMenuBar object.
        // Set bound is not needed.
        menuJ.setBackground(Color.ORANGE);
        add(menuJ);                                          // Adding the object in the window.


        // Adding Menu.

        arithmeticOperation = new JMenu("Arithmetic Operation");
        menuJ.add(arithmeticOperation);                              // menuJ is needed because it is the parent.

        // Adding JMenuItems for arithmeticOperation.


        arithmetic_add = new JMenuItem("Add");
        arithmeticOperation.add(arithmetic_add);


        setJMenuBar(menuJ);                           // To display menu bar and its menu. Used only once.


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static void main(String[] args) {
        new Simple_Example().setVisible(true);
    }

}
