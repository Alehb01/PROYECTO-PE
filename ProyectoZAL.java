import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProyectoZAL {
    public static void main (String [] args) {
        JFrame frame = new JFrame("Agenda de contactos");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//poder salir del JFrame
       

        frame.setLayout(null);

 
        JLabel etiqueta_2 = new JLabel("Nombre completo: ");
        JLabel etiqueta_3 = new JLabel("Teléfono: ");
        JTextField texto_1 = new JTextField();
        JTextField texto_2 = new JTextField();
        JButton boton1 = new JButton("Agregar contacto");
        JButton boton2 = new JButton("Editar contacto");
      
        etiqueta_2.setBounds(0, 10, 200,30);
        etiqueta_3.setBounds(0, 50, 200,30);
        texto_1.setBounds(220, 10, 200, 30);
        texto_2.setBounds(220, 50, 200, 30);
        boton1.setBounds(150, 85, 200, 30);
        boton2.setBounds(150, 115, 200, 30);
       
        frame.add(etiqueta_2);
        frame.add(etiqueta_3);
        frame.add(texto_1);
        frame.add(texto_2);
        frame.add(boton1);
        frame.add(boton2);
 

        //hacer la ventana visible
        frame.setVisible(true);

    
    }
}