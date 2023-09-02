import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terminos extends JFrame implements ActionListener, ChangeListener {
    private JLabel label1, label2;
    private JTextArea tArea;
    private JScrollPane scroll;
    private JCheckBox box;
    private JButton button1, button2;
    public String trabajador = "";

    public Terminos() {
        // Interfas
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        trabajador = Bienvenida.nombre;
        // label 1
        ImageIcon imagen = new ImageIcon("C:/Users/Estudiante/Desktop/Proyecto/images/coca-cola.png");
        label1 = new JLabel(imagen);
        label1.setBounds(305, 125, 300, 300);
        add(label1);
        // label 2
        label2 = new JLabel("Terminos y Condiciones");
        label2.setBounds(215, 5, 200, 30);
        label2.setFont(new Font("Andale Mono", 1, 14));
        label2.setForeground(new Color(0, 0, 0));
        add(label2);
        // Texto
        tArea = new JTextArea();
        tArea.setEditable(false);
        tArea.setFont(new Font("Andale Mono", 0, 9));
        tArea.setText("\n\n          TERMINOS Y CONDICIONES" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION FUERA DEL JESUS OCAÑA ROJAS." +
                "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                "\n            C.  EL AUTOR NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"
                +
                "\n          (EL AUTOR CZAR), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"
                +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS.");
        scroll = new JScrollPane(tArea);
        scroll.setBounds(10, 40, 575, 190);
        add(scroll);
        // Box
        box = new JCheckBox("Yo " + trabajador + " acepto");
        box.setBounds(10, 250, 300, 30);
        box.addChangeListener(this);
        add(box);
        // Boton 1
        button1 = new JButton("Aceptar");
        button1.setBounds(10, 280, 100, 30);
        button1.setBackground(new Color(255, 255, 255));
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);
        // Boton 2
        button2 = new JButton("No aceptar");
        button2.setBounds(120, 280, 100, 30);
        button2.setBackground(new Color(255, 255, 255));
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

    }

    // Evento Botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            Principal gui = new Principal();
            gui.setBounds(0, 0, 700, 600);
            gui.setVisible(true);
            gui.setResizable(false);
            gui.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == button2) {
            Bienvenida gui = new Bienvenida();
            gui.setBounds(0, 0, 350, 450);
            gui.setVisible(true);
            gui.setResizable(false);
            gui.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public void stateChanged(ChangeEvent e) {
        if (box.isSelected() == true) {
            button1.setEnabled(true);
            button2.setEnabled(false);
        }
        if (box.isSelected() == false) {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }
/// Main
    public static void main(String args[]) {
        Terminos gui = new Terminos();
        gui.setBounds(0, 0, 600, 360);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        
    }
}
