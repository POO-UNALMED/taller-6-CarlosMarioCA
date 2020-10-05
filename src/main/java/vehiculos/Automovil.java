package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author SAM
 */
public class Automovil extends Vehiculo {

    private int asientos;
    protected static ArrayList<Vehiculo> listado = new ArrayList<>();

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int asientos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.asientos = asientos;
        this.listado.add(this);
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

}
