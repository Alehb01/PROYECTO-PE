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
      
        etiqueta_2.setBounds(40, 70, 200,30);
        etiqueta_3.setBounds(40, 70, 200,30);
       
     
        frame.add(etiqueta_3);
 

        //hacer la ventana visible
        frame.setVisible(true);

    
    }
}