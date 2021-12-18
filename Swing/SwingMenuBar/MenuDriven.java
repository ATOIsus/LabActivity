package SwingMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MenuDriven extends JFrame implements ActionListener {

    JMenuBar menuJ;

    JMenu arithmeticOperation;
    JMenu area;
    JMenu simpleInterest;

    JMenuItem area_triangle;
    JMenuItem area_circle;

    JMenuItem simple_Interest;

    MenuDriven() {


        setTitle("Menu Driven");                    // The title of the window.
        setLayout(null);                            //
        setSize(600, 400);              // Size of the window.
        setVisible(true);                           // Display the window,
        setResizable(false);                        // Cannot Maximize/Minimize window.
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // Window exits when close button is closed.
        getContentPane().setBackground(Color.BLACK);  // Background Color.

        // Insert a Menu Bar.

        menuJ = new JMenuBar();                              // Initializing the JMenuBar object.
        // Set bound is nor needed.
        menuJ.setBackground(Color.ORANGE);
        add(menuJ);                                          // Adding the object in the window.


        // Adding Menu.

        arithmeticOperation = new JMenu("Arithmetic Operation");
        menuJ.add(arithmeticOperation);                              // menuJ is needed because it is the parent.
        arithmeticOperation.addActionListener(this);

        area = new JMenu("Area");
        menuJ.add(area);

        simpleInterest = new JMenu("Simple Interest");
        menuJ.add(simpleInterest);


        // Adding JMenuItems for Area.


        area_triangle = new JMenuItem("Area of Triangle");
        area.add(area_triangle);
        area_triangle.addActionListener(this);

        area_circle = new JMenuItem("Area of Circle");
        area.add(area_circle);
        area_circle.addActionListener(this);


        // Adding JMenuItems for Simple Interest.


        simple_Interest = new JMenuItem("Simple Interest");
        simpleInterest.add(simple_Interest);
        simple_Interest.addActionListener(this);

        // In JDK 15, Action Listener does not work on Menu Bar, Menu and Menu Item. Add Mouse Listener is used,

        setJMenuBar(menuJ);                           // To display menu bar and its menu. Used only once.


    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(arithmeticOperation)) {
            setVisible(false);
            new MathOperation().setVisible(true);
        }

        if (e.getSource().equals(simple_Interest)) {
            setVisible(false);
            new Simple_Interest().setVisible(true);
        }

        if (e.getSource().equals(area_circle)) {
            setVisible(false);
            new AreaOfCircle().setVisible(true);
        }

        if (e.getSource().equals(area_triangle)) {
            setVisible(false);
            new AreaOfTriangle().setVisible(true);
        }



    }


    public static void main(String[] args) {
        new MenuDriven().setVisible(true);
    }

}
