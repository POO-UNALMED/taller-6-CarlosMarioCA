package vehiculos;

import java.util.ArrayList;
import static vehiculos.Pais.listado;

/**
 *
 * @author SAM
 */
public class Fabricante {

    private String nombre;
    Pais pais;
    protected static ArrayList<Fabricante> listado = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante masVendedor = null;
        int contador;
        int maxVentas = 0;
        for (int i = 0; i < listado.size(); i++) {
            contador = 0;
            Fabricante actual = listado.get(i);
            for (int j = 0; j < listado.size(); j++) {
                contador = 0;
                Fabricante compare = listado.get(j);
                if (actual == compare) {
                    contador++;
                }
            }
            if (contador > maxVentas) {
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
