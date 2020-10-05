package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author SAM
 */
public class Camioneta extends Vehiculo {

    private boolean volco;
    protected static ArrayList<Vehiculo> listado = new ArrayList<>();


    public Camioneta(String placa,int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        this.listado.add(this);
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

}
