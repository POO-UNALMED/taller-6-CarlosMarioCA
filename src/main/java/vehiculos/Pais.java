package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author SAM
 */
public class Pais {
    
    private String nombre;
    protected static ArrayList<Pais> listado = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        this.listado.add(this);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
