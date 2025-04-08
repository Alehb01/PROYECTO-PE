import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ProyectoZAL01  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pixel Store");
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);//agregar color al JFrame
        frame.setLayout(null);

        ImageIcon imag = new ImageIcon("C:\\xampp\\htdocs\\Joan2docuatri\\imag\\icontienda.png");
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
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana de registro
                JFrame registroFrame = new JFrame("Registro");
                registroFrame.setSize(300, 500);
                registroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                registroFrame.getContentPane().setBackground(Color.BLACK);
                registroFrame.setLayout(null);

                ImageIcon imag = new ImageIcon("C:\\xampp\\htdocs\\Joan2docuatri\\imag\\icontienda.png");
                JLabel etiquetaimagen= new JLabel(imag);

                     //agregar imagen al JFrame
                      registroFrame.add(etiquetaimagen);
                      registroFrame.setLayout(null);

                      JLabel mensLabel = new JLabel("Registrate en Pixel Store"); 
                      mensLabel.setForeground(Color.WHITE);
                      mensLabel.setBounds(65, 90, 150, 150); 

                      registroFrame.add(mensLabel);
                      

                JLabel EmailLabel = new JLabel("Email:");
                JLabel ContraLabel = new JLabel("Contraseña:");
                JLabel NomusuLabel = new JLabel("Usuario:");

                JTextField EmailField = new JTextField();
                JTextField ContraField = new JTextField();
                JTextField NomusuField = new JTextField();

                EmailLabel.setForeground(Color.WHITE); 
                ContraLabel.setForeground(Color.WHITE);  
                NomusuLabel.setForeground(Color.WHITE);

                JButton registrarButton = new JButton("Registrar");

                // Posiciones de los componentes de la ventana de registro
                EmailLabel.setBounds(30, 200, 80, 25);
                EmailField.setBounds(100, 200, 150, 25);
                ContraLabel.setBounds(30, 250, 80, 25);
                ContraField.setBounds(100, 250, 150, 25);
                NomusuLabel.setBounds(30, 300, 80, 25);
                NomusuField.setBounds(100, 300, 150, 25);
                registrarButton.setBounds(80, 350, 120, 30);
                etiquetaimagen.setBounds(90,30, 100, 100);

                // Agregar los componentes a la ventana de registro
                registroFrame.add(EmailLabel);
                registroFrame.add(ContraLabel);
                registroFrame.add(NomusuLabel);
                registroFrame.add(EmailField);
                registroFrame.add(ContraField);
                registroFrame.add(NomusuField);
                registroFrame.add(registrarButton);
                
                // Acción del botón "Registrar" para volver a la ventana principal
                registrarButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Cerrar la ventana de registro
                        registroFrame.dispose();

                        // Mostrar nuevamente la ventana principal
                        frame.setVisible(true);
                    }
                });

                // Mostrar la ventana de registro
                registroFrame.setVisible(true);
            }
        });

        // Acción del botón "Iniciar sesión"
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana de registro
                JFrame InicioFrame = new JFrame("Inicio de Sesión");
                InicioFrame.setSize(300, 500);
                InicioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                InicioFrame.getContentPane().setBackground(Color.BLACK);
                InicioFrame.setLayout(null);

                ImageIcon imag = new ImageIcon("C:\\xampp\\htdocs\\Joan2docuatri\\imag\\icontienda.png");
                JLabel etiquetaimagen= new JLabel(imag);

                   //agregar imagen al JFrame
                      InicioFrame.add(etiquetaimagen);
                      InicioFrame.setLayout(null);

                      JLabel inLabel = new JLabel("Pixel Store"); 
                      inLabel.setForeground(Color.WHITE);
                      inLabel.setBounds(120, 20, 150, 150); 
                      InicioFrame.add(inLabel);

                JLabel UsuaLabel = new JLabel("Usuario:");
                JLabel CtraLabel = new JLabel("Contraseña:");
             
                JTextField UsuaField = new JTextField();
                JTextField CtraField = new JTextField();

                UsuaLabel.setForeground(Color.WHITE); 
                CtraLabel.setForeground(Color.WHITE); 

                JButton IniciarSButton = new JButton("Iniciar");

                // Posiciones de los componentes de la ventana de registro
                UsuaLabel.setBounds(30, 150, 80, 25);
                UsuaField.setBounds(100, 150, 150, 25);
                CtraLabel.setBounds(30, 200, 80, 25);
                CtraField.setBounds(100, 200, 150, 25);
                IniciarSButton.setBounds(80, 300, 120, 30);
                etiquetaimagen.setBounds(15,30, 100, 100);

                // Agregar los componentes a la ventana de inicios
                InicioFrame.add(UsuaLabel);
                InicioFrame.add(CtraLabel);
                InicioFrame.add(UsuaField);
                InicioFrame.add(CtraField);
                InicioFrame.add(IniciarSButton);

                // Funcionalidad del botón Iniciar
                IniciarSButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Cerrar la ventana de inicio de sesión
                        InicioFrame.dispose();
                    }
                });

                        IniciarSButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Abrir la ventana de registro
                                JFrame InFrame = new JFrame("Inicio de Sesión");
                                InFrame.setSize(300, 500);
                                InFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                InFrame.getContentPane().setBackground(Color.BLACK);
                                InFrame.setLayout(null);
                
                                ImageIcon imag = new ImageIcon("C:\\xampp\\htdocs\\Joan2docuatri\\imag\\icontienda.png");
                                JLabel etiquetaimagen= new JLabel(imag);

                                JLabel nLabel = new JLabel("Pixel Store"); 
                                nLabel.setForeground(Color.WHITE);
                                nLabel.setBounds(110, 0, 150, 150); 
                                InFrame.add(nLabel);
                
                                   //agregar imagen al JFrame
                                      InFrame.add(etiquetaimagen);
                                      InFrame.setLayout(null);
                
                                JButton catalogo = new JButton("Catalogo");
                                JButton ofer = new JButton("Oferta");
                                JButton mem = new JButton("Membresias");
                
                                // Posiciones de los componentes de la ventana de registro
                                catalogo.setBounds(0, 120, 100, 30);
                                ofer.setBounds(90, 120, 90, 30);
                                mem.setBounds(180, 120, 110, 30);
                                etiquetaimagen.setBounds(10,20, 100, 100);
                
                                // Agregar los componentes a la ventana de inicios
                                InFrame.add(catalogo);
                                InFrame.add(ofer);
                                InFrame.add(mem);
                                // Mostrar la ventana de inicios
                                InFrame.setVisible(true);
                            }
                        });
                        
                        IniciarSButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Abrir la ventana de registro
                                JFrame InFrame = new JFrame("Inicio de Sesión");
                                InFrame.setSize(300, 500);
                                InFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                InFrame.getContentPane().setBackground(Color.BLACK);
                                InFrame.setLayout(null);
                
                                ImageIcon imag = new ImageIcon("C:\\xampp\\htdocs\\Joan2docuatri\\imag\\icontienda.png");
                                JLabel etiquetaimagen= new JLabel(imag);
                
                                   //agregar imagen al JFrame
                                      InFrame.add(etiquetaimagen);
                                      InFrame.setLayout(null);
                
                                JButton catalogo = new JButton("Catalogo de Juegos");
                                JButton ofer = new JButton("Juegos en oferta");
                                JButton mem = new JButton("Membresias");
                
                                // Posiciones de los componentes de la ventana de registro
                                catalogo.setBounds(10, 100, 120, 30);
                                ofer.setBounds(10, 200, 120, 30);
                                mem.setBounds(80, 300, 120, 30);
                                etiquetaimagen.setBounds(90,30, 100, 100);
                
                                // Agregar los componentes a la ventana de inicios
                                InFrame.add(catalogo);
                                InFrame.add(ofer);
                                InFrame.add(mem);
                                // Mostrar la ventana de inicios
                                InFrame.setVisible(true);
                            }
                        });

                         IniciarSButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Abrir la ventana de registro
                                JFrame InFrame = new JFrame("Inicio de Sesión");
                                InFrame.setSize(300, 500);
                                InFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                InFrame.getContentPane().setBackground(Color.BLACK);
                                InFrame.setLayout(null);
                
                                ImageIcon imag = new ImageIcon("C:\\xampp\\htdocs\\Joan2docuatri\\imag\\icontienda.png");
                                JLabel etiquetaimagen= new JLabel(imag);
                
                                   //agregar imagen al JFrame
                                      InFrame.add(etiquetaimagen);
                                      InFrame.setLayout(null);
                
                                JButton catalogo = new JButton("Catalogo");
                                JButton ofer = new JButton("Oferta");
                                JButton mem = new JButton("Membresias");
                
                                // Posiciones de los componentes de la ventana de registro
                                catalogo.setBounds(0, 120, 100, 30);
                                ofer.setBounds(90, 120, 90, 30);
                                mem.setBounds(180, 120, 110, 30);
                                etiquetaimagen.setBounds(90,30, 100, 100);
                
                                // Agregar los componentes a la ventana de inicios
                                InFrame.add(catalogo);
                                InFrame.add(ofer);
                                InFrame.add(mem);
                                // Mostrar la ventana de inicios
                                InFrame.setVisible(true);
                            }
                        });

                // Mostrar la ventana de inicios
                InicioFrame.setVisible(true);
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);     
    }
}


/*public class ProyectoZAL01  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tienda de videojuegos");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Lista para almacenar los contactos
        ArrayList<String> contactos = new ArrayList<>();

        // Componentes
        JLabel etiqueta_2 = new JLabel("Nombre completo: ");
        JLabel etiqueta_3 = new JLabel("Teléfono: ");
        JTextField texto_1 = new JTextField();
        JTextField texto_2 = new JTextField();
        JButton boton1 = new JButton("Agregar contacto");
        JButton boton2 = new JButton("Mostrar contactos");

        // Posiciones de los componentes
        etiqueta_2.setBounds(20, 10, 150, 30);
        etiqueta_3.setBounds(20, 50, 150, 30);
        texto_1.setBounds(180, 10, 250, 30);
        texto_2.setBounds(180, 50, 250, 30);
        boton1.setBounds(150, 100, 200, 30);
        boton2.setBounds(150, 150, 200, 30);

        // Agregar componentes al frame
        frame.add(etiqueta_2);
        frame.add(etiqueta_3);
        frame.add(texto_1);
        frame.add(texto_2);
        frame.add(boton1);
        frame.add(boton2);

        // Acción del botón "Agregar contacto"
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = texto_1.getText().trim();
                String telefono = texto_2.getText().trim();

                if (!nombre.isEmpty() && !telefono.isEmpty()) {
                    contactos.add(nombre + " - " + telefono);
                    JOptionPane.showMessageDialog(frame, "Contacto agregado correctamente.");
                    texto_1.setText(""); // Limpiar campo
                    texto_2.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese todos los datos.");
                }
            }
        });

        // Acción del botón "Mostrar contactos"
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (contactos.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "No hay contactos guardados.");
                } else {
                    StringBuilder lista = new StringBuilder("Lista de Contactos:\n");
                    for (String contacto : contactos) {
                        lista.append(contacto).append("\n");
                    }
                    JOptionPane.showMessageDialog(frame, lista.toString());
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}*/
