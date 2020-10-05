package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author SAM
 */
public class Fabricante {
    
    private String nombre;
    private Pais pais;
    protected static ArrayList<Vehiculo> listado = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}
