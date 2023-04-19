package tp5;

public class Cancion {
    private String nombre;
    private String duracion;
    private Artista artista;
    private Album album;
    private Genero genero;

    public Cancion() {
    }


    public Cancion(String nombre, String duracion, Artista artista, Album album, Genero genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion='" + duracion + '\'' +
                ", artista=" + artista +
                ", album=" + album +
                ", genero=" + genero.getName() +
                '}';
    }

}
