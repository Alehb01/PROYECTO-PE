import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Proyect {
    public static void main(String[] args) {
        JFrame ventanita = new JFrame("PixelStore");
        ventanita.setSize(300, 300);
        ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanita.setLayout(null);

        ImageIcon icon = new ImageIcon("C:\\Github\\PROYECTO-PE\\icono.png"); // Ruta del icono
        ventanita.setIconImage(icon.getImage());

        ventanita.setVisible(true);
    }
}