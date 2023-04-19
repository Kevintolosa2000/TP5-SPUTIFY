package tp5;

import java.util.ArrayList;

public class ListaBasica implements Reproduccion {
    private String nombreReproduccion;
    private ArrayList<Cancion> miLista;

    public ListaBasica() {
    }

    public ListaBasica(String nombre, ArrayList<Cancion> miLista) {
        this.nombreReproduccion = nombre;
        this.miLista = miLista;
    }

    public String getNombreReproduccion() {
        return nombreReproduccion;
    }

    public void setNombreReproduccion(String nombre) {
        this.nombreReproduccion = nombreReproduccion;
    }

    public ArrayList<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(ArrayList<Cancion> miLista) {
        this.miLista = miLista;
    }


    @Override
    public String reproducir() {
        if (miLista.isEmpty()) {
            return "esta vacia :(";
        }

        return this.miLista.get(0).getNombre();
    }

    @Override
    public String anadirCancion(Cancion c) {
        return "necesitas ser preimum";
    }

    @Override
    public String eliminarCancion(Cancion c) {
        return "necesitas ser preimum";
    }

    @Override
    public String verMiLista() {
        if (miLista.isEmpty()) {
            return "esta vacia :(";
        }
        this.miLista.forEach(miLista-> System.out.println(miLista.getNombre()));
        return "la viste? god";
    }

    @Override
    public Integer buscarCancion(String nombre) {
        return null;
    }
}
