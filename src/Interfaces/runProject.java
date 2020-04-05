package Interfaces;

/**
 *
 * @author CLAROS
 */
import Clases.*;
import java.util.*;
import javax.swing.JOptionPane;

public class runProject {

    public static void main(String[] args) {
        String xy = "";
        //Creando obj para mostrar funciones de interface
        MensajeOP msj = new MensajeOP();
        //Creacion de array para ClaseCA
        ArrayList<CA> CAClass = new ArrayList<>();
        CAClass.add(new CA(11, 22));
        CAClass.add(new CA(99, 77));
        CAClass.add(new CA(66, 44));
        Collections.sort(CAClass);
        xy = CAClass.stream().map((sc) -> "||          " + sc.a + "          |          " + sc.b + "          ||\n").reduce(xy, String::concat);
        JOptionPane.showMessageDialog(null, "||           X           |           Y           ||\n" + xy, "Valores odernados de mayor a menor", JOptionPane.WARNING_MESSAGE);
        //Mostrando suma, multiplicacion y valor mayor  de las Clases
        JOptionPane.showMessageDialog(null, msj.MensajeOP(), "Datos obtenidos", JOptionPane.WARNING_MESSAGE);
    }
}
