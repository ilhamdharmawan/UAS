package TugasUAS;

import java.util.ArrayList;

/**
 * Created by Win7 on 7/6/2015.
 */
public class Divisi {
    private String namaDivisi;
    private Liga liga;
    ArrayList<Club> daftarClub = new ArrayList<Club>();

    public Divisi(String namaDivisi, Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public ArrayList<Club> getDaftarClub() {
        return daftarClub;
    }

    public void setDaftarClub(Club club) {
        this.daftarClub.add(club);
    }

//  Soal No 2
    public void getDaftarClubbyLiga(String namaliga) {
        if (namaliga == liga.getNamaLiga()) {
            for (int d = 0; d < liga.daftarDivisi.size(); d++) {
                Divisi a = liga.daftarDivisi.get(d);
                System.out.println(a.getNamaDivisi());
                for (int c = 0; c < daftarClub.size(); c++) {
                    System.out.println(a.daftarClub.get(c));
                }
            }
        } else {
            System.out.println("Tidak Ada Club di Liga ini ");
        }
    }
    //Soal Nomer 3
    public void getDaftarClubbyDivisi(String namadivisi){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            if (namadivisi == a.getNamaDivisi()){
                for (int c = 0; c < daftarClub.size(); c++){
                    System.out.println(a.daftarClub.get(c));
                }
            }
        }
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(0);
            Divisi b = liga.daftarDivisi.get(1);
            if (namadivisi != b.getNamaDivisi()){
                if (namadivisi != a.getNamaDivisi()){
                    System.out.println("Tidak Ditemukan Club");
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Divisi :"+ namaDivisi;
    }
}

