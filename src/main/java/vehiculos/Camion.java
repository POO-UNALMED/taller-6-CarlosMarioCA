package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author SAM
 */
public class Camion extends Vehiculo {

    private int ejes;
    protected static ArrayList<Vehiculo> listado = new ArrayList<>();

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        this.listado.add(this);
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}
