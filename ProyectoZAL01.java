import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ProyectoZAL01  {
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
}
