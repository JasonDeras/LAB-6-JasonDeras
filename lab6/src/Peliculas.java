
import java.util.*;

public class Peliculas {

    private String nombre;
    private int duracion;
    private String categoria;
    private ArrayList actores = new ArrayList();
    private String director;
    private String productora;
    private String idioma;
    private String subtitulos;

    public Peliculas(String nombre, int duracion, String categoria, String director, String productora, String idioma, String subtitulos) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
        this.director = director;
        this.productora = productora;
        this.idioma = idioma;
        this.subtitulos = subtitulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList getActores() {
        return actores;
    }

    public void setActores(ArrayList actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", duracion=" + duracion + ", categoria=" + categoria + ", actores=" + actores + ", director=" + director + ", productora=" + productora + ", idioma=" + idioma + ", subtitulos=" + subtitulos + '}';
    }

}
