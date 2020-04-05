package Clases;

/**
 *
 * @author CLAROS
 */
public class MensajeOP {

    //Creacion de objs de las Clases, Pasando los valores (a,b), (a,b,c) independientemente
    private CA CA = new CA(10, 8);
    private CA CA_CB = new CB(2, 1, 8);
    private CD CD = new CD(2, 2);

    //Funcion de devuelve las operaciones haciendo uso de interface
    public String MensajeOP() {
        String s = "10 + 8 = " + CA.sumandoAB() + "\n"
                + "10 x 8 es = " + CA.Multiplicacion() + "\n"
                + "2 + 2 = " + CD.sumandoOBj() + "\n"
                + "2 + 1 + 8 = " + CA_CB.sumandoAB() + "\n"
                + "-----------------------------------------\n"
                + "N° > de 10 y 8 es: " + CA.NMayor() + "\n"
                + "-----------------------------------------";
        return s;
    }
}
