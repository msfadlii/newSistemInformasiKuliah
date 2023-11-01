package Node;

import Model.ModelJurusan;
import java.util.ArrayList;

public class NodeMahasiswa extends Manusia{
    String npm;
    ModelJurusan jurusan;
    public ArrayList<NodeMahasiswa> arrMhs;
    
    public NodeMahasiswa(String npm, String nama, String no_telp, ModelJurusan jurusan) {
        this.npm = npm;
        this.nama = nama;
        this.no_telp = no_telp;
        this.jurusan = jurusan;
    }
    
    public NodeMahasiswa(){
        arrMhs = new ArrayList<>();
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public ModelJurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(ModelJurusan jurusan) {
        this.jurusan = jurusan;
    }

    public ArrayList<NodeMahasiswa> getArrMhs() {
        return arrMhs;
    }

    public void setArrMhs(ArrayList<NodeMahasiswa> arrMhs) {
        this.arrMhs = arrMhs;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
    
    
    
}
