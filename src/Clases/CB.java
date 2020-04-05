package Clases;

/**
 *
 * @author CLAROS
 */
public class CB extends CA {

    private int z;

    public CB() {
        z = 0;
    }

    public CB(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    //Sumando datos
    @Override
    public int sumandoAB() {
        return getA() + getB() + getZ();
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }

}
