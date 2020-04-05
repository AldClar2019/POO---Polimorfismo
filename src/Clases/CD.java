package Clases;

/**
 *
 * @author CLAROS
 */
import Interface.CC;

public class CD extends CC {

    private int a;
    private int b;
    private int sumaAB;

    public CD(int A, int B) {
        this.a = B;
        this.b = B;
    }
    //Sumando datos obtenidos

    @Override
    public int sumandoOBj() {
        setSumaAB(getObtenerA() + getObtenerB());
        return getSumaAB();
    }

    /**
     * @return the a
     */
    public int getObtenerA() {
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
    public int getObtenerB() {
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

}
