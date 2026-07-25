/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion2_1_recursividad;

import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aluk
 */
public class MiVentana implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel_boton = new JPanel();
    JButton[] botones = new JButton[30];

    public MiVentana() {
        frame.setTitle("MainApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1600, 900);
        frame.getContentPane().setBackground(new Color(39, 34, 40));
        frame.setLocationRelativeTo(null);

        panel_boton.setLayout(new GridLayout(5, 6));
        panel_boton.setBackground(BLACK);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                botones[i] = new JButton();
                panel_boton.add(botones[i]);
                botones[i].addActionListener(this);

            }

        }

        frame.add(panel_boton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
