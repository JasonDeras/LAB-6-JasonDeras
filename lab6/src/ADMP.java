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
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Peliculas t : listap) {
                bw.write(t.getCod() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
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
                    listap.add(new Peliculas(s.nextInt(), s.next(), s.nextInt()));
                }
            } catch (Exception e) {
            }
            s.close();
        }
    }
}


