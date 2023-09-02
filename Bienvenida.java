import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4, label5;
    private JTextField textField1, textField2;
    private JButton button;
    public static String pass = "", nombre = "";

    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Display
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        // Label 1
        ImageIcon imagen = new ImageIcon("C:/Users/Estudiante/Desktop/Proyecto/images/logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25, 25, 300, 150);
        add(label1);
        // Label 2
        label2 = new JLabel("Sistema De Control de Coca Cola");
        label2.setBounds(32, 155, 300, 30);
        label2.setFont(new Font("Anadale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);
        // Label 3
        label3 = new JLabel("Ingrese su nombre:");
        label3.setBounds(45, 200, 200, 30);
        label3.setFont(new Font("Anadale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);
        // Label 4
        label4 = new JLabel("©2023 The Coca-Cola Company.");
        label4.setBounds(85, 380, 300, 30);
        label4.setFont(new Font("Anadale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);
        // Label 5
        label5 = new JLabel("Contraseña:");
        label5.setBounds(45, 250, 200, 30);
        label5.setFont(new Font("Anadale Mono", 1, 12));
        label5.setForeground(new Color(255, 255, 255));
        add(label5);
        // TextFile1
        textField1 = new JTextField();
        textField1.setBounds(45, 225, 255, 25);
        textField1.setBackground(new Color(255, 255, 255));
        textField1.setFont(new Font("Anadale Mono", 1, 14));
        textField1.setForeground(new Color(0, 0, 0));
        add(textField1);
        // TextFile2
        textField2 = new JTextField();
        textField2.setBounds(45, 275, 255, 25);
        textField2.setBackground(new Color(255, 255, 255));
        textField2.setFont(new Font("Anadale Mono", 1, 14));
        textField2.setForeground(new Color(0, 0, 0));
        add(textField2);
        // Boton
        button = new JButton("Ingresar");
        button.setBounds(45, 315, 100, 30);
        button.setBackground(new Color(255, 255, 255));
        button.setFont(new Font("Anadale Mono", 1, 14));
        button.setForeground(new Color(0, 0, 0));
        button.addActionListener(this);
        add(button);
    }

    // Evento
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            nombre = textField1.getText().trim();
            pass = textField2.getText().trim();

            if (nombre.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Hay espacios vacios");
            } else if ((!nombre.equals("")) && (!pass.equals(""))) {
                Terminos gui = new Terminos();
                gui.setBounds(0, 0, 600, 360);
                gui.setVisible(true);
                gui.setResizable(false);
                gui.setLocationRelativeTo(null);
                this.setVisible(false);

            }
        }
    }

    /// Main
    public static void main(String args[]) {
        Bienvenida gui = new Bienvenida();
        gui.setBounds(0, 0, 350, 450);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
    }
}
