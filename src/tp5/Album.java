package tp5;

public class Album {
    private Integer publicacionAnio;
    private String titulo;
    private Artista artista;
    private Artista artistaInvitado;

    public Album() {
    }

    public Album(Integer publicacionAnio, String titulo, Artista artista) {
        this.publicacionAnio = publicacionAnio;
        this.titulo = titulo;
        this.artista = artista;
        this.artistaInvitado = null;
    }

    public Album(Integer publicacionAnio, String titulo, Artista artista, Artista artistaInvitado) {
        this.publicacionAnio = publicacionAnio;
        this.titulo = titulo;
        this.artista = artista;
        this.artistaInvitado = artistaInvitado;
    }

    public Integer getPublicacionAnio() {
        return publicacionAnio;
    }

    public void setPublicacionAnio(Integer publicacionAnio) {
        this.publicacionAnio = publicacionAnio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(Artista artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    @Override
    public String toString() {
        if (this.artistaInvitado == null) {
            return "Album{" +
                    "publicacionAnio=" + publicacionAnio +
                    ", titulo='" + titulo + '\'' +
                    ", artista=" + artista +
                    '}';


        }
        return "Album{" +
                "publicacionAnio=" + publicacionAnio +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                ", artistaInvitado=" + artistaInvitado +
                '}';
    }
}
