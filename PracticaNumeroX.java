import java.util.*;

public class PracticaNumeroX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        System.out.println("El numero: " + numero + " tiene " + Integer.toString(numero).length() + " cifras");

    }
}
