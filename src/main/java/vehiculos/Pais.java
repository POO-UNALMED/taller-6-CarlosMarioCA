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
    
    public static Pais paisMasVendedor(){
        Pais masVendedor = null;
        int contador;
        int maxVentas = 0;
        for(int i = 0; i < listado.size(); i++){
            contador = 0;
            Pais actual = listado.get(i);
            for(int j = 0; j < listado.size(); j++){
                Pais compare = listado.get(j);
                if(actual.nombre == compare.nombre){
                    contador++;
                }
            }
            if(contador >= maxVentas){
                maxVentas = contador;
                masVendedor = listado.get(i);
            }
        }
        return masVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void aduana(){
        
    }
    
}
