package Model;

import Node.NodeJurusan;
import Node.NodeMahasiswa;

public class ModelMahasiswa {
    NodeMahasiswa nMhs = new NodeMahasiswa();
    
    public void insertMahasiswa(String npm, String nama, String no_telp, NodeJurusan jurusan){
        this.nMhs.arrMhs.add(new NodeMahasiswa(npm, nama, no_telp, jurusan));
    }
    
    public void updateMahasiswa(String npm, String new_nama, String new_jurusan, String new_telp){
        for (int i = 0; i < nMhs.arrMhs.size(); i++) {
            if(npm.equals(nMhs.arrMhs.get(i).getNpm())){
                nMhs.arrMhs.get(i).setNama(new_nama);
                nMhs.arrMhs.get(i).setJurusan(new_jurusan);
                nMhs.arrMhs.get(i).setNo_telp(new_telp);
            }
        }
    }
    
    public void deleteMahasiswa(String npm){
        for (int i = 0; i < nMhs.arrMhs.size(); i++) {
            if(npm.equals(nMhs.arrMhs.get(i).getNpm())){
                nMhs.arrMhs.remove(i);
            }
        }
    }
    
    public void viewAllMahasiswa(){
        for (int i = 0; i < nMhs.arrMhs.size(); i++) {
            nMhs.arrMhs.get(i).viewMahasiswa();
            System.out.println("-----------------");
        }
    }
}
