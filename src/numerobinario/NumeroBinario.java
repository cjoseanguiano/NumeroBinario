/*
12. Dado un número mostrar su valor en binario.
 */
package numerobinario;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroBinario {

    public static int valorMenu;

    public static void main(String[] args) {
        int num_convertir;
        num_convertir = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero de secuencia"));
        menuPrograma();

        switch (valorMenu) {
            case 1:
                JOptionPane.showMessageDialog(null, "Valor Binario " + Integer.toBinaryString(num_convertir));

                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Valor Hexadecimal " + Integer.toHexString(num_convertir));

                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Valor Octal " + Integer.toOctalString(num_convertir));
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingresa un valor correcto");
                break;
        }

    }

    public static void menuPrograma() {
        valorMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor\n"
                + "1.- Convertir a Binario\n "
                + "2.- Convertir a Hexadecimal \n "
                + "3.- Convertir a Octal \n "
                + "4.- Salir"));

    }

}
