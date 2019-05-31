
import java.util.*;

public class Series {

    private String nombre;
    private int duracion;
    private String categoria;
    private ArrayList actores = new ArrayList();
    private int temporadoas;
    private String productora;
    private String idioma;
    private String doblaje;
    private String subtitulos;

    public Series(String nombre, int duracion, String categoria, int temporadoas, String productora, String idioma, String doblaje, String subtitulos) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
        this.temporadoas = temporadoas;
        this.productora = productora;
        this.idioma = idioma;
        this.doblaje = doblaje;
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

    public int getTemporadoas() {
        return temporadoas;
    }

    public void setTemporadoas(int temporadoas) {
        this.temporadoas = temporadoas;
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

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\n duracion=" + duracion + "\n categoria=" + categoria + "\n actores=" + actores + "\n temporadoas=" + temporadoas + "\n productora=" + productora + "\n idioma=" + idioma + "\n doblaje=" + doblaje + "\n subtitulos=" + subtitulos + '}';
    }

}
