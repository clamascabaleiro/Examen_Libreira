package ejemplolibreria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Io {

    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;

    public static int introducir(int opcion) {

        Scanner ler = new Scanner(System.in);
        int numero = 0;
        switch (opcion) {
            case CONSOLA:
                System.out.println("introduzca num");
                numero = ler.nextInt();
                return numero;

            case VENTANA:
                Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca numero"));
                return numero;

            default:
                JOptionPane.showInputDialog("Opción incorrecta");
        }
        return numero;

    }

    public static int introducir(int opcion, String msg) {

        Scanner ler = new Scanner(System.in);
        int numero = 0;
        switch (opcion) {
            case CONSOLA:
                System.out.println(msg);
                numero = ler.nextInt();
                return numero;

            case VENTANA:
                Integer.parseInt(JOptionPane.showInputDialog(null, msg));
                return numero;

            default:
                JOptionPane.showInputDialog("Opción incorrecta");
        }
        return numero;
    }

    public static int imprimir(int opcion, int numero) {
        switch (opcion) {
            case 1:
                System.out.println(numero);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, numero);
                break;
            default:
                JOptionPane.showInputDialog("opcion incorrecta");
        }
        return numero;
    }
}
