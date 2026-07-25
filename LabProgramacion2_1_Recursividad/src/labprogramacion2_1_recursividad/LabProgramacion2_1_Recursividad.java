package labprogramacion2_1_recursividad;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabProgramacion2_1_Recursividad implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel_boton = new JPanel();
    JButton[] botones = new JButton[30];

    JLabel nombre = new JLabel();
    JTextField campo_nombre = new JTextField(20);
    JPanel panel_superior = new JPanel();

    JPanel panel_inferior = new JPanel();
    JButton s_ticket = new JButton();
    JButton c_ticket = new JButton();
    JButton dispatch = new JButton();
    JButton p_passenger = new JButton();
    JButton v_income = new JButton();
    JButton s_passenger = new JButton();

    public LabProgramacion2_1_Recursividad() {

        frame.setTitle("MainApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1600, 900);
        frame.getContentPane().setBackground(new Color(39, 34, 40));
        frame.setLocationRelativeTo(null);

        panel_boton.setLayout(new GridLayout(5, 6));
        panel_boton.setBackground(BLACK);

        for (int i = 0; i < 30; i++) {

            botones[i] = new JButton();
            String num = String.valueOf(i + 1);
            botones[i].setText(num);
            panel_boton.add(botones[i]);
            botones[i].addActionListener(this);

        }

        s_ticket.setText("Sell Ticket");
        c_ticket.setText("Cancel Ticket");
        dispatch.setText("Dispatch");
        p_passenger.setText("Print Passengers");
        v_income.setText("View Income");
        s_passenger.setText("Search Passenger");

        s_ticket.addActionListener(this);
        c_ticket.addActionListener(this);
        dispatch.addActionListener(this);
        p_passenger.addActionListener(this);
        v_income.addActionListener(this);
        s_passenger.addActionListener(this);

        panel_inferior.setLayout(new GridLayout(1, 6));
        panel_inferior.add(s_ticket);
        panel_inferior.add(c_ticket);
        panel_inferior.add(dispatch);
        panel_inferior.add(p_passenger);
        panel_inferior.add(v_income);
        panel_inferior.add(s_passenger);

        nombre.setText("Nombre de Pasajero");
        panel_superior.add(nombre);
        panel_superior.add(campo_nombre);
        frame.add(panel_superior, BorderLayout.NORTH);

        
        frame.add(panel_boton, BorderLayout.CENTER);
        frame.add(panel_inferior, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < botones.length; i++) {
            if (e.getSource() == botones[i]) {

                System.out.println("Print prueba asiento : " + i);

                break;

            }

        }

        if (e.getSource() == s_ticket) {
            System.out.println("prueba vender ticket");
        }

        if (e.getSource() == c_ticket) {

        }

        if (e.getSource() == dispatch) {

        }

        if (e.getSource() == p_passenger) {

        }

        if (e.getSource() == v_income) {

        }

        if (e.getSource() == s_passenger) {

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        LabProgramacion2_1_Recursividad app = new LabProgramacion2_1_Recursividad();

    }

}
