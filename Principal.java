import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener {
    // Definir
    private JLabel labelLogo, labelTitle, labelSubtitle, labelNom, labelPa, labelMa,
            labelDepar, labelAnti, labelResult, labelCoca, presionar, labelEx;
    private JMenuBar bar;
    private JMenu opciones, calcular, acercaDe, color;
    private JMenuItem rojo, negro, morado, salir, nuevo, vacaciones, creador, salario, redes, horario;
    private JTextField txtNom, txtPa, txtMa, txtExtra;
    private JTextArea calculo;
    private JScrollPane scroll;
    private JComboBox<String> departa, antiguedad;
    private JButton botonVaca, botonSala, botonHora;
    public String trabajador = "";

    public Principal() {
        // Interfas
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        trabajador = Bienvenida.nombre;
        /// JLabels
        // label logo
        ImageIcon imagen = new ImageIcon("C:/Users/Estudiante/Desktop/Proyecto/images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);
        // label titulo
        labelTitle = new JLabel("Bienvenido " + trabajador);
        labelTitle.setFont(new Font("Andale Mono", 1, 32));
        labelTitle.setForeground(new Color(255, 255, 255));
        labelTitle.setBounds(280, 35, 300, 50);
        add(labelTitle);
        // label subtitulo
        labelSubtitle = new JLabel("Datos del trabajador para el calculo de aplicaciones");
        labelSubtitle.setBounds(45, 140, 900, 25);
        labelSubtitle.setFont(new Font("Andale Mono", 1, 24));
        labelSubtitle.setForeground(new Color(255, 255, 255));
        add(labelSubtitle);
        // label nombre
        labelNom = new JLabel("Nombre del trabajador:");
        labelNom.setBounds(25, 188, 180, 25);
        labelNom.setFont(new Font("Andale Mono", 1, 12));
        labelNom.setForeground(new Color(255, 255, 255));
        add(labelNom);
        // label extras
        labelEx = new JLabel("Horas Extras:");
        labelEx.setVisible(false);
        labelEx.setBounds(470, 188, 180, 25);
        labelEx.setFont(new Font("Andale Mono", 1, 12));
        labelEx.setForeground(new Color(255, 255, 255));
        add(labelEx);
        // label apellido paterno
        labelPa = new JLabel("Apellido Paterno:");
        labelPa.setBounds(25, 248, 180, 25);
        labelPa.setFont(new Font("Andale Mono", 1, 12));
        labelPa.setForeground(new Color(255, 255, 255));
        add(labelPa);
        // label apellido materno
        labelMa = new JLabel("Apellido Materno:");
        labelMa.setBounds(25, 308, 180, 25);
        labelMa.setFont(new Font("Andale Mono", 1, 12));
        labelMa.setForeground(new Color(255, 255, 255));
        add(labelMa);
        // label Presionar
        presionar = new JLabel("Presiona para calcular:");
        presionar.setBounds(25, 365, 180, 25);
        presionar.setFont(new Font("Andale Mono", 1, 12));
        presionar.setForeground(new Color(255, 255, 255));
        add(presionar);
        // label Departamento
        labelDepar = new JLabel("Selecciona el Departamento:");
        labelDepar.setBounds(220, 188, 180, 25);
        labelDepar.setFont(new Font("Andele Mono", 1, 12));
        labelDepar.setForeground(new Color(255, 255, 255));
        add(labelDepar);
        // label Antiguedad
        labelAnti = new JLabel("Selecciona la Antiguedad:");
        labelAnti.setBounds(220, 248, 180, 25);
        labelAnti.setFont(new Font("Andele Mono", 1, 12));
        labelAnti.setForeground(new Color(255, 255, 255));
        add(labelAnti);
        // label Respuesta
        labelResult = new JLabel("Resultado del calculo:");
        labelResult.setBounds(220, 307, 180, 25);
        labelResult.setFont(new Font("Andele Mono", 1, 12));
        labelResult.setForeground(new Color(255, 255, 255));
        add(labelResult);
        // label coca
        labelCoca = new JLabel("©2023 The Coca-Cola Company|Todos los derechos reservados");
        labelCoca.setBounds(135, 400, 500, 132);
        labelCoca.setFont(new Font("Andele Mono", 1, 12));
        labelCoca.setForeground(new Color(255, 255, 255));
        add(labelCoca);
        /// Menus
        // Barra
        bar = new JMenuBar();
        bar.setBackground(new Color(255, 0, 0));
        setJMenuBar(bar);
        // Opciones
        opciones = new JMenu("Opciones");
        opciones.setBackground(new Color(255, 0, 0));
        opciones.setFont(new Font("Andele Mono", 1, 14));
        opciones.setForeground(new Color(255, 255, 255));
        bar.add(opciones);
        // Calcular
        calcular = new JMenu("Tipos de calculos");
        calcular.setBackground(new Color(255, 0, 0));
        calcular.setFont(new Font("Andele Mono", 1, 14));
        calcular.setForeground(new Color(255, 255, 255));
        bar.add(calcular);
        // Acerca de
        acercaDe = new JMenu("Acerca de");
        acercaDe.setBackground(new Color(255, 255, 255));
        acercaDe.setFont(new Font("Andele Mono", 1, 14));
        acercaDe.setForeground(new Color(255, 255, 255));
        bar.add(acercaDe);
        // Color
        color = new JMenu("Color");
        color.setBackground(new Color(255, 0, 0));
        color.setFont(new Font("Andele Mono", 1, 14));
        color.setForeground(new Color(0, 0, 0));
        opciones.add(color);
        /// Menu Items
        // Rojo
        rojo = new JMenuItem("Rojo");
        rojo.setBackground(new Color(255, 255, 255));
        rojo.setFont(new Font("Andele Mono", 1, 14));
        rojo.setForeground(new Color(0, 0, 0));
        rojo.addActionListener(this);
        color.add(rojo);
        // Negro
        negro = new JMenuItem("Negro");
        negro.setBackground(new Color(255, 255, 255));
        negro.setFont(new Font("Andele Mono", 1, 14));
        negro.setForeground(new Color(0, 0, 0));
        negro.addActionListener(this);
        color.add(negro);
        // Morado
        morado = new JMenuItem("Morado");
        morado.setBackground(new Color(255, 255, 255));
        morado.setFont(new Font("Andele Mono", 1, 14));
        morado.setForeground(new Color(0, 0, 0));
        morado.addActionListener(this);
        color.add(morado);
        // Nuevo
        nuevo = new JMenuItem("Nuevo");
        nuevo.setBackground(new Color(255, 255, 255));
        nuevo.setFont(new Font("Andele Mono", 1, 14));
        nuevo.setForeground(new Color(0, 0, 0));
        nuevo.addActionListener(this);
        opciones.add(nuevo);
        // Salir
        salir = new JMenuItem("Salir");
        salir.setBackground(new Color(255, 255, 255));
        salir.setFont(new Font("Andele Mono", 1, 14));
        salir.setForeground(new Color(0, 0, 0));
        salir.addActionListener(this);
        opciones.add(salir);
        // Salario
        salario = new JMenuItem("Salario");
        salario.setBackground(new Color(255, 255, 255, 255));
        salario.setFont(new Font("Andale Mono", 1, 14));
        salario.setForeground(new Color(0, 0, 0));
        salario.addActionListener(this);
        calcular.add(salario);
        // Vacaciones
        vacaciones = new JMenuItem("Vacaciones");
        vacaciones.setBackground(new Color(255, 255, 255));
        vacaciones.setFont(new Font("Andele Mono", 1, 14));
        vacaciones.setForeground(new Color(0, 0, 0));
        vacaciones.addActionListener(this);
        calcular.add(vacaciones);
        // Horario
        horario = new JMenuItem("Horario");
        horario.setBackground(new Color(255, 255, 255));
        horario.setFont(new Font("Andele Mono", 1, 14));
        horario.setForeground(new Color(0, 0, 0));
        horario.addActionListener(this);
        calcular.add(horario);
        // Redes
        redes = new JMenuItem("Redes");
        redes.setBackground(new Color(255, 255, 255));
        redes.setFont(new Font("Andele Mono", 1, 14));
        redes.setForeground(new Color(0, 0, 0));
        redes.addActionListener(this);
        acercaDe.add(redes);
        // Creador
        creador = new JMenuItem("Creador");
        creador.setBackground(new Color(255, 255, 255));
        creador.setFont(new Font("Andele Mono", 1, 14));
        creador.setForeground(new Color(0, 0, 0));
        creador.addActionListener(this);
        acercaDe.add(creador);
        /// Botones
        // Boton Vacaciones
        botonVaca = new JButton("Calcular");
        botonVaca.setEnabled(false);
        botonVaca.setBounds(25, 395, 125, 30);
        botonVaca.setBackground(new Color(255, 255, 255));
        botonVaca.setFont(new Font("Andele Mono", 1, 14));
        botonVaca.setForeground(new Color(0, 0, 0));
        botonVaca.addActionListener(this);
        add(botonVaca);
        // Boton Salario
        botonSala = new JButton("Calcular");
        botonSala.setBounds(25, 395, 125, 30);
        botonSala.setBackground(new Color(255, 255, 255));
        botonSala.setFont(new Font("Andele Mono", 1, 14));
        botonSala.setVisible(false);
        botonSala.setForeground(new Color(0, 0, 0));
        botonSala.addActionListener(this);
        add(botonSala);
        // Boton Horario
        botonHora = new JButton("Calcular");
        botonHora.setBounds(25, 395, 125, 30);
        botonHora.setBackground(new Color(255, 255, 255));
        botonHora.setFont(new Font("Andele Mono", 1, 14));
        botonHora.setVisible(false);
        botonHora.setForeground(new Color(0, 0, 0));
        botonHora.addActionListener(this);
        add(botonHora);
        /// Ingreso de texto
        // Extras
        txtExtra = new JTextField("0");
        txtExtra.setEditable(false);
        txtExtra.setVisible(false);
        txtExtra.setBounds(470, 213, 150, 25);
        txtExtra.setBackground(new Color(255, 255, 255));
        txtExtra.setFont(new Font("Andele Mono", 1, 14));
        txtExtra.setForeground(new Color(0, 0, 0));
        txtExtra.addActionListener(this);
        add(txtExtra);
        // Nombre
        txtNom = new JTextField();
        txtNom.setEditable(false);
        txtNom.setBounds(25, 213, 150, 25);
        txtNom.setBackground(new Color(255, 255, 255));
        txtNom.setFont(new Font("Andele Mono", 1, 14));
        txtNom.setForeground(new Color(0, 0, 0));
        txtNom.addActionListener(this);
        add(txtNom);
        // Apellido paterno
        txtPa = new JTextField();
        txtPa.setEditable(false);
        txtPa.setBounds(25, 273, 150, 25);
        txtPa.setBackground(new Color(255, 255, 255));
        txtPa.setFont(new Font("Andele Mono", 1, 14));
        txtPa.setForeground(new Color(0, 0, 0));
        txtPa.addActionListener(this);
        add(txtPa);
        // Apellido materno
        txtMa = new JTextField();
        txtMa.setEditable(false);
        txtMa.setBounds(25, 334, 150, 25);
        txtMa.setBackground(new Color(255, 255, 255));
        txtMa.setFont(new Font("Andele Mono", 1, 14));
        txtMa.setForeground(new Color(0, 0, 0));
        txtMa.addActionListener(this);
        add(txtMa);
        /// Calculo
        calculo = new JTextArea();
        calculo.setEditable(false);
        calculo.setText("\n    Aqui aparece el resultado" +
                "\n    Seleccione el tipo de calculo");
        calculo.setFont(new Font("Andele Mono", 1, 14));
        calculo.setBackground(new Color(255, 255, 255));
        calculo.setForeground(new Color(0, 0, 0));
        scroll = new JScrollPane(calculo);
        scroll.setBounds(220, 333, 385, 90);
        add(scroll);
        /// Combo box
        // Departamento
        departa = new JComboBox<>();
        departa.setEnabled(false);
        departa.setBounds(220, 213, 220, 25);
        departa.setFont(new Font("Andele Mono", 1, 14));
        departa.setBackground(new Color(255, 255, 255));
        departa.setForeground(new Color(0, 0, 0));
        departa.addActionListener(this);
        add(departa);
        departa.addItem("");
        departa.addItem("Atencion al Cliente");
        departa.addItem("Departamento de Logistica");
        departa.addItem("Departamento de Gerencia");
        // Antiguedad
        antiguedad = new JComboBox<>();
        antiguedad.setEnabled(false);
        antiguedad.setBounds(220, 273, 220, 25);
        antiguedad.setFont(new Font("Andele Mono", 1, 14));
        antiguedad.setForeground(new Color(0, 0, 0));
        antiguedad.addActionListener(this);
        antiguedad.setBackground(new Color(255, 255, 255));
        add(antiguedad);
        antiguedad.addItem("");
        antiguedad.addItem("1 año de trabajo");
        antiguedad.addItem("2 a 6 años de trabajo");
        antiguedad.addItem("Más de 7 años de trabajo");
    }

    /// Eventos
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonVaca) {
            // Variables
            botonVaca.setVisible(true);
            botonSala.setVisible(false);
            botonHora.setVisible(false);
            String nom = txtNom.getText();
            String aP = txtPa.getText();
            String aM = txtMa.getText();
            String dep = departa.getSelectedItem().toString();
            String anti = antiguedad.getSelectedItem().toString();
            // Condiciones
            if (nom.equals("") || aP.equals("") || aM.equals("") || dep.equals("") || anti.equals("")) {
                JOptionPane.showMessageDialog(null, "Aun hay espacios vacios.");
            } else {
                if (dep.equals("Atencion al Cliente")) {
                    if (anti.equals("1 año de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 6 dias de vacaciones.");
                    }
                    if (anti.equals("2 a 6 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 14 dias de vacaciones.");
                    }
                    if (anti.equals("Más de 7 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 20 dias de vacaciones.");
                    }
                }
                if (dep.equals("Departamento de Logistica")) {
                    if (anti.equals("1 año de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 7 dias de vacaciones.");
                    }
                    if (anti.equals("2 a 6 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 15 dias de vacaciones.");
                    }
                    if (anti.equals("Más de 7 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 22 dias de vacaciones.");
                    }
                }
                if (dep.equals("Departamento de Gerencia")) {
                    if (anti.equals("1 año de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 10 dias de vacaciones.");
                    }
                    if (anti.equals("2 a 6 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 20 dias de vacaciones.");
                    }
                    if (anti.equals("Más de 7 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe 30 dias de vacaciones.");
                    }
                }
            }
        }
        if (e.getSource() == botonSala) {
            // Variables
            String nom = txtNom.getText();
            String aP = txtPa.getText();
            String aM = txtMa.getText();
            String ex = txtExtra.getText();
            int ext = Integer.parseInt(ex);
            String dep = departa.getSelectedItem().toString();
            String anti = antiguedad.getSelectedItem().toString();
            // Condiciones
            if (nom.equals("") || aP.equals("") || aM.equals("") || dep.equals("") || anti.equals("")) {
                JOptionPane.showMessageDialog(null, "Aun hay espacios vacios.");
            } else {
                if (dep.equals("Atencion al Cliente")) {
                    if (anti.equals("1 año de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (495762 / 80) + 495762) + " de salario.");
                    }
                    if (anti.equals("2 a 6 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (532154 / 80) + 532154) + " de salario.");
                    }
                    if (anti.equals("Más de 7 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (617961 / 80) + 617961) + " de salario.");
                    }
                }
                if (dep.equals("Departamento de Logistica")) {
                    if (anti.equals("1 año de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (638602 / 80) + 638602) + " de salario.");
                    }
                    if (anti.equals("2 a 6 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (763192 / 80) + 763192) + " de salario.");
                    }
                    if (anti.equals("Más de 7 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (864321 / 80) + 864321) + " de salario.");
                    }
                }
                if (dep.equals("Departamento de Gerencia")) {
                    if (anti.equals("1 año de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (910338 / 80) + 910338) + " de salario.");
                    }
                    if (anti.equals("2 a 6 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (1210338 / 80) + 1210338) + " de salario.");
                    }
                    if (anti.equals("Más de 7 años de trabajo")) {
                        calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                                "\n   quien trabaja en " + dep +
                                "\n   recibe ₡" + (ext * (2655016 / 80) + 2655016) + " de salario.");
                    }
                }
            }
        }
        if (e.getSource() == botonHora) {
            // Variables
            String nom = txtNom.getText();
            String aP = txtPa.getText();
            String aM = txtMa.getText();
            String dep = departa.getSelectedItem().toString();

            // Condiciones
            if (nom.equals("") || aP.equals("") || aM.equals("") || dep.equals("")) {
                JOptionPane.showMessageDialog(null, "Aun hay espacios vacios.");
            } else {
                if (dep.equals("Atencion al Cliente")) {
                    calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                            "\n   quien trabaja en " + dep +
                            "\n   tiene el horario de 8am a 5pm.");
                }
                if (dep.equals("Departamento de Logistica")) {
                    calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                            "\n   quien trabaja en " + dep +
                            "\n   tiene el horario de 7am a 8pm.");
                }
                if (dep.equals("Departamento de Gerencia")) {
                    calculo.setText("\n   El trabajador " + nom + " " + aP + " " + aM +
                            "\n   quien trabaja en " + dep +
                            "\n   tiene el horario de 8am a 4pm.");
                }
            }
        }
        if (e.getSource() == vacaciones) {
            // botones
            botonVaca.setEnabled(true);
            botonSala.setVisible(false);
            botonVaca.setVisible(true);
            botonHora.setVisible(false);
            // label
            labelEx.setVisible(false);
            labelAnti.setVisible(true);
            labelResult.setBounds(220, 307, 180, 25);
            // text field
            txtNom.setText("");
            txtMa.setText("");
            txtPa.setText("");
            txtExtra.setText("");
            txtExtra.setVisible(false);
            txtExtra.setEditable(false);
            txtNom.setEditable(true);
            txtMa.setEditable(true);
            txtPa.setEditable(true);
            // combo box
            departa.setEnabled(true);
            departa.setSelectedIndex(0);
            antiguedad.setSelectedIndex(0);
            antiguedad.setEnabled(true);
            antiguedad.setVisible(true);
            // text area
            scroll.setBounds(220, 333, 385, 90);
            calculo.setText("\n    Aqui aparece el resultado");
        }
        if (e.getSource() == salario) {
            // botones
            botonSala.setVisible(true);
            botonVaca.setVisible(false);
            botonHora.setVisible(false);
            // combo box
            antiguedad.setVisible(true);
            antiguedad.setSelectedIndex(0);
            antiguedad.setEnabled(true);
            departa.setSelectedIndex(0);
            departa.setEnabled(true);
            // text field
            txtNom.setText("");
            txtMa.setText("");
            txtPa.setText("");
            txtExtra.setText("0");
            txtExtra.setVisible(true);
            txtExtra.setEditable(true);
            txtNom.setEditable(true);
            txtMa.setEditable(true);
            txtPa.setEditable(true);
            // label
            labelEx.setVisible(true);
            labelAnti.setVisible(true);
            labelResult.setBounds(220, 307, 180, 25);
            // text area
            scroll.setBounds(220, 333, 385, 90);
            calculo.setText("\n    Aqui aparece el resultado");
        }
        if (e.getSource() == horario) {
            // Botones
            botonSala.setVisible(false);
            botonVaca.setVisible(false);
            botonHora.setVisible(true);
            // label
            labelEx.setVisible(false);
            labelAnti.setVisible(false);
            labelResult.setBounds(220, 250, 180, 25);
            // text field
            txtExtra.setText("");
            txtExtra.setVisible(false);
            txtExtra.setEditable(false);
            txtNom.setText("");
            txtMa.setText("");
            txtPa.setText("");
            txtNom.setEditable(true);
            txtMa.setEditable(true);
            txtPa.setEditable(true);
            // combo box
            departa.setEnabled(true);
            departa.setSelectedIndex(0);
            antiguedad.setSelectedIndex(0);
            antiguedad.setVisible(false);
            // text area
            scroll.setBounds(220, 273, 385, 90);
            calculo.setText("\n    Aqui aparece el resultado");

        }
        if (e.getSource() == rojo) {
            getContentPane().setBackground(new Color(255, 0, 0));
            bar.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == negro) {
            getContentPane().setBackground(new Color(0, 0, 0));
            bar.setBackground(new Color(0, 0, 0));
        }
        if (e.getSource() == morado) {
            getContentPane().setBackground(new Color(51, 0, 51));
            bar.setBackground(new Color(51, 0, 51));
        }
        if (e.getSource() == nuevo) {
            // text Field
            txtNom.setEditable(false);
            txtMa.setEditable(false);
            txtPa.setEditable(false);
            txtExtra.setEditable(false);
            txtExtra.setVisible(false);
            txtExtra.setText("");
            txtNom.setText("");
            txtMa.setText("");
            txtPa.setText("");
            // botones
            botonVaca.setEnabled(false);
            botonVaca.setVisible(true);
            botonHora.setVisible(false);
            botonSala.setVisible(false);
            // combo box
            departa.setSelectedIndex(0);
            departa.setEnabled(false);
            antiguedad.setSelectedIndex(0);
            antiguedad.setVisible(true);
            antiguedad.setEnabled(false);
            // label
            labelEx.setVisible(false);
            labelAnti.setVisible(true);
            labelResult.setBounds(220, 307, 180, 25);
            // text area
            scroll.setBounds(220, 333, 385, 90);
            calculo.setText("\n    Aqui aparece el resultado" +
                    "\n    Seleccione el tipo de calculo");
        }
        if (e.getSource() == salir) {
            Bienvenida gui = new Bienvenida();
            gui.setBounds(0, 0, 350, 450);
            gui.setVisible(true);
            gui.setResizable(false);
            gui.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == creador) {
            JOptionPane.showMessageDialog(null, "Creada por Czar");
        }
        if (e.getSource() == redes) {
            JOptionPane.showMessageDialog(null, "https://journey.coca-cola.com/inicio-cr");

        }
    }

    /// Main
    public static void main(String args[]) {
        Principal gui = new Principal();
        gui.setBounds(0, 0, 700, 550);
        gui.setVisible(true);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
    }
}
