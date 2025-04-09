import java.awt.*;
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
        JButton RegresarButton = new JButton("Regresar"); // Nuevo botón de regresar


        UsuaLabel.setBounds(30, 150, 80, 25);
        UsuaField.setBounds(100, 150, 150, 25);
        CtraLabel.setBounds(30, 200, 80, 25);
        CtraField.setBounds(100, 200, 150, 25);
        IniciarSButton.setBounds(80, 300, 120, 30);
        RegresarButton.setBounds(80, 350, 120, 30); 

        InicioFrame.add(inLabel);
        InicioFrame.add(etiquetaimagen);
        InicioFrame.add(UsuaLabel);
        InicioFrame.add(CtraLabel);
        InicioFrame.add(UsuaField);
        InicioFrame.add(CtraField);
        InicioFrame.add(IniciarSButton);
        InicioFrame.add(RegresarButton);

         // Listener del botón "Regresar"
         RegresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InicioFrame.dispose(); // Cierra la ventana de inicio de sesión
                frame.setVisible(true); // Muestra la ventana principal nuevamente
            }
        });


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
                    

                    // Posicionamiento horizontal alineado
                    int yPosition = 150;
                    int buttonWidth = 80;
                    int buttonHeight = 30;
                    int padding = 10;
                    int startX = (300 - (3*buttonWidth + 2*padding)) / 2;

                    catalogo.setBounds(startX, yPosition, buttonWidth, buttonHeight);
                    ofer.setBounds(startX + buttonWidth + padding, yPosition, buttonWidth, buttonHeight);
                    mem.setBounds(startX + 2*(buttonWidth + padding), yPosition, buttonWidth, buttonHeight);

                    InFrame.add(etiquetaimagen2);
                    InFrame.add(catalogo);
                    InFrame.add(ofer);
                    InFrame.add(mem);

                    //Listener para el catalogo
                    catalogo.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            InFrame.dispose(); // Cierra el menú actual
                            
                            JFrame catalogoFrame = new JFrame("Catálogo de Juegos");
                            catalogoFrame.setSize(300, 500);
                            catalogoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            catalogoFrame.getContentPane().setBackground(Color.BLACK);
                            
                            // Usamos BorderLayout para organización general
                            catalogoFrame.setLayout(new BorderLayout());
                            
                            // Título del catálogo
                            JLabel tituloLabel = new JLabel("Catálogo de Juegos", SwingConstants.CENTER);
                            tituloLabel.setForeground(Color.WHITE);
                            tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));
                            catalogoFrame.add(tituloLabel, BorderLayout.NORTH);
                            
                            // Lista de juegos con precios
                            Object[][] juegos = {
                                {"1. Zelda: Breath Wild", "$1,499.00"},
                                {"2. Red Dead Redemption 2", "$1,199.00"},
                                {"3. The Witcher 3", "$599.00"},
                                {"4. Minecraft", "699.00"},
                                {"5. GTA V", "$699.00"},
                                {"6. Cyberpunk 2077", "$1,099.00"},
                                {"7. Elden Ring", "$1,499.00"},
                                {"8. God of War", "$699.00"},
                                {"9. Mario Odyssey", "$1,499.00"},
                                {"10. COD: Warzone", "Gratis"},
                                {"11. Fortnite", "Gratis"},
                                {"12. Apex Legends", "Gratis"},
                                {"13. FIFA 24", "$1,199.00"},
                                {"14. Overwatch 2", "Gratis"},
                                {"15. Hogwarts Legacy", "$1,499.00"}
                            };
                            
                            // Panel principal con GridLayout
                            JPanel panelJuegos = new JPanel(new GridLayout(0, 2, 10, 5)); // 2 columnas
                            panelJuegos.setBackground(Color.BLACK);
                            panelJuegos.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                            
                            for (Object[] juego : juegos) {
                                JLabel nombreLabel = new JLabel(juego[0].toString());
                                nombreLabel.setForeground(Color.WHITE);
                                
                                JLabel precioLabel = new JLabel(juego[1].toString());
                                precioLabel.setForeground(Color.GREEN);
                                precioLabel.setHorizontalAlignment(SwingConstants.RIGHT);
                                
                                panelJuegos.add(nombreLabel);
                                panelJuegos.add(precioLabel);
                            }
                            
                            JScrollPane scrollPane = new JScrollPane(panelJuegos);
                            scrollPane.setBorder(null);
                            catalogoFrame.add(scrollPane, BorderLayout.CENTER);
                            
                            // Panel para el botón de regresar
                            JPanel panelBoton = new JPanel();
                            panelBoton.setBackground(Color.BLACK);
                            JButton regresarButton = new JButton("Regresar");
                            regresarButton.addActionListener(ev -> {
                                catalogoFrame.dispose();
                                InFrame.setVisible(true);
                            });
                            panelBoton.add(regresarButton);
                            catalogoFrame.add(panelBoton, BorderLayout.SOUTH);
                            
                            catalogoFrame.setVisible(true);
                        }
                    });

                    //Listener para las ofertas
                    ofer.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        InFrame.dispose(); // Cierra el menú actual
            
                        // Crear el frame de ofertas
                        JFrame ofertasFrame = new JFrame("Ofertas Especiales");
                        ofertasFrame.setSize(300, 500);
                        ofertasFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        ofertasFrame.getContentPane().setBackground(Color.BLACK);
                        ofertasFrame.setLayout(new BorderLayout());
            
                        // Título de ofertas - Amarillo brillante
                        JLabel tituloLabel = new JLabel("OFERTAS RELÁMPAGO", SwingConstants.CENTER);
                        tituloLabel.setForeground(new Color(255, 215, 0)); // Amarillo dorado
                        tituloLabel.setFont(new Font("Arial", Font.BOLD, 18));
                        tituloLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
                        ofertasFrame.add(tituloLabel, BorderLayout.NORTH);
                        
                        // Lista completa de juegos (los mismos del catálogo)
                        Object[][] todosJuegos = {
                            {"The Legend of Zelda", "$1,499.00"},
                            {"Red Dead Redemption 2", "$1,199.00"},
                            {"The Witcher 3", "$599.00"},
                            {"Minecraft", "$699.00"},
                            {"GTA V", "$699.00"},
                            {"Cyberpunk 2077", "$1,099.00"},
                            {"Elden Ring", "$1,499.00"},
                            {"God of War", "$699.00"},
                            {"Mario Odyssey", "$1,499.00"},
                            {"COD: Warzone", "Gratis"},
                            {"Fortnite", "Gratis"},
                            {"Apex Legends", "Gratis"},
                            {"FIFA 24", "$1,199.00"},
                            {"Overwatch 2", "Gratis"},
                            {"Hogwarts Legacy", "$1,499.00"}
                        };
            
                        // Seleccionamos 5 juegos para ofertas
                        int[] indicesOfertas = {1, 3, 6, 8, 12}; // Red Dead, Minecraft, Elden Ring, Mario Odyssey, FIFA 24
                        
                        // Panel para las ofertas
                        JPanel panelOfertas = new JPanel();
                        panelOfertas.setLayout(new BoxLayout(panelOfertas, BoxLayout.Y_AXIS));
                        panelOfertas.setBackground(Color.BLACK);
                        panelOfertas.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
                        
                        for (int indice : indicesOfertas) {
                            String nombreJuego = todosJuegos[indice][0].toString();
                            String precioOriginal = todosJuegos[indice][1].toString();
                            
                            if (!precioOriginal.equals("Gratis")) {
                                // Calculamos precio con descuento (30% de descuento)
                                double precio = Double.parseDouble(precioOriginal.replace("$", "").replace(",", ""));
                                double precioConDescuento = precio * 0.7;
                                String precioOferta = String.format("$%,.2f", precioConDescuento);
                                
                                // Creamos panel para cada oferta - con borde amarillo
                                JPanel juegoPanel = new JPanel();
                                juegoPanel.setLayout(new BorderLayout());
                                juegoPanel.setBackground(new Color(30, 30, 30)); // Fondo oscuro
                                juegoPanel.setBorder(BorderFactory.createCompoundBorder(
                                    BorderFactory.createLineBorder(new Color(255, 215, 0), 2), // Borde amarillo dorado grueso
                                    BorderFactory.createEmptyBorder(8, 10, 8, 10)
                                ));
                                juegoPanel.setMaximumSize(new Dimension(270, 80));
                                
                                // Nombre del juego - amarillo claro
                                JLabel nombreLabel = new JLabel(nombreJuego);
                                nombreLabel.setForeground(new Color(255, 255, 150)); // Amarillo claro
                                nombreLabel.setFont(new Font("Arial", Font.BOLD, 12));
                                
                                // Panel de precios
                                JPanel precioPanel = new JPanel();
                                precioPanel.setLayout(new GridLayout(2, 1));
                                precioPanel.setBackground(new Color(30, 30, 30));
                                
                                // Precio original tachado
                                JLabel originalLabel = new JLabel("<html><strike>" + precioOriginal + "</strike></html>", SwingConstants.RIGHT);
                                originalLabel.setForeground(Color.GRAY);
                                
                                // Precio con descuento - amarillo brillante
                                JLabel ofertaLabel = new JLabel(precioOferta, SwingConstants.RIGHT);
                                ofertaLabel.setForeground(new Color(255, 215, 0)); // Amarillo dorado
                                ofertaLabel.setFont(new Font("Arial", Font.BOLD, 14));
                                
                                precioPanel.add(originalLabel);
                                precioPanel.add(ofertaLabel);
                                
                                // Etiqueta de descuento - amarillo neón
                                JLabel descuentoLabel = new JLabel("¡30% DE DESCUENTO!", SwingConstants.CENTER);
                                descuentoLabel.setForeground(new Color(255, 255, 0)); // Amarillo neón
                                descuentoLabel.setFont(new Font("Arial", Font.BOLD, 10));
                                
                                juegoPanel.add(nombreLabel, BorderLayout.NORTH);
                                juegoPanel.add(precioPanel, BorderLayout.CENTER);
                                juegoPanel.add(descuentoLabel, BorderLayout.SOUTH);
                                
                                panelOfertas.add(juegoPanel);
                                panelOfertas.add(Box.createRigidArea(new Dimension(0, 10)));
                            }
                        }
            
                        JScrollPane scrollPane = new JScrollPane(panelOfertas);
                        scrollPane.setBorder(null);
                        ofertasFrame.add(scrollPane, BorderLayout.CENTER);
                        
                        // Botón para regresar - estilo amarillo/negro
                        JButton regresarButton = new JButton("REGRESAR AL MENÚ");
                        regresarButton.setBackground(new Color(255, 215, 0)); // Amarillo dorado
                        regresarButton.setForeground(Color.BLACK);
                        regresarButton.setFont(new Font("Arial", Font.BOLD, 12));
                        regresarButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                        regresarButton.setFocusPainted(false);
                        regresarButton.addActionListener(ev -> {
                            ofertasFrame.dispose();
                            InFrame.setVisible(true);
                        });
                        
                        JPanel panelBoton = new JPanel();
                        panelBoton.setBackground(Color.BLACK);
                        panelBoton.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
                        panelBoton.add(regresarButton);
                        ofertasFrame.add(panelBoton, BorderLayout.SOUTH);
                        
                        ofertasFrame.setVisible(true);
                            }
                        });

                    //Listener para las m
                    mem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            InFrame.dispose(); // Cierra el menú actual
                            
                            // Crear el frame de membresías
                            JFrame membresiasFrame = new JFrame("Membresías Disponibles");
                            membresiasFrame.setSize(300, 500);
                            membresiasFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            membresiasFrame.getContentPane().setBackground(Color.BLACK);
                            membresiasFrame.setLayout(new BorderLayout());
                            
                            // Título de membresías con color morado
                            JLabel tituloLabel = new JLabel("MEMBRESÍAS PREMIUM", SwingConstants.CENTER);
                            tituloLabel.setForeground(new Color(170, 0, 255)); // Morado vibrante
                            tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));
                            tituloLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
                            membresiasFrame.add(tituloLabel, BorderLayout.NORTH);
                            
                            // Lista de membresías actualizada
                            Object[][] membresias = {
                                {"Xbox Game Pass Ultimate", "$299.00/mes", "Más de 100 juegos high-end"},
                                {"PlayStation Plus Deluxe", "$499.00/mes", "Catálogo Premium + clásicos"},
                                {"Nintendo Switch Online +", "$99.00/año", "DLCs incluidos + clásicos"},
                                {"EA Play Pro", "$249.00/mes", "Juegos EA desde lanzamiento"},
                                {"Ubisoft+ Premium", "$349.00/mes", "Todos los juegos Ubisoft"},
                                {"GeForce NOW Priority", "$249.00/mes", "Streaming en 1080p/60fps"}
                            };
                            
                            // Panel para las membresías
                            JPanel panelMembresias = new JPanel();
                            panelMembresias.setLayout(new BoxLayout(panelMembresias, BoxLayout.Y_AXIS));
                            panelMembresias.setBackground(Color.BLACK);
                            panelMembresias.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
                            
                            for (Object[] membresia : membresias) {
                                // Panel para cada membresía con estilo morado
                                JPanel membresiaPanel = new JPanel();
                                membresiaPanel.setLayout(new BorderLayout());
                                membresiaPanel.setBackground(new Color(30, 0, 40)); // Fondo morado oscuro
                                membresiaPanel.setBorder(BorderFactory.createCompoundBorder(
                                    BorderFactory.createLineBorder(new Color(150, 0, 220)), // Borde morado
                                    BorderFactory.createEmptyBorder(8, 12, 8, 12)
                                ));
                                membresiaPanel.setMaximumSize(new Dimension(270, 85));
                                
                                // Nombre de la membresía
                                JLabel nombreLabel = new JLabel(membresia[0].toString());
                                nombreLabel.setForeground(new Color(230, 150, 255)); // Morado claro
                                nombreLabel.setFont(new Font("Arial", Font.BOLD, 13));
                                
                                // Panel de información
                                JPanel infoPanel = new JPanel();
                                infoPanel.setLayout(new GridLayout(2, 1, 0, 3));
                                infoPanel.setBackground(new Color(30, 0, 40));
                                
                                // Precio
                                JLabel precioLabel = new JLabel("➤ " + membresia[1].toString());
                                precioLabel.setForeground(new Color(200, 100, 255)); // Morado medio
                                precioLabel.setFont(new Font("Arial", Font.BOLD, 12));
                                
                                // Beneficios
                                JLabel beneficiosLabel = new JLabel(membresia[2].toString());
                                beneficiosLabel.setForeground(new Color(180, 180, 255)); // Morado muy claro
                                beneficiosLabel.setFont(new Font("Arial", Font.PLAIN, 10));
                                
                                infoPanel.add(precioLabel);
                                infoPanel.add(beneficiosLabel);
                                
                                membresiaPanel.add(nombreLabel, BorderLayout.NORTH);
                                membresiaPanel.add(infoPanel, BorderLayout.CENTER);
                                
                                panelMembresias.add(membresiaPanel);
                                panelMembresias.add(Box.createRigidArea(new Dimension(0, 12))); // Espacio entre membresías
                            }
                            
                            JScrollPane scrollPane = new JScrollPane(panelMembresias);
                            scrollPane.setBorder(BorderFactory.createEmptyBorder());
                            scrollPane.getViewport().setBackground(Color.BLACK);
                            membresiasFrame.add(scrollPane, BorderLayout.CENTER);
                            
                            // Botón para regresar con estilo morado
                            JButton regresarButton = new JButton("Volver al Menú");
                            regresarButton.setBackground(new Color(100, 0, 150)); // Fondo morado oscuro
                            regresarButton.setForeground(Color.WHITE);
                            regresarButton.setFocusPainted(false);
                            regresarButton.setBorder(BorderFactory.createCompoundBorder(
                                BorderFactory.createLineBorder(new Color(170, 0, 255)),
                                BorderFactory.createEmptyBorder(5, 15, 5, 15)
                            ));
                            regresarButton.addActionListener(ev -> {
                                membresiasFrame.dispose();
                                InFrame.setVisible(true);
                            });
                            
                            JPanel panelBoton = new JPanel();
                            panelBoton.setBackground(Color.BLACK);
                            panelBoton.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
                            panelBoton.add(regresarButton);
                            membresiasFrame.add(panelBoton, BorderLayout.SOUTH);
                            
                            membresiasFrame.setVisible(true);
                        }
                    });

                    InFrame.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });

        InicioFrame.setVisible(true);
        frame.setVisible(false); // Ocultar la ventana principal al mostrar la de inicio de sesión

    }
});
        // Mostrar la ventana
        frame.setVisible(true);   
    }
}