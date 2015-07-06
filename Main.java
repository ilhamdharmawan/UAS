package TugasUAS;

/**
 * Created by Win7 on 7/6/2015.
 */
public class Main {

    public static void main(String[] args) {

//        Liga
        Liga Indonesia = new Liga("Indonesia");
        Liga Italy = new Liga("Italy");

//        Divisi Indonesia
        Divisi pertama = new Divisi ("Divisi Utama",Indonesia);
        Divisi satu = new Divisi ("Divisi Satu",Indonesia);
//        Set divisi
        Indonesia.setDaftarDivisi(pertama);
        Indonesia.setDaftarDivisi(satu);

//        Divisi Italy
        Divisi A = new Divisi ("Seri A", Italy);
        Divisi B = new Divisi ("Seri B", Italy);
//        Set divisi
        Italy.setDaftarDivisi(A);
        Italy.setDaftarDivisi(B);

//        Club Indonesia
        Club Arema = new Club("Arema Indonesia",pertama,Indonesia);
        Club Bandung = new Club("Bandung Raya",pertama,Indonesia);
        Club Persebaya = new Club("Persebaya Surabaya",satu,Indonesia);
        Club Cilegon = new Club("Cilegon United",satu,Indonesia);
//        Set Club Indonesia
        pertama.setDaftarClub(Arema);
        pertama.setDaftarClub(Bandung);
        satu.setDaftarClub(Persebaya);
        satu.setDaftarClub(Cilegon);

//        Club Italy
        Club Atlanta = new Club("Atlanta Bergamasca Calcio", A, Italy);
        Club Inter = new Club("Inter Milan", A, Italy);
        Club Juve = new Club("Juventu FC", B, Italy);
        Club Milan = new Club("Milan", B, Italy);
//        Set Club Italy
        A.setDaftarClub(Atlanta);
        A.setDaftarClub(Inter);
        B.setDaftarClub(Juve);
        B.setDaftarClub(Milan);

        System.out.println("No 1");
        System.out.println(" Divisi dari 'Liga INDONESIA' adalah ");
        Indonesia.getDaftarDivisi("Indonesia");
        System.out.println(" Divisi dari 'Liga ITALY' adalah");
        Italy.getDaftarDivisi("Italy");
        System.out.println();

        System.out.println("No 2");
        System.out.println(" Club dari 'Liga Indonesia' ");
        pertama.getDaftarClubbyLiga("Indonesia");
        System.out.println();
        System.out.println(" Club dari 'Liga Italy' ");
        A.getDaftarClubbyLiga("Italy");
        System.out.println();

        System.out.println("No 3");
        System.out.println(" Club dari Divisi 'Liga Indonesia Satu' ");
        pertama.getDaftarClubbyDivisi("Divisi Utama");
        System.out.println(" Club dari Divisi 'Liga Italy' ");
        A.getDaftarClubbyDivisi("Seri A");
        System.out.println();

        System.out.println("No 4");
        System.out.println(" Club 'Arema Indonesia' berada di Divisi");
        Arema.getDivisi("Arema Indonesia");
        System.out.println(" Club 'Juventus FC' berada di Divisi");
        Juve.getDivisi("Juventus FC");
        System.out.println();

        System.out.println("No 5");
        System.out.println(" Club 'Bandung Raya' berada di Liga");
        Bandung.getLiga("Bandung Raya");
        System.out.println(" Club 'Inter Milan' berada di Liga");
        Milan.getLiga("Milan");
        System.out.println();
    }
}
