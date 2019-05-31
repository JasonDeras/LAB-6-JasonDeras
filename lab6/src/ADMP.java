
import java.io.*;
import java.util.*;

public class ADMP {

    private ArrayList<Peliculas> listap = new ArrayList();
    private File archivo = null;

    public ADMP(String path) {
        archivo = new File(path);
    }

    public ArrayList<Peliculas> getListap() {
        return listap;
    }

    public void setListap(ArrayList<Peliculas> listap) {
        this.listap = listap;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ADMP{" + "listap=" + listap + '}';
    }

    public void setPersona(Peliculas p) {
        this.listap.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Peliculas t : listap) {
                bw.write(t.getCategoria() + ";");
                bw.write(t.getDirector() + ";");
                bw.write(t.getDuracion() + "min;");
                bw.write(t.getIdioma() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getProductora() + ";");
                bw.write(t.getSubtitulos() + ";");
                for (int i = 0; i < t.getActores().size(); i++) {
                    bw.write(t.getActores().get(i) + ",");
                }
                bw.write(";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner s = null;
        listap = new ArrayList();
        if (archivo.exists()) {
            try {
                s = new Scanner(archivo);
                s.useDelimiter(";");
                while (s.hasNext()) {
                    listap.add(new Peliculas(s.next(), s.nextInt(), s.next(), s.next(), s.next(), s.next(), s.next(), s.next()));
                }
            } catch (Exception e) {
            }
            s.close();
        }
    }
}
