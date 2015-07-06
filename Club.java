package TugasUAS;

/**
 * Created by Win7 on 7/6/2015.
 */
public class Club {
    private String namaClub;
    private Divisi divisi;
    private Liga liga;

    public Club(String namaClub, Divisi divisi, Liga liga) {
        this.namaClub = namaClub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public String getNamaClub() {
        return namaClub;
    }
    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }
    //Soal Nomer 4
    public void getDivisi(String club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarClub.size(); c++){
                a.daftarClub.get(c);
                Club i = a.daftarClub.get(c);
                if (club == i.getNamaClub()){
                    System.out.println(a.getNamaDivisi());
                }
            }
        }
    }
    public void setDivisi (Divisi divisi) {this.divisi = divisi; }

    //Soal nomer 5
    public void getLiga (String club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarClub.size(); c++){
                a.daftarClub.get(c);
                Club i = a.daftarClub.get(c);
                if (club == i.getNamaClub()){
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }
    public void setLiga(Liga liga) {this.liga = liga; }

    @Override
    public String toString() {
        return "Club :" +namaClub;
    }
}
