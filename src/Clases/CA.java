package Clases;

/**
 *
 * @author CLAROS
 */
import Interface.*;

public class CA implements IA, IB, IC, Comparable<CA> {

    public int a;
    public int b;
    private int sumaAB;
    private int MultiplicacionAB;

    //Requerimiento de la ClaseCB
    public CA() {
        a = 0;
        b = 0;
    }

    public CA(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public int sumandoAB() {
        setSumaAB(getA() + getB());
        return getSumaAB();
    }

    @Override
    public int Sumar() {
        setSumaAB(getA() + getB());
        return getSumaAB();
    }

    @Override
    public int Multiplicacion() {
        setMultiplicacionAB((getA()) * (getB()));
        return getMultiplicacionAB();

    }

    @Override
    public int NMayor() {
        return Math.max(getA(), getB());
    }

    //Comparando clase
    @Override
    public int compareTo(CA t) {
        return getA() == t.getA() ? 1 : getA() > t.getA() ? -1 : 0;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the sumaAB
     */
    public int getSumaAB() {
        return sumaAB;
    }

    /**
     * @param sumaAB the sumaAB to set
     */
    public void setSumaAB(int sumaAB) {
        this.sumaAB = sumaAB;
    }

    /**
     * @return the MultiplicacionAB
     */
    public int getMultiplicacionAB() {
        return MultiplicacionAB;
    }

    /**
     * @param MultiplicacionAB the MultiplicacionAB to set
     */
    public void setMultiplicacionAB(int MultiplicacionAB) {
        this.MultiplicacionAB = MultiplicacionAB;
    }
}
