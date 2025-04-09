import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

class Usuario {
    private String nombre;
    private String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

}

public class ProyectoZAL01  {
    public static void main(String[] args) {
        Queue<Usuario> usuariosRegistrados = new LinkedList<>();
        JFrame frame = new JFrame("Pixel Store");
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);//agregar color al JFrame
        frame.setLayout(null);

        ImageIcon imag = new ImageIcon("C:\\Github\\PROYECTO-PE\\icontienda[1].png");
        JLabel etiquetaimagen = new JLabel(imag);

         //agregar imagen al JFrame
         frame.add(etiquetaimagen);
         frame.setLayout(null);

         JLabel textoLabel = new JLabel("Bienvenidos a...");
         JLabel texLabel = new JLabel("Pixel Store"); 
         textoLabel.setForeground(Color.WHITE); // Cambiar el color del texto a blanco
         textoLabel.setBounds(100, 40, 200, 50); // Establecer la posición del texto
         texLabel.setForeground(Color.WHITE); 
         texLabel.setBounds(110, 150, 200, 50); 
           
         // Agregar el texto al frame
         frame.add(textoLabel);
         frame.add(texLabel);

        // Componentes
        JButton boton1 = new JButton("Iniciar Sesión");
        JButton boton2 = new JButton("Registrase");

        // Posiciones de los componentes 
        boton1.setBounds(40, 250, 200, 30);
        boton2.setBounds(40, 300, 200, 30);
        etiquetaimagen.setBounds(90,70, 100, 100);

        // Agregar componentes al frame
        frame.add(boton1);
        frame.add(boton2);

        // Acción del botón "Registrarse"
// Acción del botón "Registrarse"
boton2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame registroFrame = new JFrame("Registro");
        registroFrame.setSize(300, 500);
        registroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroFrame.getContentPane().setBackground(Color.BLACK);
        registroFrame.setLayout(null);

        ImageIcon imag = new ImageIcon("C:\\Github\\PROYECTO-PE\\icontienda[1].png");
        JLabel etiquetaimagen = new JLabel(imag);
        etiquetaimagen.setBounds(90, 30, 100, 100);

        JLabel mensLabel = new JLabel("Regístrate en Pixel Store"); 
        mensLabel.setForeground(Color.WHITE);
        mensLabel.setBounds(65, 130, 200, 25); 

        JLabel NomusuLabel = new JLabel("Usuario:");
        JLabel ContraLabel = new JLabel("Contraseña:");
        

        JTextField NomusuField = new JTextField();
        JTextField ContraField = new JTextField();
        

        ContraLabel.setForeground(Color.WHITE);  
        NomusuLabel.setForeground(Color.WHITE);

        JButton registrarButton = new JButton("Registrar");

        NomusuLabel.setBounds(30, 220, 80, 25);
        NomusuField.setBounds(100, 220, 150, 25);
        ContraLabel.setBounds(30, 260, 80, 25);
        ContraField.setBounds(100, 260, 150, 25);
        registrarButton.setBounds(80, 310, 120, 30);

        registroFrame.add(etiquetaimagen);
        registroFrame.add(mensLabel);
        registroFrame.add(ContraLabel);
        registroFrame.add(NomusuLabel);
        registroFrame.add(ContraField);
        registroFrame.add(NomusuField);
        registroFrame.add(registrarButton);

        // Listener único del botón Registrar
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contraseña = ContraField.getText();
                String nombreUsuario = NomusuField.getText();

                // Validar campos vacíos
                if (contraseña.isEmpty() || nombreUsuario.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor completa todos los campos.");
                    return;
                }

                // Verificar si ya existe el usuario
                for (Usuario u : usuariosRegistrados) {
                    if (u.getNombre().equals(nombreUsuario)) {
                        JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya está registrado.");
                        return;
                    }
                }

                // Crear y guardar usuario en la cola
                Usuario nuevoUsuario = new Usuario(nombreUsuario, contraseña);
                usuariosRegistrados.add(nuevoUsuario);

                JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
                registroFrame.dispose();
                frame.setVisible(true);
            }
        });

        registroFrame.setVisible(true);
    }
});


       // Acción del botón "Iniciar sesión"
boton1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame InicioFrame = new JFrame("Inicio de Sesión");
        InicioFrame.setSize(300, 500);
        InicioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InicioFrame.getContentPane().setBackground(Color.BLACK);
        InicioFrame.setLayout(null);

        ImageIcon imag = new ImageIcon("C:\\Github\\PROYECTO-PE\\icontienda[1].png");
        JLabel etiquetaimagen= new JLabel(imag);
        etiquetaimagen.setBounds(15, 30, 100, 100);

        JLabel inLabel = new JLabel("Pixel Store"); 
        inLabel.setForeground(Color.WHITE);
        inLabel.setBounds(120, 20, 150, 150); 

        JLabel UsuaLabel = new JLabel("Usuario:");
        JLabel CtraLabel = new JLabel("Contraseña:");
     
        JTextField UsuaField = new JTextField();
        JTextField CtraField = new JPasswordField();

        UsuaLabel.setForeground(Color.WHITE); 
        CtraLabel.setForeground(Color.WHITE); 

        JButton IniciarSButton = new JButton("Iniciar");

        UsuaLabel.setBounds(30, 150, 80, 25);
        UsuaField.setBounds(100, 150, 150, 25);
        CtraLabel.setBounds(30, 200, 80, 25);
        CtraField.setBounds(100, 200, 150, 25);
        IniciarSButton.setBounds(80, 300, 120, 30);

        InicioFrame.add(inLabel);
        InicioFrame.add(etiquetaimagen);
        InicioFrame.add(UsuaLabel);
        InicioFrame.add(CtraLabel);
        InicioFrame.add(UsuaField);
        InicioFrame.add(CtraField);
        InicioFrame.add(IniciarSButton);

        // Listener único y funcional del botón "Iniciar"
        IniciarSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioIngresado = UsuaField.getText();
                String contraseñaIngresada = CtraField.getText();

                boolean encontrado = false;
                for (Usuario u : usuariosRegistrados) {
                    if (u.getNombre().equals(usuarioIngresado) && u.getContraseña().equals(contraseñaIngresada)) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    JOptionPane.showMessageDialog(null, "¡Inicio de sesión exitoso!");
                    InicioFrame.dispose();

                    JFrame InFrame = new JFrame("Pixel Store - Menú");
                    InFrame.setSize(300, 500);
                    InFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    InFrame.getContentPane().setBackground(Color.BLACK);
                    InFrame.setLayout(null);

                    JLabel etiquetaimagen2 = new JLabel(imag);
                    etiquetaimagen2.setBounds(90, 30, 100, 100);

                    JButton catalogo = new JButton("Catálogo");
                    JButton ofer = new JButton("Oferta");
                    JButton mem = new JButton("Membresías");

                    catalogo.setBounds(10, 150, 120, 30);
                    ofer.setBounds(10, 200, 120, 30);
                    mem.setBounds(10, 250, 120, 30);

                    InFrame.add(etiquetaimagen2);
                    InFrame.add(catalogo);
                    InFrame.add(ofer);
                    InFrame.add(mem);
                    InFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });

        InicioFrame.setVisible(true);
    }
});
        // Mostrar la ventana
        frame.setVisible(true);     
    }
}